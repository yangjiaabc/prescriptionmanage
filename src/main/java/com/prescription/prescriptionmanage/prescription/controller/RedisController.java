package com.prescription.prescriptionmanage.prescription.controller;

import com.prescription.prescriptionmanage.prescription.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.Set;

@Controller
public class RedisController {

        @Autowired
    	private RedisDao redisDao;

        @RequestMapping("RedisSet")
 	    public void testSet() {
            String key = "lisi";
            String value = "2020-02-19 13:57:00";
            this.redisDao.set(key, value);
        }

        /**
         * 存入队列
         */
        @RequestMapping("PushToQueue")
        public void PushToQueue() {
            String json = "{'url':'http://bbb.com'}";
            this.redisDao.pushJsonqueue(json);
        }

        @RequestMapping("RedisGet")
      	public void testGet() {
            String key = "name";
            String value = this.redisDao.get(key);
            System.out.println(value);
        }

        @RequestMapping("RedisGetAll")
        public void testGetAll() {
            //获取所有的key
            Map<String,Object> map = this.redisDao.getAllKeys();
            for(String key : map.keySet()){
                Object value = map.get(key);
                System.out.println(key+":"+value);
            }
        }

        @RequestMapping("RedisDelete")
	    public void testDelete() {
            String key = "name";
   	        this.redisDao.delete(key);
        }

}
