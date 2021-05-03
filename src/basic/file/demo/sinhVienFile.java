package basic.file.demo;

import java.io.*;
import java.util.Scanner;

public class sinhVienFile {
    public static String url = "C:\\Users\\Seppy\\Desktop\\file\\sinhVien.txt";
    public static File file = new File(url);

    public static void showAllSV () throws IOException {
        BufferedReader fileRead = new BufferedReader(new FileReader(file));
        String line = fileRead.readLine();
        while (line != null) {
            System.out.println(line);
            line = fileRead.readLine();
        }
    }

    public static void themSV () throws IOException {
        FileWriter fileWrite = new FileWriter(file, true);
        String content;
        // truong thong tin
        String name, address;
        int age;
        double salary;
        Scanner input = new Scanner(System.in);

        // lay thong tin
        System.out.println("--- THEM SINH VIEN MOI ---");
        System.out.print("Nhap ten: ");
        name = input.nextLine();
        System.out.print("Nhap tuoi: ");
        age = Integer.parseInt(input.nextLine());
        System.out.print("Nhap muc luong: ");
        salary = Double.parseDouble(input.nextLine());
        System.out.print("Nhap dia chi: ");
        address = input.nextLine();

        // ghi vao file
        content = "\n\t" + name + "\t" + age + "\t" + salary + "\t" + address;
        fileWrite.write(content);
        fileWrite.flush();
        fileWrite.close();
    }
}
