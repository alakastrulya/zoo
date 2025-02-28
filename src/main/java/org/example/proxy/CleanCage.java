package org.example.proxy;

import java.io.PrintStream;

import org.example.model.Animals;
import org.example.model.Premises;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CleanCage implements Clean {
    public CleanCage() {
    }

    public void cleanUp(Premises premises) {
        System.out.println("Clean up the Cage " + premises.getPremiseName());
    }
}



