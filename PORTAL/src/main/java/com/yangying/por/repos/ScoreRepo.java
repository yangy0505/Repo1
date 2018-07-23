package com.yangying.por.repos;


import com.yangying.por.pojo.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ScoreRepo extends JpaRepository<Score, Integer>, JpaSpecificationExecutor<Score> {
}
