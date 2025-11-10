package com.airtrive.studentmanagement.entity;

import com.airtrive.studentmanagement.interfaces.Searchable;

public class Course implements Searchable {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public boolean matches(String keyword) {
        return courseName.contains(keyword) || courseId.contains(keyword);
    }
}
