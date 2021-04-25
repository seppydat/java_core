package basic.congNhan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class congNhan {
    private String name;
    private double salary;

    private congNhan(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    private static congNhan[] sortCongNhan (congNhan[] congNhans) {
        for (int i = 0; i < congNhans.length-1; ++i) {
            for (int j = i+1; j < congNhans.length; ++j) {
                if (congNhans[i].salary > congNhans[j].salary) {
                    congNhan tmp;
                    tmp = congNhans[i];
                    congNhans[i] = congNhans[j];
                    congNhans[j] = tmp;
                }
            }
        }
        return congNhans;
    }
    public static void main(String[] args) {
        congNhan[] congNhans = new congNhan[4];

        Scanner input = new Scanner(System.in);

        // nhập thông tin công nhân
        for (int i = 0; i<congNhans.length; ++i) {
            String name;
            double salary;

            System.out.print("Nhap ten cong nhan "+(i+1) +" : ");
            name = input.nextLine();
            System.out.print("Nhap muc luong: ");
            salary = Double.parseDouble(input.nextLine());

            congNhans[i] = new congNhan(name, salary);
        }

        // xắp xếp công nhân theo lương giảm dần
        congNhans = congNhan.sortCongNhan(congNhans);
        // in ra các công nhân
        for (congNhan a : congNhans) {
            System.out.println(a.name + " ----> " + a.salary);
        }
    }
}
