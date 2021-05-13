package basic.baitap;

import basic.db.mysqliconn;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public abstract class book {
    protected final mysqliconn db = new mysqliconn("localhost", "testjava", "root", "");

    public void showMenu (String category) {
        int option;
        do {
            System.out.println("=== "+category+" ===");
            System.out.println("1 - show all");
            System.out.println("2 - show by name");
            System.out.println("3 - add");
            System.out.println("4 - update");
            System.out.println("5 - delete");
            System.out.println("6 - back");
            System.out.print("Moi nhap lua chon: ");
            Scanner in = new Scanner(System.in);
            option = in.nextInt();
            switch (option) {
                case 1:{
                    this.showAll();
                    break;
                }
                case 2:{
                    this.showByName();
                    break;
                }
                case 3:{
                    this.add();
                    break;
                }
                case 4:{
                    this.update();
                    break;
                }
                case 5:{
                    this.delete();
                    break;
                }
                case 6:{
                    break;
                }
                default:{
                    System.out.println("tam thoi chua co lua chon nay!");
                    break;
                }
            }
        } while (option != 6);
    }

    public void showAll() {
        System.out.println("show all");
    }

    public void showDataAll(String table) {
        try {
            String sql = "SELECT * FROM " + table;

            ResultSet result = db.selectData(sql);
            ResultSetMetaData data = result.getMetaData();
            // lay ten cot
            StringBuilder print = new StringBuilder();
            for (int i = 1; i <= data.getColumnCount(); ++i) {
                print.append(data.getColumnName(i)).append("\t");
            }
            System.out.println(print);
            while (result.next()) {
                StringBuilder row = new StringBuilder();
                for (int i = 1; i <= data.getColumnCount(); ++i) {
                    row.append(result.getString(i)).append("\t");
                }
                System.out.println(row);
            }
            db.closeConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void showByName() {
        System.out.println("show by name");
    }

    public void showDataByName(String table, String name) {
        try {
            String sql = "SELECT * FROM " + table + " WHERE `name` like '%" +name+"%'";
            ResultSet result = db.selectData(sql);
            ResultSetMetaData data = result.getMetaData();
            // lay ten cot
            StringBuilder print = new StringBuilder();
            for (int i = 1; i <= data.getColumnCount(); ++i) {
                print.append(data.getColumnName(i)).append("\t");
            }
            System.out.println(print);
            while (result.next()) {
                StringBuilder row = new StringBuilder();
                for (int i = 1; i <= data.getColumnCount(); ++i) {
                    row.append(result.getString(i)).append("\t");
                }
                System.out.println(row);
            }
            db.closeConnect();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void add() {
        System.out.println("add");
    }

    public void update() {
        System.out.println("update");
    }
    public void delete() {
        System.out.println("delete");
    }

    public boolean destroy(String nameTable, int id) {
        try{
            String sql = "DELETE FROM "+nameTable+" WHERE `id` = "+id;
            db.runSQL(sql);
            return false;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return true;
        }
    }
}
