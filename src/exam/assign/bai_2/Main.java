package exam.assign.bai_2;

public class Main {
    public static void main(String[] args) {
        LoopNumber loop = new LoopNumber();

        new Thread(loop::printEvenNumber).start();
        new Thread(loop::printOddNumber).start();
    }
}
