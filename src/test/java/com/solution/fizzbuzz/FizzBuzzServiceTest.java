package com.solution.fizzbuzz;

import com.solution.fizzbuzz.service.FizzBuzzService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class FizzBuzzServiceTest {

    FizzBuzzService fizzBuzzService = new FizzBuzzService();

    @Test
    public void multiplesOf3_shouldReturnFizz() {
        assertThat(fizzBuzzService.fizzBuzz(9), is("Fizz"));
        assertThat(fizzBuzzService.fizzBuzz(12), is("Fizz"));
        assertThat(fizzBuzzService.fizzBuzz(18), is("Fizz"));
        assertThat(fizzBuzzService.fizzBuzz(21), is("Fizz"));
    }

    @Test
    public void multiplesOf5_shouldReturnBuzz() {
        assertThat(fizzBuzzService.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzzService.fizzBuzz(10), is("Buzz"));
        assertThat(fizzBuzzService.fizzBuzz(20), is("Buzz"));
        assertThat(fizzBuzzService.fizzBuzz(25), is("Buzz"));
    }

    @Test
    public void multiplesOf15_shouldReturnFizzbuzz() {
        assertThat(fizzBuzzService.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzzService.fizzBuzz(30), is("FizzBuzz"));
        assertThat(fizzBuzzService.fizzBuzz(45), is("FizzBuzz"));
        assertThat(fizzBuzzService.fizzBuzz(60), is("FizzBuzz"));
        assertThat(fizzBuzzService.fizzBuzz(75), is("FizzBuzz"));
        assertThat(fizzBuzzService.fizzBuzz(90), is("FizzBuzz"));
    }

}
