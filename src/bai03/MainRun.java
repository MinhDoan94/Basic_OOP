package bai03;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Xin mời nhập chiều rộng của hình chữ nhật:");
        rectangle.setWidth(new Scanner(System.in).nextDouble());
        System.out.println("Xin mời nhập chiều dài của hình chữ nhật:");
        rectangle.setHeight(new Scanner(System.in).nextDouble());
        System.out.println("Xin mời nhập màu của hình chữ nhật:");
        rectangle.setColor(new Scanner(System.in).nextLine());
        System.out.println("Hình chữ nhật vừa nhập : " + rectangle);
        System.out.println("Diện tích của hình chữ nhật là: "+ rectangle.findArea());
        System.out.println("Chu vi của hình chữ nhật là: "+ rectangle.findPerimeter());
    }
}

