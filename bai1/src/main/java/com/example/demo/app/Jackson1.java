package com.example.demo.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Jackson1 {
    public static void main(String[] args) throws IOException {
        Demo2();
    }

    private static void Demo2() throws IOException {
        String path = "E:\\java6\\bai1\\src\\main\\resources\\students.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode students = mapper.readTree(new File(path));
        students.iterator().forEachRemaining(
                student -> System.out.println("Name: " +student.get("name").asText())
        );
    }

    private static void Demo1() throws IOException {
        String path = "E:\\java6\\bai1\\src\\main\\resources\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        JsonNode student = mapper.readTree(new File(path));
        System.out.println(">> Name: " + student.get("name").asText());
        System.out.println(">> Marks: " + student.get("marks").asText());
        System.out.println(">> Gender: " + student.get("gender").asText());
        System.out.println(">> Email: " + student.get("contact").asText());
        System.out.println(">> Phone: " + student.findValue("phone").asText());
        student.get("subjects").iterator().forEachRemaining(
                subjects -> System.out.println(">> Subject: " + subjects.asText())
        );
    }
}
