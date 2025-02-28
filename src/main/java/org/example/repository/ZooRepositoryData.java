package org.example.repository;

import java.util.ArrayList;
import org.example.model.Animals;
import org.example.model.Premises;
import org.springframework.stereotype.Repository;

@Repository
public class ZooRepositoryData implements ZooRepository {
    private ArrayList<Premises> premisesList;
    private ArrayList<Animals> animalsList;

    public ZooRepositoryData() {
    }

    public void storeData(Premises premises) {
        this.premisesList.add(premises);
        System.out.println("Adding new premises data");
    }

    public void storeData(Animals animal) {
        this.animalsList.add(animal);
        System.out.println("Adding new animal data");
    }

    public ArrayList<Premises> getPremisesList() {
        return this.premisesList;
    }

    public ArrayList<Animals> getAnimalsList() {
        return this.animalsList;
    }
}
