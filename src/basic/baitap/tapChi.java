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
    public void edit() {
        System.out.println("update");
        int option;
        int id;
        System.out.print("Nhap id muon update: ");
        Scanner in = new Scanner(System.in);
        id = Integer.parseInt(in.nextLine());
        do {
            System.out.println("=== update tap chi id = "+id+" ===");
            System.out.println("1 - update name");
            System.out.println("2 - update price");
            System.out.println("3 - update nha san xuat ");
            System.out.println("4 - back");
            option = Integer.parseInt(in.nextLine());

            switch (option) {
                case 1:{
                    String nameColumn = "name";
                    String nameNew;
                    System.out.print("Nhap name new: ");
                    nameNew = in.nextLine();
                    if (super.update(this.nameTable, nameColumn, nameNew, id)) {
                        System.out.println("Update thanh cong");
                    }
                    else {
                        System.out.println("that bai!");
                    }
                    break;
                }
                case 2:{
                    String nameColumn = "price";
                    double priceNew;
                    System.out.print("Nhap price new: ");
                    priceNew = Double.parseDouble(in.nextLine());
                    if (super.update(this.nameTable, nameColumn, priceNew, id)) {
                        System.out.println("Update thanh cong");
                    }
                    else {
                        System.out.println("that bai!");
                    }
                    break;
                }
                case 3:{
                    String nameColumn = "nhaSanXuat";
                    String nhaSanXuatNew;
                    System.out.print("Nhap nha san xuat new: ");
                    nhaSanXuatNew = in.nextLine();
                    if (super.update(this.nameTable, nameColumn, nhaSanXuatNew, id)) {
                        System.out.println("Update thanh cong");
                    }
                    else {
                        System.out.println("that bai!");
                    }
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("tam thoi chua co chuc nang nay!");
                    break;
                }
            }
        } while (option != 4);
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
