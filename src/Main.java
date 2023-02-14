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
        System.out.print("Welcome to task 2: ");
        LOBJ2.inputManager("OO");
        LOBJ2.calculations();
        LOBJ2.showResult();

    }
    public static void task_3(){
        LOBJ3.setMatrix();
        LOBJ3.findMin();
    }
    public static void task_4(){
        LOBJ4.setText();
    }

    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);
        System.out.println("Choice task to test (1,2,3,4,5(exit))");
           do {

               System.out.println("1-Exercise");
               System.out.println("2-Two vectors");
               System.out.println("3-Matrix");
               System.out.println("4-Text");
               System.out.println("type: ");
               switch (pop.nextInt()) {
                   case (1):
                       task_1();
                       break;
                   case (2):
                       task_2();
                       break;
                   case (3):
                       task_3();
                       break;
                   case (4):
                       task_4();
                       break;
                   case (5):
                       break;
               }
               System.out.println("Ok, good work, you tested one more task, would you try again ? (1-NO 2-YES) ");
           }while (pop.nextInt()>=2);
	// write your code here
        System.out.println("Lab 1 Java");
        System.out.println("complate");
    }


}
