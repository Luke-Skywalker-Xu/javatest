package com.xuxiaolan.java.day5.school;

public class Faculty extends Employee{
    private String jobTitle;
    public Faculty(String name, String address, int tel, String email, String office, double salary, double workTime, String jobTitle) {
        super(name, address, tel, email,office,salary,workTime);
        this.setJobTitle(jobTitle);
    }
    public String getInfo() {
        return "名字:" + super.getName() + "\n" +
                "地址:" + super.getAddress() + "\n" +
                "手机号:" + super.getTel() + "\n" +
                "邮箱:" + super.getEmail() + "\n" +
                "办公室:" + this.getOffice() + "\n" +
                "工资:" + this.getSalary() + "\n" +
                "工作时间:" + this.getWorkTime() + "\n"+
                "职称:" + this.getJobTitle();
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
