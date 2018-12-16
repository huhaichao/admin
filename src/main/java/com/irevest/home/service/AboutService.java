package com.irevest.home.service;



import java.util.List;
import java.util.Map;

import com.irevest.home.domain.AboutDO;

/**
 * 文章内容
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2017-09-09 10:03:34
 */
public interface AboutService {
	
	AboutDO getType(String type);
	
	AboutDO get(Long cid);
	
	List<AboutDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(AboutDO bAbout);
	
	int update(AboutDO bAbout);
	
	int remove(Long cid);
	
	int batchRemove(Long[] cids);
}
