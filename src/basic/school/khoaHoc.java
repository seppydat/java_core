package basic.school;

public class khoaHoc {
    public String name;
    public int soLop;
    public int demBaiTap;

    public khoaHoc(String name, int soLop, int demBaiTap) {
        this.name = name;
        this.soLop = soLop;
        this.demBaiTap = demBaiTap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSoLop() {
        return soLop;
    }

    public void setSoLop(int soLop) {
        this.soLop = soLop;
    }

    public int getDemBaiTap() {
        return demBaiTap;
    }

    public void setDemBaiTap(int demBaiTap) {
        this.demBaiTap = demBaiTap;
    }

}
