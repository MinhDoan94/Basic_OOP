package Bai04;

import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyPoint.mypoint[] p = new MyPoint.mypoint[100];
        int n, h = 0, k = 0;
        double x, y, max = 0;
        System.out.print("nhap so diem: ");
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            p[i] = new MyPoint.mypoint();
            System.out.println("diem " + i + ": ");
            System.out.print("x= ");
            x = in.nextDouble();
            p[i].setX(x);
            System.out.print("y= ");
            y = in.nextDouble();
            p[i].setY(y);
        }


        for (int i = 1; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (p[i].distance(p[j]) > max) {
                    max = p[i].distance(p[j]);
                    h = i;
                    k = j;
                }
        System.out.println("khoang cach max la: " + max + " giua 2 diem: " + h + " " + k);
    }
}

