package com.sparta.goal.dto;

import lombok.Getter;

@Getter
public class GoalRequestDto {
    private String title;
    private String contents;
    private String username;
    private int price;
}
