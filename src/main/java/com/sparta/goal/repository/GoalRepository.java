package com.sparta.goal.repository;

import com.sparta.goal.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoalRepository extends JpaRepository<Goal, Integer> {
    List<Goal> findAllByOrderByModifiedAtDesc();
}
