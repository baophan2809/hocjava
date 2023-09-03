package toan;

import java.util.Scanner;

public class phepToan {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao a = ");
        a = sc.nextInt();
        System.out.print("Nhap vao b = ");
        b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int nhan = a * b;
        System.out.println(a + " * " + b + " = " + nhan);
        float thuong = (float)a / b;
        System.out.println(a + " / " + b + " = " + thuong);
        int soDu = a % b;
        System.out.println(a + " % " + b + " = " + soDu);
    }
}
