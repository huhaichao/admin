package com.irevest.testDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RestController;

import com.irevest.common.utils.RedisUtil;

@RestController()
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void test() throws Exception {
    	//redisUtil.set("aa", "11111114444111112");
    	//redisUtil.set("aa", "16666666662");
    	redisUtil.del("aa");
    	System.out.println("===============:"+redisUtil.get("aa"));
    }
}
