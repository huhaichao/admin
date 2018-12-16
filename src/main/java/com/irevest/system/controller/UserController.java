/*     */ package com.irevest.system.controller;
/*     */ 
/*     */ import com.irevest.common.annotation.Log;
/*     */ import com.irevest.common.config.Constant;
/*     */ import com.irevest.common.controller.BaseController;
/*     */ import com.irevest.common.domain.Tree;
/*     */ import com.irevest.common.service.DictService;
/*     */ import com.irevest.common.utils.MD5Utils;
/*     */ import com.irevest.common.utils.PageUtils;
/*     */ import com.irevest.common.utils.Query;
/*     */ import com.irevest.common.utils.R;
/*     */ import com.irevest.niu.domain.BusinessDO;
/*     */ import com.irevest.niu.service.BusinessService;
/*     */ import com.irevest.system.domain.DeptDO;
/*     */ import com.irevest.system.domain.RoleDO;
/*     */ import com.irevest.system.domain.UserDO;
/*     */ import com.irevest.system.service.RoleService;
/*     */ import com.irevest.system.service.UserService;
/*     */ import com.irevest.system.vo.UserVO;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import javax.servlet.http.HttpServletRequest;
/*     */ import org.apache.shiro.authz.annotation.RequiresPermissions;
/*     */ import org.springframework.beans.factory.annotation.Autowired;
/*     */ import org.springframework.stereotype.Controller;
/*     */ import org.springframework.ui.Model;
/*     */ import org.springframework.web.bind.annotation.GetMapping;
/*     */ import org.springframework.web.bind.annotation.PathVariable;
/*     */ import org.springframework.web.bind.annotation.PostMapping;
/*     */ import org.springframework.web.bind.annotation.RequestMapping;
/*     */ import org.springframework.web.bind.annotation.RequestParam;
/*     */ import org.springframework.web.bind.annotation.ResponseBody;
/*     */ import org.springframework.web.multipart.MultipartFile;
/*     */ 
/*     */ @RequestMapping({"/sys/user"})
/*     */ @Controller
/*     */ public class UserController extends BaseController
/*     */ {
/*  41 */   private String prefix = "system/user";
/*     */   @Autowired
/*     */   UserService userService;
/*     */   @Autowired
/*     */   RoleService roleService;
/*     */   @Autowired
/*     */   DictService dictService;
/*     */   @Autowired
/*     */   BusinessService businessService;
/*     */   
/*     */   @RequiresPermissions({"sys:user:user"})
/*     */   @GetMapping({""})
/*  53 */   String user(Model model) { return this.prefix + "/user"; }
/*     */   
/*     */ 
/*     */   @GetMapping({"/list"})
/*     */   @ResponseBody
/*     */   PageUtils list(@RequestParam Map<String, Object> params)
/*     */   {
/*  60 */     Query query = new Query(params);
/*  61 */     List<UserDO> sysUserList = this.userService.list(query);
/*  62 */     int total = this.userService.count(query);
/*  63 */     PageUtils pageUtil = new PageUtils(sysUserList, total);
/*  64 */     return pageUtil;
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:add"})
/*     */   @Log("添加用户")
/*     */   @GetMapping({"/add"})
/*     */   String add(Model model) {
/*  71 */     List<RoleDO> roles = this.roleService.list();
/*  72 */     model.addAttribute("roles", roles);
/*  73 */     return this.prefix + "/add";
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:edit"})
/*     */   @Log("编辑用户")
/*     */   @GetMapping({"/edit/{id}"})
/*     */   String edit(Model model, @PathVariable("id") Long id) {
/*  80 */     UserDO userDO = this.userService.get(id);
/*  81 */     model.addAttribute("user", userDO);
/*  82 */     List<RoleDO> roles = this.roleService.list(id);
/*  83 */     model.addAttribute("roles", roles);
/*  84 */     return this.prefix + "/edit";
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:add"})
/*     */   @Log("保存用户")
/*     */   @PostMapping({"/save"})
/*     */   @ResponseBody
/*     */   R save(UserDO user) {
/*  92 */     if ((Constant.DEMO_ACCOUNT.equals(getUsername())) && (Constant.DEMO_ACCOUNT.equals(getUsername()))) {
/*  93 */       return R.error(1, "此用户为超级管理员用户，即不能操作！");
/*     */     }
/*  95 */     user.setPassword(MD5Utils.encrypt(user.getUsername(), user.getPassword()));
/*  96 */     if (this.userService.save(user) > 0) {
/*  97 */       if (user.getUsername().indexOf("sh_") != -1) {
/*  98 */         BusinessDO businessDo = new BusinessDO();
/*  99 */         businessDo.setUserId(Integer.valueOf(user.getUserId().intValue()));
/* 100 */         businessDo.setBusinessName(user.getName());
/* 101 */         businessDo.setBusinessIdentity(" ");
/* 102 */         businessDo.setBenefitRate(Integer.valueOf(1));
/* 103 */         businessDo.setCreateDate(new Date());
/* 104 */         this.businessService.save(businessDo);
/*     */       }
/* 106 */       return R.ok();
/*     */     }
/* 108 */     return R.error();
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:edit"})
/*     */   @Log("更新用户")
/*     */   @PostMapping({"/update"})
/*     */   @ResponseBody
/*     */   R update(UserDO user) {
/* 116 */     if ((Constant.DEMO_ACCOUNT.equals(getUsername())) && (Constant.DEMO_ACCOUNT.equals(getUsername()))) {
/* 117 */       return R.error(1, "此用户为超级管理员用户，即不能操作！");
/*     */     }
/* 119 */     if (user.getUsername().indexOf("sh_") != -1) {
/* 120 */       BusinessDO businessDo = new BusinessDO();
/* 121 */       businessDo = this.businessService.getBusiness(Integer.valueOf(user.getUserId().intValue()));
/*     */       
/* 123 */       if (businessDo != null) {
/* 124 */         businessDo.setBusinessName(user.getName());
/* 125 */         this.businessService.update(businessDo);
/*     */       }
/*     */     }
/* 128 */     if (this.userService.update(user) > 0) {
/* 129 */       return R.ok();
/*     */     }
/* 131 */     return R.error();
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:edit"})
/*     */   @Log("更新用户")
/*     */   @PostMapping({"/updatePeronal"})
/*     */   @ResponseBody
/*     */   R updatePeronal(UserDO user)
/*     */   {
/* 140 */     if ((Constant.DEMO_ACCOUNT.equals(getUsername())) && (Constant.DEMO_ACCOUNT.equals(getUsername()))) {
/* 141 */       return R.error(1, "此用户为超级管理员用户，即不能操作！");
/*     */     }
/* 143 */     if (user.getUsername().indexOf("sh_") != -1) {
/* 144 */       BusinessDO businessDo = new BusinessDO();
/* 145 */       businessDo = this.businessService.getBusiness(Integer.valueOf(user.getUserId().intValue()));
/* 146 */       if (businessDo != null) {
/* 147 */         businessDo.setBusinessName(user.getName());
/* 148 */         this.businessService.update(businessDo);
/*     */       }
/*     */     }
/*     */     
/* 152 */     if (this.userService.updatePersonal(user) > 0) {
/* 153 */       return R.ok();
/*     */     }
/* 155 */     return R.error();
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:remove"})
/*     */   @Log("删除用户")
/*     */   @PostMapping({"/remove"})
/*     */   @ResponseBody
/*     */   R remove(Long id)
/*     */   {
/* 164 */     if ((Constant.DEMO_ACCOUNT.equals(getUsername())) && (Constant.DEMO_ACCOUNT.equals(getUsername()))) {
/* 165 */       return R.error(1, "此用户为超级管理员用户，即不能操作！");
/*     */     }
/* 167 */     UserDO userDo = this.userService.get(id);
/* 168 */     if (userDo.getUsername().indexOf("sh_") != -1) {
/* 169 */       BusinessDO bus = this.businessService.getBusiness(Integer.valueOf(userDo.getUserId().intValue()));
/* 170 */       if (bus != null) {
/* 171 */         this.businessService.remove(bus.getId());
/*     */       }
/*     */     }
/* 174 */     if (this.userService.remove(id) > 0) {
/* 175 */       return R.ok();
/*     */     }
/* 177 */     return R.error();
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:batchRemove"})
/*     */   @Log("批量删除用户")
/*     */   @PostMapping({"/batchRemove"})
/*     */   @ResponseBody
/*     */   R batchRemove(@RequestParam("ids[]") Long[] userIds) {
/* 185 */     if ((Constant.DEMO_ACCOUNT.equals(getUsername())) && (Constant.DEMO_ACCOUNT.equals(getUsername()))) {
/* 186 */       return R.error(1, "此用户为超级管理员用户，即不能操作！");
/*     */     }
/* 188 */     for (int i = 0; i < userIds.length; i++) {
/* 189 */       UserDO userDo = this.userService.get(userIds[i]);
/* 190 */       if (userDo.getUsername().indexOf("sh_") != -1) {
/* 191 */         BusinessDO bus = this.businessService.getBusiness(Integer.valueOf(userDo.getUserId().intValue()));
/* 192 */         if (bus != null) {
/* 193 */           this.businessService.remove(bus.getUserId());
/*     */         }
/*     */       }
/*     */     }
/* 197 */     int r = this.userService.batchremove(userIds);
/* 198 */     if (r > 0) {
/* 199 */       return R.ok();
/*     */     }
/* 201 */     return R.error();
/*     */   }
/*     */   
/*     */   @PostMapping({"/exit"})
/*     */   @ResponseBody
/*     */   boolean exit(@RequestParam Map<String, Object> params)
/*     */   {
/* 208 */     return !this.userService.exit(params);
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:resetPwd"})
/*     */   @Log("请求更改用户密码")
/*     */   @GetMapping({"/resetPwd/{id}"})
/*     */   String resetPwd(@PathVariable("id") Long userId, Model model)
/*     */   {
/* 216 */     UserDO userDO = new UserDO();
/* 217 */     userDO.setUserId(userId);
/* 218 */     model.addAttribute("user", userDO);
/* 219 */     return this.prefix + "/reset_pwd";
/*     */   }
/*     */   
/*     */   @Log("提交更改用户密码")
/*     */   @PostMapping({"/resetPwd"})
/*     */   @ResponseBody
/*     */   R resetPwd(UserVO userVO) {
/* 226 */     if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
/* 227 */       return R.error(1, "演示系统不允许修改,完整体验请部署程序");
/*     */     }
/*     */     try {
/* 230 */       this.userService.resetPwd(userVO, getUser());
/* 231 */       return R.ok();
/*     */     } catch (Exception e) {
/* 233 */       return R.error(1, e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   @RequiresPermissions({"sys:user:resetPwd"})
/*     */   @Log("admin提交更改用户密码")
/*     */   @PostMapping({"/adminResetPwd"})
/*     */   @ResponseBody
/*     */   R adminResetPwd(UserVO userVO) {
/* 242 */     if (Constant.DEMO_ACCOUNT.equals(getUsername())) {
/* 243 */       return R.error(1, "演示系统不允许修改,完整体验请部署程序");
/*     */     }
/*     */     try {
/* 246 */       this.userService.adminResetPwd(userVO);
/* 247 */       return R.ok();
/*     */     } catch (Exception e) {
/* 249 */       return R.error(1, e.getMessage());
/*     */     }
/*     */   }
/*     */   
/*     */   @GetMapping({"/tree"})
/*     */   @ResponseBody
/*     */   public Tree<DeptDO> tree() {
/* 256 */     Tree<DeptDO> tree = new Tree();
/* 257 */     tree = this.userService.getTree();
/* 258 */     return tree;
/*     */   }
/*     */   
/*     */   @GetMapping({"/treeView"})
/*     */   String treeView() {
/* 263 */     return this.prefix + "/userTree";
/*     */   }
/*     */   
/*     */   @GetMapping({"/personal"})
/*     */   String personal(Model model) {
/* 268 */     UserDO userDO = this.userService.get(getUserId());
/* 269 */     model.addAttribute("user", userDO);
/* 270 */     model.addAttribute("hobbyList", this.dictService.getHobbyList(userDO));
/* 271 */     model.addAttribute("sexList", this.dictService.getSexList());
/* 272 */     return this.prefix + "/personal";
/*     */   }
/*     */   
/*     */   @ResponseBody
/*     */   @PostMapping({"/uploadImg"})
/* 277 */   R uploadImg(@RequestParam("avatar_file") MultipartFile file, String avatar_data, HttpServletRequest request) { if ("test".equals(getUsername())) {
/* 278 */       return R.error(1, "演示系统不允许修改,完整体验请部署程序");
/*     */     }
/* 280 */     Map<String, Object> result = new HashMap();
/*     */     try {
/* 282 */       result = this.userService.updatePersonalImg(file, avatar_data, getUserId());
/*     */     } catch (Exception e) {
/* 284 */       return R.error("更新图像失败！");
/*     */     }
/* 286 */     if ((result != null) && (result.size() > 0)) {
/* 287 */       return R.ok(result);
/*     */     }
/* 289 */     return R.error("更新图像失败！");
/*     */   }
/*     */ }

