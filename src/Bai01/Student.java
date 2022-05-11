package Bai01;

import java.util.Scanner;

public class Student {
    private int iD;
    private String name;
    private String grade;
    private int course;

    public Student(int iD, String name, String grade, int course) {
        this.iD = iD;
        this.name = name;
        this.grade = grade;
        this.course = course;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", course=" + course +
                '}';
    }

    public void showInfor() {
        System.out.println("------Sinh viên có thông tin------");
        System.out.println("Mã sinh viên: " + this.iD);
        System.out.println("Tên sinh viên: " + this.name);
        System.out.println("Lớp: " + this.grade);
        System.out.println("Khóa: " + this.course);
    }

    public void inPutInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        int iD = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập lớp sinh viên: ");
        String grade = sc.nextLine();
        System.out.print("Nhập khóa sinh viên: ");
        int course = sc.nextInt();
        setiD(iD);
        setName(name);
        setGrade(grade);
        setCourse(course);
    }
}
