package basic.hinhHoc;

public class hinhTamGiac extends hinhHoc{
    public double chieuCao;
    public double canhDay;

    public hinhTamGiac(double chieuCao, double canhDay) {
        this.chieuCao = chieuCao;
        this.canhDay = canhDay;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanhDay() {
        return canhDay;
    }

    public void setCanhDay(double canhDay) {
        this.canhDay = canhDay;
    }

    @Override
    public double CalculSurface() {
        return (chieuCao*canhDay)/2;
    }

    public static void main(String[] args) {
        hinhHoc tamGiac = new hinhTamGiac(4.5, 7.5);
        hinhHoc hcn = new hinhChuNhat(5.5, 6.7);

        System.out.println("Dien tich hinh tam giac: " + tamGiac.CalculSurface());
        System.out.println("Dien tich hinh chu nhat: " + hcn.CalculSurface());
    }
}
