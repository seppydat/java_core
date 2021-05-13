package basic.baitap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int option;

        do {
            System.out.println("====== Menu ======");
            System.out.println("1 - SGK");
            System.out.println("2 - sach tham khao");
            System.out.println("3 - tap chi");
            System.out.println("4 - out");
            System.out.print("Moi nhap lua chon: ");
            Scanner in = new Scanner(System.in);
            option = in.nextInt();
            switch (option) {
                case 1: {
                    sachGiaoKhoa sgk = new sachGiaoKhoa();
                    sgk.showMenuSgk();
                    break;
                }
                case 2: {
                    sachThamKhao stk = new sachThamKhao();
                    stk.showMenuStk();
                    break;
                }
                case 3: {
                    tapChi tc = new tapChi();
                    tc.showMenuTapChi();
                    break;
                }
                case 4: {
                    System.out.println("ban da thoat chuong trinh!");
                    break;
                }
                default: {
                    System.out.println("tam thoi chua co lua chon nay!");
                    break;
                }
            }
        } while (option != 4);
    }
}
