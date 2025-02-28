package org.example.proxy;

import org.example.model.Animals;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FeedMammals implements Feed {
    public FeedMammals() {
    }

    public void feed(Animals animal) {
        System.out.println("Feeding Mammals");
    }
}
