package com.solution.fizzbuzz.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Operator {

    private List<Operation> operationList = new ArrayList<>();

    public void addOperation(Operation operation) {
        this.operationList.add(operation);
    }

    public String run(int number) {
            String message = this.operationList.stream()
                    .filter(operation -> operation.getSpecification()
                            .isSatisfiedBy(number))
                    .map(operation->operation.getMessage())
                    .findFirst()
                    .orElse(String.valueOf(number));
            return message;
    }
}