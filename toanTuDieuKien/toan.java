package toanTuDieuKien;

import java.util.Scanner;

public class toan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a = ");
        int a = sc.nextInt();
        String ketQua = (a % 2 == 0) ? "so chan" : "so le";
        System.out.println(a + " la " + ketQua);
    }
}
