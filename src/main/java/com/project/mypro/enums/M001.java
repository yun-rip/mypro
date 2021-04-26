package com.project.mypro.enums;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor // 모든 필드 값을 파라미터로 받아줌 
@RequestMapping(value = "ajax")
public enum M001 {
    S001("서울"),
    S002("경기도"),
    S003("제주도");
    
    private String SOO;
};