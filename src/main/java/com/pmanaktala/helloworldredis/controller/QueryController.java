package com.pmanaktala.helloworldredis.controller;

import com.pmanaktala.helloworldredis.dto.Query;
import com.pmanaktala.helloworldredis.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QueryController {

    @Autowired
    private QueryRepository repo;

    @GetMapping("findAll")
    public ResponseEntity<Iterable<Query>> findAll(){
        return ResponseEntity.ok(repo.findAll());
    }

}
