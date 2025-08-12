package org.example;

import lombok.Builder;
import lombok.ToString;

@Builder
public class Person {
    private String name;
    private double height;
    private double weight;
}
