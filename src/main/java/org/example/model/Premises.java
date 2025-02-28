package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Premises {
    private String premiseName;
    private Animals animalsType;
    private int quantityOfAnimals;

    public Premises() {
    }

    public String getPremiseName() {
        return this.premiseName;
    }

    public void setPremiseName(String premiseName) {
        this.premiseName = premiseName;
    }

    public Animals getAnimalsType() {
        return this.animalsType;
    }

    public void setAnimalsType(Animals animalsType) {
        this.animalsType = animalsType;
    }

    public int getQuantityOfAnimals() {
        return this.quantityOfAnimals;
    }

    public void setQuantityOfAnimals(int quantityOfAnimals) {
        this.quantityOfAnimals = quantityOfAnimals;
    }
}
