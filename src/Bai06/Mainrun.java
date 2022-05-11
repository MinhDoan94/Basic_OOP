package Bai06;

import java.util.Scanner;

public class Mainrun {
    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        while (true) {
            int funtionChoice = funtionChoice();
            switch (funtionChoice) {
                case 1:
                    addMatrix();
                    break;
                case 2:
                    mulMatrix();
                    break;
                case 3:
                    tranposeMatrix();
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã tham gia chương trình!");
                    return;
            }
        }
    }

    private static int funtionChoice() {
        System.out.println("--------- MENU MATRIX---------");
        System.out.println("1. Tính tổng và hiệu hai ma trận.");
        System.out.println("2. Tính tích hai ma trận.");
        System.out.println("3. Tìm chuyển vị của một ma trận.");
        System.out.println("4. Kết thúc chương trình.");
        System.out.print("Xin mời chọn: ");
        int choice = -1;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 & choice <= 4)
                break;
            System.out.println("Nhập sai rồi xin mời bạn nhập lại.");
        } while (true);
        return choice;
    }

    private static void addMatrix() {
        Matrix matrix1 = new Matrix("Xin mời nhập ma trận thứ nhất");
        Matrix matrix2 = new Matrix("Xin mời nhập ma trận thứ hai");
        matrix1.add(matrix2).print("Ma trận tổng là:");
        matrix1.sub(matrix2).print("Ma trận hiệu là:");
    }

    private static void mulMatrix() {
        Matrix matrix1 = new Matrix("Xin mời nhập ma trận thứ nhất");
        Matrix matrix2 = new Matrix("Xin mời nhập ma trận thứ hai");
        matrix1.mul(matrix2).print("Tích hai ma trận là:");
    }
    private static void tranposeMatrix() {
        Matrix matrix1 = new Matrix("Xin mời nhập ma trận");
        matrix1.print("Ma trận vừa nhập là:");
        matrix1.transpose().print("Ma trận chuyển vị là:");
    }
}
