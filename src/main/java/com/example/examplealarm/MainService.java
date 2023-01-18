package com.example.examplealarm;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class MainService {

    private final TaskScheduler scheduler;

    @Autowired
    public MainService(TaskScheduler scheduler) {
        this.scheduler = scheduler;
    }

    @PostConstruct
    public void init() {
        scheduler.scheduleWithFixedDelay(() -> {
            System.out.println("Hello Alarm!");
        }, LocalDateTime.now().plusSeconds(5)
                .toInstant(ZoneOffset.ofHours(5)),
                Duration.ofSeconds(2));
    }
}
