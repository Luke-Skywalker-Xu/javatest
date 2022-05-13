package com.xuxiaolan.java.day5.school;

//    public enum grade{freshman,sophomore,junior};
class Student extends Person {

    private String grade;

    public Student(String name, String address, int tel, String email, String grade) {
        super(name, address, tel, email);
        this.setGrade(grade);
    }

    public String getInfo() {
        return "名字:" + super.getName() + "\n" +
                "地址:" + super.getAddress() + "\n" +
                "手机号:" + super.getTel() + "\n" +
                "邮箱:" + super.getEmail() + "\n" +
                "年级:" + this.getGrade();
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }

    class Grade {
        //声明对象的属性
        private final String gradeName;

        //私有化类的构造器
        private Grade(String gradeName) {
            this.gradeName = gradeName;
        }

        //提供当前枚举类的多个对象
        public final Grade freshman = new Grade("大一");
        public final Grade sophomore = new Grade("大二");
        public final Grade junior = new Grade("大三");

        //获取枚举类对象的属性
        public String getGrade() {
            return gradeName;
        }

        @Override
        public String toString() {
            return gradeName;
        }
    }
}
