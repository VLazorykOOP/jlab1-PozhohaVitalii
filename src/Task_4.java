import java.util.Scanner;

public class Task_4 {
Scanner inpt = new Scanner(System.in);
String[] text;
String alphabetPatern = "abcdefghijklmnopqrstuvwxyz";
    int size=0;
    public void setText(){
        System.out.print("Welcome to task 4: ");
    System.out.println("how many rows in your text are ? (int):");
    size = inpt.nextInt();
    text = new String[size];
    System.out.println("Write you text here (small characters): ");
    String trash=inpt.nextLine();
    int i=0;
    for (i=0;i<size;i++){
    text[i] = inpt.nextLine();
    }
    System.out.println();
    for (i=0;i<size;i++){
        System.out.println();
        System.out.println(text[i] + "    " + text[i].length());
    }
    System.out.println();
        for (i=0;i<size;i++){
            stringSplitAndShowFunc(text[i]);
        }
}
public void stringSplitAndShowFunc(String textRow){
        System.out.println();
        String[] words = textRow.split("[ ,.:;-?!]+");
        int i=0;
        for(i=0;i< words.length;i++){
            if (alphabetPatern.contains(words[i])){
                System.out.println(words[i]);

            }
            else {}
        }

}



}
