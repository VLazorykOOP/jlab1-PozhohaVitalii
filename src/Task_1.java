import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.rint;

public class Task_1 {
    private  int mode;
    private  double A,B;
    private int a,b;
    private int c;
    private double C;
    Task_1(){
        mode = 1;
    }
    public void modeAsk(){
        System.out.print("Welcome to task 1: ");
        System.out.println("select mode (in int !!!)( 1:double-double   2:int-double   3:double-int )");
        Scanner N = new Scanner(System.in);
        while (!N.hasNextInt()){
            N.next();
            System.out.println("Not a number! ");
        }
        mode = N.nextInt();
    }
    public void signAsk() {
        System.out.println("input A and B parameters");
        Scanner P = new Scanner(System.in);
        switch (mode){
            case (2):
                while (!P.hasNextInt()){
                    P.next();
                    System.out.println("Not a number! ");
                }
                a = P.nextInt();
                while (!P.hasNextInt()){
                    P.next();
                    System.out.println("Not a number! ");
                }
                b = P.nextInt();
                break;
            case (3):
                while (!P.hasNextDouble()){
                    P.next();
                    System.out.println("Not a number!(Double) ");
                }
                A = P.nextDouble();
                while (!P.hasNextDouble()){
                    P.next();
                    System.out.println("Not a number!(Double) ");
                }
                B = P.nextDouble();
                break;
            default:
                while (!P.hasNextDouble()){
                    P.next();
                    System.out.println("Not a number!(Double) ");
                }
                A = P.nextDouble();
                while (!P.hasNextDouble()){
                    P.next();
                    System.out.println("Not a number!(Double) ");
                }
                B = P.nextDouble();
                break;
        }
    }
    public void exerciseCalculation(){
        switch (mode){
            case (2):
                C = a + ((a + b - 1) / (pow(a,2) + 2)) - pow(a * b, 3);
                break;
            case (3):
                c = (int) rint(A + ((A + B - 1) / (pow(A,2) + 2)) - pow(A * B,3));
                break;
            default:
                C = A + ((A + B - 1) / (pow(A,2) + 2)) - pow(A * B,3);
                break;
        }

    }
    public void showResults(){
        switch (mode){
            case (2):
                System.out.println(C);
                break;
            case (3):
                System.out.println(c);
                 break;
            default:
                System.out.println(C);
                break;
        }


    }



}
