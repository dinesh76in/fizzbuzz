package com.solution.fizzbuzz.service;

import com.solution.fizzbuzz.core.DivisiblePredicateFactory;
import com.solution.fizzbuzz.core.Operation;
import com.solution.fizzbuzz.core.Operator;
import com.solution.fizzbuzz.core.Specification;
import org.springframework.stereotype.Service;
import java.util.function.Predicate;

@Service
public class FizzBuzzService {

    private static Operator operator;

    public FizzBuzzService(){
        operator = new Operator();
        Predicate<Integer> divisibleBy3 = DivisiblePredicateFactory.divisibleBy(3);
        Predicate<Integer> divisibleBy5 = DivisiblePredicateFactory.divisibleBy(5);
        Operation fizzbuzz = new Operation(new Specification(divisibleBy3).and(divisibleBy5), "FizzBuzz");
        Operation fizz = new Operation(new Specification(divisibleBy3), "Fizz");
        Operation buzz = new Operation(new Specification(divisibleBy5), "Buzz");
        operator.addOperation(fizzbuzz);
        operator.addOperation(fizz);
        operator.addOperation(buzz);
    }

    public String fizzBuzz(Integer number) {
       return operator.run(number);
    }
}
