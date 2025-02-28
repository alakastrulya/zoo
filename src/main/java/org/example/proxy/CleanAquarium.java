package org.example.proxy;


import org.example.model.Premises;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Aquarium")
public class CleanAquarium implements Clean {
    public CleanAquarium() {
    }

    public void cleanUp(Premises premises) {
        System.out.println("Clean up the" + premises.getPremiseName());
    }
}