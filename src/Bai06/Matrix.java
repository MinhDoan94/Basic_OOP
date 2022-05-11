package Bai06;

import java.util.Scanner;

public class Matrix {
    public float[][] a;

    public Matrix(int rows, int cols) {
        a = new float[rows][cols];
    }

    public Matrix(String message){
        System.out.println(message);
        this.input();
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                System.out.print("Matrix["+i+","+j+"]=");
                this.a[i][j] = new Scanner(System.in).nextFloat();
            }
        }
    }


    public float[][] getA() {
        return a;
    }

    public void setA(float[][] a) {
        this.a = a;
    }

    public Matrix add(Matrix m) {
        Matrix matrixAdd = new Matrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                matrixAdd.a[i][j] = this.a[i][j] + m.a[i][j];
            }
        }
        return matrixAdd;
    }

    public Matrix sub(Matrix m) {
        Matrix matrixSub = new Matrix(m.a.length, m.a[0].length);
        for (int i = 0; i < m.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                matrixSub.a[i][j] = this.a[i][j] - m.a[i][j];
            }
        }
        return matrixSub;
    }

    public Matrix neg() {
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                this.a[i][j] = -this.a[i][j];
            }
        }
        return this;
    }

    public Matrix transpose() {
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                this.a[i][j] = this.a[j][i];
            }
        }
        return this;
    }

    public Matrix mul(Matrix m) {
        Matrix kq = new Matrix(this.a.length, m.a[0].length);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < m.a[0].length; j++) {
                for (int k = 0; k < this.a[0].length; k++) {
                    kq.a[i][j] += this.a[i][k] * m.a[k][j];
                }
            }
        }
        return kq;
    }
    public void print(String message){
        System.out.println(message);
        for (int i = 0; i < this.a.length; i++) {
            for (int j = 0; j < this.a[0].length; j++) {
                System.out.print(this.a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void input(){
        System.out.print("Nhập vào số hàng của ma trận: ");
        int row = new Scanner(System.in).nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        int column = new Scanner(System.in).nextInt();
        this.setA(new float[row][column]);
    }
}
