package com.solution.fizzbuzz;

import com.solution.fizzbuzz.service.FizzBuzzService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        IntStream.rangeClosed(1, 100).forEach(i -> System.out.println(fizzBuzzService.fizzBuzz(i)));
    }

}
