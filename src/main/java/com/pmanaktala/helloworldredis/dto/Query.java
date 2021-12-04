package com.pmanaktala.helloworldredis.dto;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Query")
public class Query {

    private String id;
    private String a;
    private Integer b;
    private Float c;
    private String d;
    private String e;
    private String sessid;

}
