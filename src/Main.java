import models.Student;
import service.serviceImpl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        StudentServiceImpl studentService = new StudentServiceImpl();
        List<Student> students = Arrays.asList(
                new Student(1L, "Kuba", "Java", 12),
                new Student(2L, "Ulan", "Js", 13),
                new Student(5L, "Musa", "Js", 18),
                new Student(8L, "Ularbek", "Java", 11),
                new Student(2L, "Bektur", "Js", 10),
                new Student(6L, "Nurik", "Java", 19),
                new Student(3L, "Muxa", "Js", 14),
                new Student(1L, "Joomart", "Js", 16),
                new Student(5L, "Nurtilek", "Java", 15),
                new Student(9L, "Kayrat", "Js", 13),
                new Student(4L, "Eldiyar", "Java", 17),
                new Student(10L, "Zaripbek", "Js", 18)
        );
        while (true) {
            System.out.println("""
                        1.addStudent
                        2.getAllStudent
                        3.sortByName
                        4.sortByPoints
                        
                    """);
            Scanner scanner = new Scanner(System.in);
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    System.out.println(studentService.addStudent(students));
                }
                case 2 -> {
                    System.out.println(studentService.getAllStudents());
                }
                case 3 -> {
                    System.out.println(studentService.sortByName(scanner.nextLine()));
                }
                case 4 -> {
                    System.out.println(studentService.sortByPoints(scanner.nextLine()));
                }

            }
        }

    }
}