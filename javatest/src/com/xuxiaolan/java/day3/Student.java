package com.xuxiaolan.java.day3;

public class Student {
    private String name; //姓名
    private String sex; //性别
    private Course[] select; //选课

    public Student(String Name,String Sex)
    {
        name=Name;
        sex=Sex;
    }
    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public Course[] getSelect() {
        return select;
    }
    public void setName(String Name) {
        name=Name;
    }
    public void setSex(String Sex) {
        sex=Sex;
    }
    public void setSelect(Course[] Select) {
        select=Select;
    }
}


