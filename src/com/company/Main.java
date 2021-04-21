package com.company;
import basic.Student;

public class Main {

    public static void main(String[] args) {

        Student b = new Student();
        b.getName("dat");
        b.getClass("bkd02k11");
        b.getC((float)2.7);
        b.getPhp(8.5f);
        float tb = b.diemTrungBinh();
        String kq = b.xepHang();
        System.out.println("diem trung binh: "+tb+"\n"+"Xep loai: "+kq);
    }

}