import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {

 private int [][] matrix;
 Scanner inp = new Scanner(System.in);
 private int N;
 public void setMatrix(){
  System.out.println("input matrix size(n): ");
  N = inp.nextInt();
  matrix = new int[N][N];
  System.out.println("input matrix elements(n*n): ");
  int i=0,j=0;

  for(i=0;i<N;i++){
   for(j=0;j<N;j++) {
   matrix[i][j] = inp.nextInt();
   }
  }
  System.out.println();

  for(i=0;i<N;i++){
   for(j=0;j<N;j++) {
    System.out.print( matrix[i][j] +"\t");
   }
   System.out.println();
  }

 }
 private int findRow(){
  int i=0,j=0;
   int[] sum = new int [N];
  for(i=0;i<N;i++){
   for(j=0;j<N;j++) {
    sum[i] += Math.abs( matrix[j][i]);
   }
  }
  int max = 0;
  int indMax = 0;
  for(i=0;i<N;i++){
   if (max<sum[i]){
    max = sum[i];
    indMax = i;
   }
  }
  System.out.println();
  System.out.println(max + "\t " + (indMax+1) );
 return indMax;
 }
public void findMin(){
  int i=0, j=0, index = findRow();
  int min = matrix[0][index], indMin = 0;
 for(i=0;i<N;i++){
  if (min > matrix[i][index]){
   min = matrix[i][index];
   indMin = i;
  }
 }
 System.out.println();
 System.out.println(min + "\t " + (indMin+1) );
}

}