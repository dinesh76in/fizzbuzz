package com.solution.fizzbuzz;

import org.junit.jupiter.api.Test;

import static com.solution.fizzbuzz.service.FizzBuzzService.fizzBuzz;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzServiceTest {

	@Test
	public void multiplesOf3_shouldReturnFizz() {
		assertThat(fizzBuzz(9), is("fizz"));
		assertThat(fizzBuzz(12), is("fizz"));
		assertThat(fizzBuzz(18), is("fizz"));
		assertThat(fizzBuzz(21), is("fizz"));
	}

	@Test
	public void multiplesOf5_shouldReturnBuzz() {
		assertThat(fizzBuzz(5), is("buzz"));
		assertThat(fizzBuzz(10), is("buzz"));
		assertThat(fizzBuzz(20), is("buzz"));
		assertThat(fizzBuzz(25), is("buzz"));
	}

	@Test
	public void multiplesOf15_shouldReturnFizzbuzz() {
		assertThat(fizzBuzz(15), is("fizzbuzz"));
		assertThat(fizzBuzz(30), is("fizzbuzz"));
		assertThat(fizzBuzz(45), is("fizzbuzz"));
		assertThat(fizzBuzz(60), is("fizzbuzz"));
		assertThat(fizzBuzz(75), is("fizzbuzz"));
		assertThat(fizzBuzz(90), is("fizzbuzz"));
	}

}
