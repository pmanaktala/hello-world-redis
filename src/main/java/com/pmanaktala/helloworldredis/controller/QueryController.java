package com.pmanaktala.helloworldredis.controller;

import com.pmanaktala.helloworldredis.dto.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
public class QueryController {

    @Autowired
    private RedisScript<String> script;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @GetMapping("findAll")
    public ResponseEntity<String> findAll(){
        String res = redisTemplate
                .execute(script, Collections.emptyList());

        return ResponseEntity.ok(res);
    }


}
