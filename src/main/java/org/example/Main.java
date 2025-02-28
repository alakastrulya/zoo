package org.example;

import org.example.model.Animals;
import org.example.model.Premises;
import org.example.proxy.Clean;
import org.example.proxy.Feed;
import org.example.service.CleaningService;
import org.example.service.FeedingService;
import org.example.service.ZooService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{ProjectConfig.class});
        ZooService feedingService = (ZooService)context.getBean(FeedingService.class);
        ZooService cleaningService = (ZooService)context.getBean(CleaningService.class);
        CleaningService cleaningServiceEvening = context.getBean("cleaningServiceEvening", CleaningService.class);
        FeedingService feedingServiceMorning = context.getBean("feedingServiceMorning", FeedingService.class);
        feedingService.serviceReport();
        cleaningService.serviceReport();
        Feed feed = (Feed)context.getBean(Feed.class);
        Clean clean = (Clean)context.getBean(Clean.class);
        Animals bear = (Animals)context.getBean(Animals.class);
        Premises premises = (Premises)context.getBean(Premises.class);
        premises.setPremiseName("New Cage");
        feed.feed(bear);
        clean.cleanUp(premises);
    }
}