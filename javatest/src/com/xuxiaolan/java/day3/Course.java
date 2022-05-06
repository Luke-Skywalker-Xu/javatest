package com.xuxiaolan.java.day3;

public class Course {
    private String name;
    private Course[] course;

    public String getName() {
        return name;
    }
    public void setName(String Name) {
        name=Name;
    }

    public void addCourse(Course[] Course){
        course = Course;
    }
}

