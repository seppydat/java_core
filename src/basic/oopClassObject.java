package basic;

import java.io.File;

public class oopClassObject{
    public static void main(String[] args) {
        File dowload = new File("C:\\Users\\Seppy\\Downloads");

        for (String file : dowload.list()) {
            System.out.println(file);
        }
    }
}
