import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.*;

public class Task_2 {
private int Aarrey[] = new int[500];
private int n;
private int Barrey[] = new int[200];
private int m;
private int Sum;
private int inputArrey(int T){
    int arreyId=0;
    System.out.println("Welcome to arrey initialization (write 'stop' to stop input)");
    if (T==1){
        Scanner Herro = new Scanner(System.in);
        int i=0;
        while (i<500) {
            if (!Herro.hasNext("stop")) {
                while (!Herro.hasNextInt()){
                    Herro.next();
                    System.out.println("Not a number! ");
                }
                Aarrey[i] = Herro.nextInt();
            }
            else break;
            i++;
        }
        n=i;
        i=0;
        System.out.println("AAaaa is done ");
        arreyId+=1;
    }
    if (T==2){
        Scanner Herro = new Scanner(System.in);
        int i=0;
        while (i<200) {
            if (!Herro.hasNext("stop")) {
                while (!Herro.hasNextInt()){
                    Herro.next();
                    System.out.println("Not a number! ");
                }
                Barrey[i] = Herro.nextInt();
            }else break;
            i++;
        }

        m=i;
        i=0;
        System.out.println("BBbbb is done");
        arreyId+=1000;
    }
 return arreyId;
}


    private int inputArrey(int T,int size){
        int arreyId=0;
        System.out.println("Welcome to arrey initialization (write 'stop' to stop input)");
        if (T==1){
            Scanner Herro = new Scanner(System.in);
            int i=0;
            while (i<size) {

                    while (!Herro.hasNextInt()){
                        Herro.next();
                        System.out.println("Not a number! ");
                    }
                    Aarrey[i] = Herro.nextInt();


                i++;
            }
            n=i;
            i=0;
            System.out.println("AAaaa is done ");
            arreyId+=1;
        }
        if (T==2){
            Scanner Herro = new Scanner(System.in);
            int i=0;
            while (i<size) {

                    while (!Herro.hasNextInt()){
                        Herro.next();
                        System.out.println("Not a number! ");
                    }
                    Barrey[i] = Herro.nextInt();

                i++;
            }

            m=i;
            i=0;
            System.out.println("BBbbb is done");
            arreyId+=1000;
        }
        return arreyId;
    }


public String inputManager(String state) {

    if (true) {

        System.out.println("write int");

        Scanner choice = new Scanner(System.in);
        while (!choice.hasNextInt()){
            choice.next();
            System.out.println("Not a number! ");
        }
        int ch  = choice.nextInt();
        ch =1;

      //  int elem=0;
        switch (ch) {
            case (1):
                System.out.println("A arrey size");
                while (!choice.hasNextInt()) {
                    choice.next();
                    System.out.println("Not a number! ");
                }
                int N = choice.nextInt();
                inputArrey(1,N);
            case (2):
                System.out.println("B arrey size");
                while (!choice.hasNextInt()) {
                    choice.next();
                    System.out.println("Not a number! ");
                }
                int M = choice.nextInt();
                inputArrey(2,M);
        }

/*
        if ((elem % 1000) != 0) {
            char[] stateChars = state.toCharArray();
            stateChars[0] = 'A';
            state = String.valueOf(stateChars);
        }
        if ((elem / 1000) >= 1) {
            char[] stateChars1 = state.toCharArray();
            stateChars1[1] = 'B';
            state = String.valueOf(stateChars1);
        }
        System.out.println(state);
        inputManager(state);
        return state;
    } else {

        return state;
    }*/


}
    //calculations();

    return state;
}

    public void calculations (){
        Sum=0;
        int i=0;
        while (i<max(n,m)) {
            if (i<n){Sum+=Aarrey[i];}
            if(i<m){Sum+=Barrey[i];}
            i++;
        }
    }
    public void showResult(){
        System.out.println();
        System.out.println("AYB ");
        System.out.println();
        int i=0;
        while (i<n) {
            System.out.print(Aarrey[i] + "  ");
            i++;
        }

        i=0;
        while (i<m) {
            System.out.print(Barrey[i] + "  ");
            i++;
        }
        System.out.println();
        System.out.println("in addiction have: "+Sum);
    }
}
