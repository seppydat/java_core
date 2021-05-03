package basic;

import java.io.File;

public class oopClassObject{
    public static void main(String[] args) {
        File dowload = new File("C:\\Users\\Seppy\\Downloads");

        for (File file : dowload.listFiles()) {
            if (file.getName().contains(".pdf")) {
                System.out.println(file.getName());
            }
        }
    }
}
