package com.bridgelabz.lmsmentorservice.util;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * Purpose : ResponseClass Used to Handle Exception
 * */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseClass {
    private int errorCode;
    private String message;
    private Object token;
}