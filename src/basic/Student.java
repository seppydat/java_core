package basic;

public class Student {
    private String Name;
    private String Class;
    private float c;
    private float php;

    public void getName(String Name){
        this.Name = Name;
    }

    public void getClass(String Class){
        this.Class = Class;
    }

    public void getC(float mark){
        this.c = mark;
    }

    public void getPhp(float mark){
        this.php = mark;
    }

    public float diemTrungBinh(){
        return (this.php + this.c)/2;
    }

    public String xepHang(){
        float diemTb = this.diemTrungBinh();
        if (diemTb >= 8) {
            return "gioi";
        }
        else if (diemTb >=6 && diemTb <8) {
            return "kha";
        }
        else if (diemTb >=5 && diemTb <6) {
            return "trung binh";
        }
        else{
            return "khong dat";
        }
    }
}
