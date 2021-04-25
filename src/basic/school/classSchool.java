package basic.school;

import java.util.ArrayList;
import java.util.List;

public class classSchool {
    public List<people> teachers = new ArrayList<>();
    public List<people> students = new ArrayList<>();
    public String vanBanDinhDanh;

    public List<people> getTeacher() {
        return teachers;
    }

    public void setTeacher(List<people> teacher) {
        this.teachers = teacher;
    }

    public List<people> getStudents() {
        return students;
    }

    public void setStudents(List<people> students) {
        this.students = students;
    }

    public String getVanBanDinhDanh() {
        return vanBanDinhDanh;
    }

    public void setVanBanDinhDanh(String vanBanDinhDanh) {
        this.vanBanDinhDanh = vanBanDinhDanh;
    }
}
