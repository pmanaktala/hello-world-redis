package com.pmanaktala.helloworldredis.repository;

import com.pmanaktala.helloworldredis.dto.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends CrudRepository<Query, String> {
}

