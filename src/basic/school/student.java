package basic.school;

public class student extends people{
    public static int rootId = 0;
    public int numberOfStudent;

    public student(String name, int age){
        super(name, age);
        this.numberOfStudent = ++rootId;
    }

    public student(){}

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

}
