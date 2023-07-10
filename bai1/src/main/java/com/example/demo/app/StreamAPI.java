package com.example.demo.app;

import com.example.demo.bean.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    private static List<Student> list = Arrays.asList(
            new Student("Nguyen Huy A", true, 6.4),
            new Student("Nguyen Huy B", true, 6.3),
            new Student("Nguyen Huy C", false, 6.6),
            new Student("Nguyen Huy C", true, 6.4),
            new Student("Nguyen Huy D", false, 6.4)
    );

    public static void main(String[] args) {
        Demo4();
    }

    private static void Demo4() {
        double average = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .average().getAsDouble();
        System.out.println("average: " + average);
        double sum = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .sum();
        System.out.println("sum: " + sum);

        double min_marks = list.stream()
                .mapToDouble(sv -> sv.getMarks())
                .min().getAsDouble();
        System.out.println("min_marks: " + min_marks);

        boolean all_passed = list.stream().allMatch(sv -> sv.getMarks() >= 5);
        System.out.println("all_passed: " + all_passed);
        Student min_sv = list.stream()
                .reduce(list.get(0), (min, sv) -> sv.getMarks() < min.getMarks() ? sv : min);
        System.out.println("min_sv: " + min_sv.getName());
    }

    private static void Demo3() {
        List<Student> result = list.stream()
                .filter(sv -> sv.getMarks() >= 6)
                .peek(sv -> sv.setName(sv.getName().toUpperCase()))
                .collect(Collectors.toList());
        result.forEach(sv -> {
            System.out.println(">> Name: " + sv.getName());
            System.out.println(">> Marks: " + sv.getMarks());
            System.out.println();
        });
    }

    private static void Demo2() {
        List<Integer> list = Arrays.asList(1, 6, 4, 8, 9, 3);
        List<Double> result = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> Math.sqrt(n))
                .peek(d -> System.out.println(d))
                .collect(Collectors.toList());
    }

    private static void Demo1() {
//      creat stream

//        cach1
        Stream<Integer> stream1 = Stream.of(1, 4, 2, 6, 3, 7);
        stream1.forEach(
                n -> System.out.println(n)
        );


//        cach2
        List<Integer> list = Arrays.asList(1, 6, 4, 8, 9, 3);
        list.stream().forEach(
                n -> System.out.println(n)
        );
    }
}
