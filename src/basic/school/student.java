package basic.school;

public class student extends people{

    public int numberOfStudent;

    public student(String name, int age, int numberOfStudent){
        super.age = age;
        super.name = name;
        this.numberOfStudent = numberOfStudent;
    }

    public student(){}

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

}
