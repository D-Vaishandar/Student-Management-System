# Student Management System

A simple Java-based Student Management System for managing students, courses, enrollments, and grades.

## Features

- Add and manage students (including graduate students)
- Add and manage courses
- Enroll students in courses and assign grades
- Search students and courses by keyword
- Validate email addresses
- Exception handling for missing students

## Technologies

- Java
- No external frameworks required

## Project Structure

- `src/com/airtrive/studentmanagement/`  
  Main application and supporting classes
- `entity/`  
  Domain models: `Student`, `GraduateStudent`, `Course`, `Enrollment`
- `service/`  
  Business logic: `StudentService`, `CourseService`, `EnrollmentService`
- `exception/`  
  Custom exceptions: `StudentNotFoundException`
- `util/`  
  Utility classes: `DateUtil`, `InputValidator`

## Getting Started

1. **Clone the repository**
2. **Open in IntelliJ IDEA**
3. **Build and run `StudentManagementMain.java`**

## Usage

- The main class demonstrates adding students/courses, enrolling students, searching, and validation.
- Modify or extend entities and services for more features.

## License

This project is for educational purposes.
