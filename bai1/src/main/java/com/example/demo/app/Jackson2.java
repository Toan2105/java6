package com.example.demo.app;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Jackson2 {
    public static void main(String[] args) throws IOException {
        Demo3();
    }

    private static void Demo3() {
    }

    private static void Demo2() throws IOException {
        String path = "E:\\java6\\bai1\\src\\main\\resources\\students.json";
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String,Object>> students = mapper.readValue(new File(path),List.class);

        students.forEach(student -> {
            System.out.println(">> Name: " + student.get("name"));
        });
    }

    private static void Demo1() throws IOException {
        String path = "E:\\java6\\bai1\\src\\main\\resources\\student.json";
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> student = mapper.readValue(new File(path),Map.class);

        System.out.println(">> Name: " + student.get("name"));
        System.out.println(">> Marks: " + student.get("marks"));
        System.out.println(">> Gender: " + student.get("gender"));
        Map<String, Object> contact = (Map<String, Object>) student.get("contact");
        System.out.println(">> Email: " + contact.get("email"));
        System.out.println(">> Phone: " + contact.get("phone"));
        List<String> subjects = (List<String>) student.get("subjects");
        subjects.forEach(subject -> {
            System.out.println(">> Subject " + subject);
        });
    }
}
