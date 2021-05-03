package basic.file.demo;

import java.io.IOException;
import java.util.Scanner;

public class mainDemo {
    public static void menu () throws IOException {
        int n;
        System.out.println("======== Menu ========");
        System.out.println("1. show danh sach");
        System.out.println("2. them sinh vien");
        System.out.println("0. thoat");
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("\nNhap lua chon: ");
            n = input.nextInt();
            switch (n) {
                case 1: {
                    //show danh sach
                    sinhVienFile.showAllSV();
                    break;
                }
                case 2: {
                    // them sinh vien vao
                    sinhVienFile.themSV();
                    break;
                }
                default: {
                    System.out.println("Khong co chuc nang nay !");
                }
            }
            if (n == 0) {
                System.out.println("Ban da ket thuc chuong trinh !");
            }
        } while (n != 0);
    }

    public static void main(String[] args) throws IOException {
        menu();
    }
}
