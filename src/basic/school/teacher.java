package basic.school;

import java.util.ArrayList;
import java.util.List;

public class teacher extends people{
    public List<khoaHoc> khoaHocs = new ArrayList<>();

    public teacher(){}

    public teacher(String name, int age){
        super.age = age;
        super.name = name;
    }

    public List<khoaHoc> getKhoaHocs() {
        return khoaHocs;
    }

    public void setKhoaHocs(List<khoaHoc> khoaHocs) {
        this.khoaHocs = khoaHocs;
    }


}
