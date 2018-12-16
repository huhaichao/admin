package com.irevest.common.utils;
import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
@Component
public class RedisUtil {
	//@Autowired
	//private RedisTemplate<String, Object> redisTemplate;
	
	@Resource
    private RedisTemplate<String, Object> redisTemplate;
 
    public void set(String key, Object value) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key, value);
    }
 
    public Object get(String key) {
        ValueOperations<String, Object> valueOperations = redisTemplate.opsForValue();
        return valueOperations.get(key);
    }
    /**
     * 根据key删除里面的数据信息
     * @param key
     */
    public void del(String key){
    	redisTemplate.delete(key);	
    }
    /**
     * 根据key删除里面的数据信息
     * @param key
     */
    public void dels(Collection<String> keys){
    	redisTemplate.delete(keys);;
    }
    
}

