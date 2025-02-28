package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Animals {
    private String animalName;
    private int age;

    public Animals() {
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
