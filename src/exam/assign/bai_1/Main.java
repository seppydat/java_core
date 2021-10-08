package exam.assign.bai_1;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> student = new HashMap<>();
        String name;
        String phone;
        Scanner in = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Student "+ (i+1));
            System.out.print("Input Name: ");
            name = in.nextLine();
            if (name.equals("x") || name.equals("X")) {
                break;
            }
            System.out.print("Input phone: ");
            phone = in.nextLine();
            if (phone.equals("x") || phone.equals("X")) {
                break;
            }
            student.put(name, phone);
        }
        in.close();

        for (String i : student.keySet()) {
            System.out.printf("[%s - %s]\n", i, student.get(i));
        }

    }
}
