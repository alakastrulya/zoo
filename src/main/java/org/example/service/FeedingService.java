package org.example.service;

import org.example.proxy.Feed;
import org.example.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FeedingService implements ZooService {
    private final ZooRepository zooRepository;
    private final Feed feed;

    @Autowired
    public FeedingService(ZooRepository zooRepository, @Qualifier("Fish") Feed feed) {
        this.zooRepository = zooRepository;
        this.feed = feed;
    }

    public void serviceReport() {
        System.out.println("New Animal");
    }
}
