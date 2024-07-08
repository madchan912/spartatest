package com.sparta.goal.controller;

import com.sparta.goal.dto.GoalRequestDto;
import com.sparta.goal.dto.GoalResponseDto;
import com.sparta.goal.service.GoalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoalController {
    private final GoalService goalService;

    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @PostMapping("/post")
    public GoalResponseDto createGoal(@RequestBody GoalRequestDto requestDto) {
        return goalService.createGoal(requestDto);
    }

    @GetMapping("/post")
    public List<GoalResponseDto> getGoals() {
        return goalService.getGoals();
    }

    @PutMapping("/post/{id}")
    public int updateGoal(@PathVariable int id, @RequestBody GoalRequestDto requestDto) {
        return goalService.updateGoal(id, requestDto);
    }

    @DeleteMapping("/post/{id}")
    public int deleteGoal(@PathVariable int id) {
        return goalService.deleteGoal(id);
    }
}
