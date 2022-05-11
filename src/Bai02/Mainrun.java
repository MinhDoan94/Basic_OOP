package Bai02;

import java.util.Scanner;

public class Mainrun {

    public static void main(String[] args) {
        System.out.print("Nhập số lượng sinh viên cần thêm: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Student[] student = Student.inPutlistStudent(n);
        Student.showListStudent(student);

        System.out.println("\n Sau khi sắp xếp thì danh sách in ra là \n");

        Student.sortByName(student);
        Student.showListStudent(student);
    }
}
