package basic.hinhHoc;

public class hinhChuNhat extends hinhHoc{
    public double chieuDai;
    public double chieuRong;

    public hinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    @Override
    public double CalculSurface() {
        return (chieuRong*chieuDai);
    }
}
