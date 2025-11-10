package com.airtrive.studentmanagement.service;

import com.airtrive.studentmanagement.entity.Course;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseService {
    private Map<String, Course> courses = new HashMap<>();

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public Course findCourseById(String id) {
        return courses.get(id);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses.values());
    }
}
