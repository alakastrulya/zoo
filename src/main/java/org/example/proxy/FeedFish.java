package org.example.proxy;
import org.example.model.Animals;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Fish")
public class FeedFish implements Feed {
    public FeedFish() {
    }

    public void feed(Animals animal) {
        System.out.println("Feeding Fish");
    }
}
