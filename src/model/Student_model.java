package model;

import java.util.Objects;

public class Student_model {
    String name;
    int rollno;
    String section;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_model that = (Student_model) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }
// parameterized constructor


    public Student_model(String name, int rollno, String section) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
    }

    // getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}


