package org.example;


import org.example.proxy.Clean;
import org.example.proxy.Feed;
import org.example.repository.ZooRepository;
import org.example.service.CleaningService;
import org.example.service.FeedingService;
import org.springframework.context.annotation.*;

@ComponentScan(
        basePackages = {"org.example;"}
)
@Configuration
public class ProjectConfig {
    public ProjectConfig() {
    }

    @Bean
    @Primary
    CleaningService cleaningServiceMorning(ZooRepository zooRepository, Clean cleaner) {
        System.out.println("Eager Cleaning Service");
        return new CleaningService(zooRepository, cleaner);
    }

    @Bean
    @Lazy
    CleaningService cleaningServiceEvening(ZooRepository zooRepository, Clean cleaner) {
        System.out.println("Lazy Cleaning Service");
        return new CleaningService(zooRepository, cleaner);
    }

    @Bean
    @Lazy
    FeedingService feedingServiceMorning(ZooRepository zooRepository, Feed feed) {
        System.out.println("Lazy Feeding Service");
        return new FeedingService(zooRepository, feed);
    }

    @Bean
    @Primary
    FeedingService feedingServiceEvening(ZooRepository zooRepository, Feed feed) {
        System.out.println("Eager Feeding Service");
        return new FeedingService(zooRepository, feed);
    }
}