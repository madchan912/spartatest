package com.sparta.goal.dto;

import lombok.Getter;

@Getter
public class GoalRequestDto {
    private String title;
    private String content;
    private String username;
    private int price;
}
