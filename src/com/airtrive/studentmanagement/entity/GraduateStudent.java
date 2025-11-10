package com.airtrive.studentmanagement.entity;

public class GraduateStudent extends Student {
    private String thesisTitle;

    public GraduateStudent(String name, String email, String studentId, String thesisTitle) {
        super(name, email, studentId);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }
}
