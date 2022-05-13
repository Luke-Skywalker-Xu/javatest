package com.xuxiaolan.java.day5.school;

public class Employee extends Person {
    private String office;
    private double salary;
    private double workTime;

    public Employee(String name, String address, int tel, String email, String office, double salary, double workTime) {
        super(name, address, tel, email);
        this.setOffice(office);
        this.setSalary(salary);
        this.setWorkTime(workTime);
    }

    public String getInfo() {
        return "名字:" + super.getName() + "\n" +
                "地址:" + super.getAddress() + "\n" +
                "手机号:" + super.getTel() + "\n" +
                "邮箱:" + super.getEmail() + "\n" +
                "办公室:" + this.getOffice() + "\n" +
                "工资:" + this.getSalary() + "\n" +
                "工作时间:" + this.getWorkTime() + "\n";
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }
}
