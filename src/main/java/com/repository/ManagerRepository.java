package com.repository;

import com.domain.Manager;
import me.jclagache.data.mybatis.repository.MyBatisRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends MyBatisRepository<Manager, Integer> {
}