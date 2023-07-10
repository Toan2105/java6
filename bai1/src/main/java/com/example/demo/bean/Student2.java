package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Student2 {
    private String name;
    Boolean gender = false;
    Double marks = 0.0;
    Contact contact;
    List<String> subjects;
}
