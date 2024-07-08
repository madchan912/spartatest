package com.sparta.goal.entity;

import com.sparta.goal.dto.GoalRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "goal")
@NoArgsConstructor
public class Goal extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "content", nullable = false, length = 500)
    private String content;
    @Column(name = "title", nullable = false, length = 500)
    private String title;
    @Column(name = "price", nullable = false, length = 500)
    private int price;

    public Goal(GoalRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.title = requestDto.getTitle();
        this.price = requestDto.getPrice();
    }

    public void update(GoalRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.content = requestDto.getContent();
        this.title = requestDto.getTitle();
        this.price = requestDto.getPrice();
    }
}
