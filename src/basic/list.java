package basic;

import java.util.*;

public class list {
    public static void maxList(List<Integer> a) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); ++i) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
            else{
                continue;
            }
        }
        System.out.println("max = " + max);
    }

    public static void minList(List<Integer> a) {
        int min = a.get(0);
        for (int i = 1; i < a.size(); ++i) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
            else{
                continue;
            }
        }
        System.out.println("min = " + min);
    }

    public static void chiaHetList(List<Integer> a, int x) {
        Set list = new HashSet();

        for (Object oldList : a) {
            if ((int)oldList % x == 0) {
                list.add(oldList);
            }
        }

        System.out.println("danh sach so chia het cho "+ x + " la: ");
        for (Object set : list) {
            System.out.print(set + ", ");
        }
    }



    public static void main(String[] args) {
        int n;
        List a = new ArrayList();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua list: ");
        n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            System.out.print("Phan tu thu " + (i+1) + ": ");
            a.add(input.nextInt());
        }

        maxList(a);
        minList(a);
        System.out.print("Nhap so muon chia het: ");
        int x = input.nextInt();
        chiaHetList(a, x);

        input.close();
    }
}
