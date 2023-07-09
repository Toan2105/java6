package com.example.demo.app;

import com.example.demo.bean.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda {
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
        Demo4Inter o = (x)-> System.out.println(x);
        o.m1(2913);
    }

    private static void Demo3() {
        Collections.sort(list,(sinhVien1,sinhVien2)->sinhVien1.getMarks().compareTo(sinhVien2.getMarks()));
        list.forEach(
                sv ->{
                    System.out.println(sv.getName());
                    System.out.println(sv.getMarks());
                    System.out.println();
                }
        );
    }

    private static void Demo2() {
        list.forEach(
                sinhVien -> {
                    System.out.println(sinhVien.getName());
                    System.out.println(sinhVien.getMarks());
                    System.out.println();
                }
        );
    }

    private static void Demo1() {
        List<Integer> list = Arrays.asList(1, 2, 4, 5);
        list.forEach(n -> System.out.println(n));
    }

    @FunctionalInterface
    interface Demo4Inter{
        void m1(int x);
        default void m2() {}
        public static void m3(){}
    }

}
