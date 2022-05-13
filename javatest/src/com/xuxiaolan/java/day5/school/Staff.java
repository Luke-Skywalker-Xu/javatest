package com.xuxiaolan.java.day5.school;

public class Staff extends Employee{
    private String rank;

    public Staff(String name, String address, int tel, String email, String office, double salary, double workTime, String rank) {
        super(name, address, tel, email,office,salary,workTime);
        this.setRank(rank);
    }


    public String getInfo() {
        return "名字:" + super.getName() + "\n" +
                "地址:" + super.getAddress() + "\n" +
                "手机号:" + super.getTel() + "\n" +
                "邮箱:" + super.getEmail() + "\n" +
                "办公室:" + this.getOffice() + "\n" +
                "工资:" + this.getSalary() + "\n" +
                "工作时间:" + this.getWorkTime() + "\n"+
                "级别:" + this.getRank();
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
