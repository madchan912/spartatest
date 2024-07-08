package com.sparta.goal.service;

import com.sparta.goal.dto.GoalRequestDto;
import com.sparta.goal.dto.GoalResponseDto;
import com.sparta.goal.dto.GoalSelectDto;
import com.sparta.goal.entity.Goal;
import com.sparta.goal.repository.GoalRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GoalService {
    private final GoalRepository goalRepository;

    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }

    public GoalResponseDto createGoal(GoalRequestDto requestDto) {
        // RequestDto -> Entity
        Goal goal = new Goal(requestDto);

        // DB 저장
        Goal saveGoal = goalRepository.save(goal);

        // Entity -> ResponseDto
        GoalResponseDto goalResponseDto = new GoalResponseDto(saveGoal);

        return goalResponseDto;
    }

    public List<GoalSelectDto> getGoals() {
        return goalRepository.findAllByOrderByModifiedAtDesc().stream().map(GoalSelectDto::new).toList();
    }

    @Transactional
    public int updateGoal(int id, GoalRequestDto requestDto) {
        Goal goal = findGoal(id);

        goal.update(requestDto);

        return id;
    }

    public int deleteGoal(int id) {
        Goal goal = findGoal(id);

        goalRepository.delete(goal);

        return id;
    }

    private Goal findGoal(int id) {
        return goalRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("선택한 메모는 존재하지 않습니다.")
        );
    }
}
