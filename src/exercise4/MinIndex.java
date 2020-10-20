package exercise4;
import java.util.Arrays;
import java.util.Scanner;

public class MinIndex {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int count = input.nextInt();
    int minNumber = 0;
    double[] numbers = new double[count];

    for(int i = 0; i < numbers.length; i++){
      numbers[i] = input.nextInt();
    }

    for(int i = 1; i < count; i++){
      if(numbers[i] < numbers[minNumber]){
        minNumber = i;
      }
    }
    System.out.print("Min index: " + minNumber);
  }
}