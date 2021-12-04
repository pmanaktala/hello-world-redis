package com.pmanaktala.helloworldredis.config;

import com.pmanaktala.helloworldredis.dto.Example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

import java.util.List;

@Configuration
public class BeanFactory {

    @Bean
    public RedisScript<List<List<String>>> script() {
        Resource scriptSource = new ClassPathResource("status.lua");
        return RedisScript.of(scriptSource, (Class<List<List<String>>>)(Object)List.class);
//
    }

}
