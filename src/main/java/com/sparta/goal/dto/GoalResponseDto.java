package com.sparta.goal.dto;

import com.sparta.goal.entity.Goal;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class GoalResponseDto {
    private int id;
    private String title;
    private String contents;
    private String username;
    private int price;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public GoalResponseDto(Goal goal) {
        this.id = goal.getId();
        this.title = goal.getTitle();
        this.contents = goal.getContents();
        this.username = goal.getUsername();
        this.price = goal.getPrice();
        this.createdAt = goal.getCreatedAt();
        this.modifiedAt = goal.getModifiedAt();
    }
}
