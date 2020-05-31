package com.prescription.prescriptionmanage.prescription.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class RedisDao {

    @Autowired
    private StringRedisTemplate  stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;


    public void set(String key, String value) {
	    this.stringRedisTemplate.opsForValue().set(key, value);
    }

    public String get(String key) {
	     return this.stringRedisTemplate.opsForValue().get(key);
	}

    /**
     * 存入队列
     * @param json
     */
    public boolean pushJsonqueue(String json){
        RedisSerializer stringSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(stringSerializer);
        redisTemplate.setValueSerializer(stringSerializer);
        redisTemplate.setHashKeySerializer(stringSerializer);
        redisTemplate.setHashValueSerializer(stringSerializer);
        ListOperations<String, Object> listOperations = redisTemplate.opsForList();
        listOperations.rightPush("spider_message",json);
        return true;
    }

    /**
     * 获得redis所有key
     * @return
     */
    public Map<String,Object> getAllKeys() {
	    Set<String> keys = stringRedisTemplate.keys("*");
	    Map<String,Object> map = new HashMap<>();
        for (String key: keys) {
            Object value = stringRedisTemplate.opsForValue().get(key);
            map.put(key,value);
        }
        return map;
    }

    public void delete(String key) {
	    this.stringRedisTemplate.delete(key);
	}
 }
