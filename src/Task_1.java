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

        System.out.println("Select mode (in int !!!)( 1:double-double   2:int-double   3:double-int )");
        Scanner N = new Scanner(System.in);
        mode = N.nextInt();
    }
    public void signAsk() {
        System.out.println("input A and B parameters");
        Scanner P = new Scanner(System.in);
        switch (mode){
            case (2):
                a = P.nextInt();
                b = P.nextInt();
                break;
            case (3):
                A = P.nextDouble();
                B = P.nextDouble();
                break;
            default:
                A = P.nextDouble();
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
