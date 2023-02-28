import java.util.Scanner;

public class Task_4 {
Scanner inpt = new Scanner(System.in);
String[] text;
String alphabetPatern = "abcdefghijklmnopqrstuvwxyz";
    String alphabetPatern1 = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";
    int size=0;
    public void setText(){
        System.out.print("Welcome to task 4: ");
    System.out.println("how many rows in your text are ? (int):");
        while (!inpt.hasNextInt()) {
            inpt.next();
            System.out.println("Not a number! ");

        }

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
        int i=0,j=0;
        for(i=0;i< words.length;i++){


            char[] f = words[i].toCharArray();
            lim:
            for (j=0;j<f.length;j++){
                if (Character.UnicodeBlock.of(f[j]) == Character.UnicodeBlock.BASIC_LATIN ){

                    if (alphabetPatern.contains(words[i])){
                        System.out.println(words[i]);
                    i++;
                    break lim;
                }
            }
                for (j=0;j<f.length;j++){
                    if (Character.UnicodeBlock.of(f[j]) == Character.UnicodeBlock.CYRILLIC ){

                        if (alphabetPatern1.contains(words[i])){
                            System.out.println(words[i]);
                            i++;
                            break lim;
                        }
                    }



            }


        }

}



}}
