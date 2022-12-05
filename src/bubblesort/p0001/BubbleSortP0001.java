/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort.p0001;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HE170417
 */
public class BubbleSortP0001 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int input;  //get user Input
        int [] numberList; // create an array of numbers
        Scanner sc = new Scanner(System.in);  // create an Object of java.util.Scanner package to get user data form IO
        
        Random rand = new Random(); // create an Object of java.util.Random to get some random value number;
        System.out.println("Pleanse enter the array's range: ");
        input = sc.nextInt(); //get value from user
        numberList = new int[input];
        //get some random value and put to the array
        for(int i =0; i<input; i++){
            numberList[i] = rand.nextInt(10)+1;
        }
        System.out.print("The array given: ");
        display(numberList);
//        bubbleSort(numberList);
        theNewBubbleSort(numberList);
        System.out.print("The sorted array:");
        display(numberList); 
    }
    static void display(int[] numberList){
        System.out.print("{ ");
        //loop to search each element in order to print
        for(int i =0; i<numberList.length;i++){
            //print to the console
            System.out.print(numberList[i]+" ");
        }
        System.out.print("} \n");
    }
    static void bubbleSort(int[] numberList){
        int temp;
        /**
         * First we need 2 loops
         * the mechanism of this sort method is the largest number will be sinking down while the smallest number will be floating up
         * this algorithm first will compare 2 adjacent numbers. the larger number will be on the right and the smaller one will be on the left and so on
         * This algorithm will take n-1 times scanning the array and each time needs n-i-1 times to compare every each 2 elements
         * n is the length of array
         */
        for(int i =0; i<numberList.length-1;i++){
            for(int j = 0; j<numberList.length-i-1;j++){
                if(numberList[j]>numberList[j+1]){
                    temp = numberList[j];
                    numberList[j] = numberList[j+1];
                    numberList[j+1] = temp;
                }
            }
        }
    }
    public static void theNewBubbleSort(int []n){
        int i, temp;
        boolean swapped;
        do{
            swapped = false;
            for(i = 0; i<n.length-1;i++){
                if(n[i]>n[i+1]){
                    temp = n[i];
                    n[i] = n[i+1];
                    n[i+1] =temp;
                    swapped = true;
                }
            }
            //test
        }while(swapped);
    }
}
