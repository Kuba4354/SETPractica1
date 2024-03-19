package models;

public class Student {
    private Long id;
    private String name;
    private String group;
    private double point;

    public Student(Long id, String name, String group, double point) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.point = point;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", name='" + name +
                ", group='" + group +
                ", point=" + point;
    }
}
