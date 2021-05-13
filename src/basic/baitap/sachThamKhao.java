package basic.baitap;

import java.util.Scanner;

public class sachThamKhao extends book{
    private final String nameTable = "sachthamkhao";

    public void showMenuStk () {
        super.showMenu("Sach tham khao");
    }

    @Override
    public void showAll() {
        super.showDataAll(this.nameTable);
    }

    @Override
    public void showByName() {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ten muon tim kiem: ");
        name = in.nextLine();
        super.showDataByName(this.nameTable, name);
    }

    @Override
    public void add() {
        Scanner in = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        String author;
        int namXuatBan;
        String nhaSanXuat;
        String theLoai;

        System.out.println("=== Them sach tham khao ===");
        System.out.print("Nhap ten: ");
        name = in.nextLine();
        System.out.print("Nhap gia: ");
        price = Double.parseDouble(in.nextLine());
        System.out.print("Nhap so luong: ");
        quantity = Integer.parseInt(in.nextLine());
        System.out.print("Nhap tac gia: ");
        author = in.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(in.nextLine());
        System.out.print("Nhap nha san xuat: ");
        nhaSanXuat = in.nextLine();
        System.out.print("Nhap the loai: ");
        theLoai = in.nextLine();
        if (insertData(name, price, quantity, author, namXuatBan, nhaSanXuat, theLoai)) {
            System.out.println("them sach thanh cong");
        }
        else {
            System.out.println("that bai");
        }
    }

    public boolean insertData(String name, double price, int quantity, String author, int namXuatBan, String nhaSanXuat, String theLoai) {
        String sql = "INSERT INTO " + this.nameTable +"(name, price, quantity, author, theLoai, namXuatBan, nhaSanXuat)"
                + " VALUES('"+name+"',"+price+","+quantity+",'"+author+"','"
                +theLoai+"',"+namXuatBan+",'"+nhaSanXuat+"')";
        return super.db.runSQL(sql);
    }

    @Override
    public void edit() {
        System.out.println("Dang bao tri update sach tham khao");
    }

    @Override
    public void delete() {
        int id;
        System.out.println("Nhap id cua sach: ");
        Scanner in = new Scanner(System.in);
        id = in.nextInt();

        if (super.destroy(this.nameTable, id)) {
            System.out.println("Xoa thanh cong");
        }
        else {
            System.out.println("that bai");
        }
    }
}
