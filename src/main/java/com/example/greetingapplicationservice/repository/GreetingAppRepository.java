package com.example.greetingapplicationservice.repository;


import com.example.greetingapplicationservice.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {};