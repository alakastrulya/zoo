package org.example.service;

import org.example.proxy.Clean;
import org.example.repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CleaningService implements ZooService {
    private final ZooRepository zooRepository;
    private final Clean cleaner;

    @Autowired
    public CleaningService(ZooRepository zooRepository, Clean cleaner) {
        this.zooRepository = zooRepository;
        this.cleaner = cleaner;
    }

    public void serviceReport() {
        System.out.println("New Premises");
    }
}