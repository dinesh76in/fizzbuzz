package com.solution.fizzbuzz.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
    public static String fizzBuzz(Integer number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
