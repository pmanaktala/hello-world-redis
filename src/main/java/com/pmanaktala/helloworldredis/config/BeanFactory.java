package com.pmanaktala.helloworldredis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.script.RedisScript;

@Configuration
public class BeanFactory {

    @Bean
    public RedisTemplate<String, Object> deliveryRedisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        return template;
    }

    @Bean
    public RedisScript<String> script() {
        Resource scriptSource = new ClassPathResource("status.lua");
        return RedisScript.of(scriptSource, String.class);
    }

}
