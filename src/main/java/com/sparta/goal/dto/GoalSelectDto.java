package com.sparta.goal.dto;

import com.sparta.goal.entity.Goal;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GoalSelectDto {
    private int id;
    private String title;
    private String username;
    private int price;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public GoalSelectDto(Goal goal) {
        this.id = goal.getId();
        this.title = goal.getTitle();
        this.username = goal.getUsername();
        this.price = goal.getPrice();
        this.createdAt = goal.getCreatedAt();
        this.modifiedAt = goal.getModifiedAt();
    }
}
