package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int space = 0;

        int[] numbers = new int[count];

        for(int i=0; i<numbers.length; i++){
          for(int e = 0; e < space; e++){
            System.out.print(" ");
          }
          space++;
          System.out.println(numbers[i]);
        }
    } 
}