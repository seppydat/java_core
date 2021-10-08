package exam.assign.bai_2;

public class LoopNumber {
    int min = 0;
    int max = 100;

    public void printEvenNumber(){
        try {
            for (int i=min; i<=max; i++) {
                long index = (long) (Math.random()*(10-1) + 1);
                if (i%2 == 0) {
                    System.out.println(i + "\n");
                }
                Thread.sleep((long) (300 - index*20));
            }
        } catch (InterruptedException ignored) {}
    }

    public void printOddNumber() {
        try {
            for (int i=min; i<max; i++) {
                long index = (long) (Math.random()*(10-1) + 1);
                if (i%2 != 0) {
                    System.out.println("--" + i + "\n");
                }
                Thread.sleep((long) (180 - index*20));
            }
        } catch (InterruptedException ignored) {}
    }
}
