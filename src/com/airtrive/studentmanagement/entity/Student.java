package com.airtrive.studentmanagement.entity;

import com.airtrive.studentmanagement.interfaces.Gradable;
import com.airtrive.studentmanagement.interfaces.Searchable;

public class Student extends Person implements Gradable, Searchable {
    private String studentId;

    public Student(String name, String email, String studentId) {
        super(name, email);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public double getGrade() {
        // Placeholder
        return 0.0;
    }

    @Override
    public boolean matches(String keyword) {
        return name.contains(keyword) || studentId.contains(keyword) || email.contains(keyword);
    }
}
