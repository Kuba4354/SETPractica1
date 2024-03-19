package service;

import models.Student;

import java.awt.*;
import java.util.List;

public interface ServiceStudent {
    String addStudent(List<Student> students);

    List<Student> getAllStudents();

    List<Student> sortByName(String ascOrDesc);

    List<Student> sortByPoints(String ascOrDesc);

}
