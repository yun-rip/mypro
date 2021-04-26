package com.project.mypro.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum M002 {
    A001("한국"),
    A002("일본"),
    A003("미국"),
	A004("가나이아"),
	A005("기니비사우"),
	A006("나우루"),
	A007("남아프리카 공화국");
    
    private String country;
};