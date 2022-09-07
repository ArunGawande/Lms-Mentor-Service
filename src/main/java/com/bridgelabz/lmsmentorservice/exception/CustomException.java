package com.bridgelabz.lmsmentorservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Purpose : CustomException are Used to Validation exceptionu
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomException {
    private int errorCode;
    private String message;
}