package basic.baitap;

import java.util.Scanner;

public class tapChi extends book{
    private final String nameTable = "tapchi";

    public void showMenuTapChi () {
        super.showMenu("tap chi");
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
        String nhaSanXuat;

        System.out.println("=== Them tap chi ===");
        System.out.print("Nhap ten: ");
        name = in.nextLine();
        System.out.print("Nhap gia: ");
        price = Double.parseDouble(in.nextLine());
        System.out.print("Nhap nha san xuat: ");
        nhaSanXuat = in.nextLine();
        if (insertData(name, price, nhaSanXuat)) {
            System.out.println("them sach thanh cong");
        }
        else {
            System.out.println("that bai");
        }
    }

    public boolean insertData(String name, double price, String nhaSanXuat) {
        String sql = "INSERT INTO " + this.nameTable +"(name, price, nhaSanXuat)"
                + " VALUES('"+name+"',"+price+",'"+nhaSanXuat+"')";
        return super.db.runSQL(sql);
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        int id;
        System.out.println("Nhap id cua sach: ");
        Scanner in = new Scanner(System.in);
        id = Integer.parseInt(in.nextLine());

        if (!super.destroy(this.nameTable, id)) {
            System.out.println("Xoa thanh cong");
        }
        else {
            System.out.println("that bai");
        }
    }
}
