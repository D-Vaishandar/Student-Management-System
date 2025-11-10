package com.airtrive.studentmanagement;

import com.airtrive.studentmanagement.entity.Course;
import com.airtrive.studentmanagement.entity.Enrollment;
import com.airtrive.studentmanagement.entity.GraduateStudent;
import com.airtrive.studentmanagement.entity.Student;
import com.airtrive.studentmanagement.exception.StudentNotFoundException;
import com.airtrive.studentmanagement.service.CourseService;
import com.airtrive.studentmanagement.service.EnrollmentService;
import com.airtrive.studentmanagement.service.StudentService;
import com.airtrive.studentmanagement.util.DateUtil;
import com.airtrive.studentmanagement.util.InputValidator;

public class StudentManagementMain {
    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System!");
        System.out.println("Today's date: " + DateUtil.today());

        // Initialize services
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        // Add sample students
        Student s1 = new Student("Dharmendra", "dharmendra@airtirbe.com", "S001");
        Student s2 = new Student("Rahul", "rahul@airtirbe.com", "S002");
        GraduateStudent s3 = new GraduateStudent("Rahul", "rahul@airtirbe.com", "S003", "AI in Education");
        studentService.addStudent(s1);
        studentService.addStudent(s2);
        studentService.addStudent(s3);

        // Add sample courses
        Course c1 = new Course("C101", "Java");
        Course c2 = new Course("C102", "DSA");
        Course c3 = new Course("C103", "NodeJS");
        courseService.addCourse(c1);
        courseService.addCourse(c2);

        // Enroll students
        Enrollment e1 = new Enrollment(s1, c1, 85.5);
        Enrollment e2 = new Enrollment(s2, c2, 90.0);
        Enrollment e3 = new Enrollment(s3, c2, 92.0);
        Enrollment e4 = new Enrollment(s1, c3, 82.0);
        enrollmentService.enrollStudent(e1);
        enrollmentService.enrollStudent(e2);
        enrollmentService.enrollStudent(e3);
        enrollmentService.enrollStudent(e4);

        // Search for a student by keyword
        String searchKeyword = "Alice";
        System.out.println("\nSearching for students with keyword: " + searchKeyword);
        for (Student student : studentService.getAllStudents()) {
            if (student.matches(searchKeyword)) {
                System.out.println("Found student: " + student.getName() + " (" + student.getStudentId() + ")");
            }
        }

        // Search for a course by keyword
        String courseKeyword = "Computer";
        System.out.println("\nSearching for courses with keyword: " + courseKeyword);
        for (Course course : courseService.getAllCourses()) {
            if (course.matches(courseKeyword)) {
                System.out.println("Found course: " + course.getCourseName() + " (" + course.getCourseId() + ")");
            }
        }

        // Display enrollments and grades
        System.out.println("\nStudent Enrollments and Grades:");
        for (Enrollment enrollment : enrollmentService.getEnrollments()) {
            Student student = enrollment.getStudent();
            Course course = enrollment.getCourse();
            System.out.println(student.getName() + " enrolled in " + course.getCourseName() + " with grade: " + enrollment.getGrade());
        }

        // Exception handling demonstration
        try {
            Student found = studentService.findStudentById("S999");
            if (found == null) {
                throw new StudentNotFoundException("Student with ID S999 not found.");
            }
        } catch (StudentNotFoundException ex) {
            System.out.println("Exception caught: " + ex.getMessage());
        }

        // Input validation demonstration
        String testEmail = "testuser@domain.com";
        System.out.println("\nValidating email: " + testEmail);
        if (InputValidator.isValidEmail(testEmail)) {
            System.out.println("Email is valid.");
        } else {
            System.out.println("Email is invalid.");
        }
    }
}
