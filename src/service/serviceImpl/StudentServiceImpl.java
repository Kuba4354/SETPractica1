package service.serviceImpl;

import models.DataBase;
import models.Student;
import service.ServiceStudent;

import java.util.Comparator;
import java.util.List;

public class StudentServiceImpl implements ServiceStudent {
    @Override
    public String addStudent(List<Student> students) {
        DataBase.students.addAll(students);
        return "Успешно";
    }

    @Override
    public List<Student> getAllStudents() {

        return DataBase.students;
    }

    @Override
    public List<Student> sortByName(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")) {
            DataBase.students.sort(Comparator.comparing(Student::getName));
            return DataBase.students;
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            Comparator<Student> studentsSortByName = Comparator.comparing(Student::getName).reversed();
            DataBase.students.sort(studentsSortByName);
            return DataBase.students;

        }
        return null;
    }

    @Override
    public List<Student> sortByPoints(String ascOrDesc) {
        if (ascOrDesc.equalsIgnoreCase("asc")) {
            DataBase.students.sort(Comparator.comparing(Student::getPoint));
            return DataBase.students;
        } else if (ascOrDesc.equalsIgnoreCase("desc")) {
            DataBase.students.sort(Comparator.comparing(Student::getPoint).reversed());
            return DataBase.students;

        }
        return null;
    }
}

