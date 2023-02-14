import java.util.Scanner;

public class Main {
    static Task_1 LOBJ1 = new Task_1();
    static Task_2 LOBJ2 = new Task_2();
    static Task_3 LOBJ3 = new Task_3();
    static Task_4 LOBJ4 = new Task_4();
    public static void task_1(){
        LOBJ1.modeAsk();
        LOBJ1.signAsk();
        LOBJ1.exerciseCalculation();
        LOBJ1.showResults();
    }
    public static void task_2(){
        LOBJ2.inputManager("OO");
        LOBJ2.calculations();
        LOBJ2.showResult();

    }
    public static void task_3(){
        LOBJ3.setMatrix();
        LOBJ3.findMin();
    }
    public static void task_4(){

    }

    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Choice task to test (1,2,3,4)");
        switch (pop.nextInt()) {
            case (1):
                task_1();
            case (2):
                task_2();
            case (3):
                task_3();
            case (4):
                task_4();
        }
	// write your code here
        System.out.println("Lab 1 Java");
    }


}
