package mypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DayOne {
    public static void main(String[] args) {
        // arrays in java
        // object type
        // array name created in stack
        // reference created in stack

        // syntax
        // datatype [] variable-name = new datatype [size];

        int [] rolls; // declaration in the stack // at compile-time
        rolls = new int[4]; // initialization in the heap // at the run-time
        // stored in heap memory as: [0,0,0,0]

        // methods of inserting the values of arrays
        //1
//        rolls[0] = 11;
//        rolls[1] = 51;
//        rolls[2] = 118;
//        rolls[3] = 101;

        // simple way to print
        //System.out.println(Arrays.toString(rolls));

        //2
        // by user-input
//        Scanner in = new Scanner(System.in);
//        for(int i=0; i<rolls.length; i++){
//            rolls[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(rolls));

        //3
        // direct initialization
        rolls = new int[]{27, 9, 179, 46};
        // System.out.println(Arrays.toString(rolls));

        // now about printing the array
        //1
        // using for loop
//        System.out.print("[");
//        for(int j=0; j<rolls.length; j++){
//            // System.out.println(rolls[j]);
//            System.out.print(rolls[j] + ",");
//        }
//        System.out.println("]");

        //2
        // using for-each loop
//        for (int each_element: rolls){  // for every element in array, print the element
//            System.out.println(each_element);
//        }

        //3
        // using built-in function
        // System.out.println(Arrays.toString(rolls));
        // Arrays is the class
        // toString is a method
        // to see the docx -> take the cursor to the method and click on ctrl + B
        // and ye it opens up. cool



        // object type arrays
//        String [] str = new String[]{"a","b","c"};
//        System.out.println(Arrays.toString(str));

        // applying the change
        // thus shows mutable behavior of java
//        change(str);
//        System.out.println(Arrays.toString(str));

        // java allows only "call-by-value" means only passing a copy



        // now about 2-D arrays
//        int [][] mat = new int[3][]; // declaration
//        //1
//        mat = new int[][]{
//                {1,2,3}, //0th index
//                {4,5,6}, //1st index
//                {7,8,9}  // 2nd index
//        };
//        for (int i=0; i<mat.length; i++){
//        System.out.println(Arrays.toString(mat[i]));
//        }
        //2
        // accepting user-input
        Scanner sc = new Scanner(System.in);
//        int [][] a = new int [3][3];
//        System.out.println("Enter the values for the matrix:");
//        for (int j=0; j<a.length; j++){
//            // a.length will give the row count
//            // a[j].length will give the column count
//            for(int k=0; k<a[j].length; k++){
//                a[j][k] = sc.nextInt();
//            }
//        }

        // output of 2-d array
        //1
//        for (int i=0; i<a.length; i++){
//        System.out.println(Arrays.toString(a[i]));
//        }

        //2
//        for(int r=0; r<a.length; r++){
//            for(int c=0; c<a[r].length; c++){ // this loop is for array at index a[r]
//                System.out.print(a[r][c]+" ");
//            }
//            // after new column a new line
//            System.out.println();
//        }

        //3
        // using for-each loop
//        for (int[] each_row:a){
//            for (int each_column:each_row){
//                System.out.print(each_column + " ");
//            }
//            System.out.println();
//        }

        //4
        // using for-each loop
//        for(int[] each_row:a){
//            System.out.print(Arrays.toString(each_row)+" ");
//            System.out.println();
//        }


        //variableMatrix();

        // dynamic arrays - ArrayList
        // dynamicArray();

       // dynamicTwoDArray();

        // below are questions
        // queOne();
        //queTwo();
        // queThree();



    }
    private static void change (String [] arr){
        arr[1] = "ridhi"; // passing the copy but here changing the reference variavle
        // reference variable is arr[1]
    }
    private static void variableMatrix(){
        int [][] mat = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for(int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void dynamicArray(){

        // dynamic arrays are the ArrayList
        // primitive types are not the input
        // wrapper classes are
        // has got some built-in function to add() and get() operate on

        ArrayList<Integer> list = new ArrayList<>(3);

        // add() function is used to add the values to the arraylist
        //1
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);

        //2
        // user-input
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< 6; i++){
            list.add(sc.nextInt());
        }

        // functions available in ArrayList
        // dynamically manages the size of the list

        //contains()
        // System.out.println(list.contains(55));

        // get() - same like list[0]
        // System.out.println(list.get(2));

        // System.out.println(list);
        // set(index,value) - change the value in arraylist
        // list.set(3,12);

        // System.out.println(list);

    }
    private static void dynamicTwoDArray(){
        // using 2-d arraylist
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(2);

        // initializing the ArrayList
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

        // passing in the values to the arraylist
        for(int r=0; r<3; r++){
            for(int c=0; c<3; c++){
                list.get(r).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }

    private static void queOne(){
        // queOne is to swap the two indexes
        int[] array = {2,67,89,223,12,43};
        System.out.println(Arrays.toString(array));

        // function to swap
        swap(array, 0,3);
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }

    private static void queTwo(){
        // queTwo is to find the largest in the array
        int[] array = {2,67,-6789,223,12,43};
        System.out.println(Arrays.toString(array));
        //System.out.println("Maximum value is at index: "+ maxInArray(array));
        //System.out.println("Maximum value is at index in range: "+ maxInArrayRange(array,1,5));

        // function to find
    }
    private static int maxInArray(int[] arr){
        int maxValue=arr[0];
        int index=0;
        if(arr.length ==0){
            // array is empty
            return -1;
        }
        for(int i=1; i<arr.length-1; i++){
            if(maxValue < arr[i]){
                maxValue=arr[i];
                index = i;
            }
        }
        return index;
    }
    private static int maxInArrayRange(int[] arr, int start, int end){
        int maxValue=arr[start];
        int index=0;
        if(arr.length ==0){
            // array is empty
            return -1;
        }
        for(int i=1; i<=end; i++){
            if(maxValue < arr[i]){
                maxValue=arr[i];
                index = i;
            }
        }
        return index;
    }

    private static void queThree(){
        // reverse the given array
        int[] array = {2,67,-89,223,12};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    private static void reverse(int[] arr){
        // start and end are index pointers
        // two pointer method
        int start = 0;
        int end = arr.length -1;
//        if (arr.length==0){
//            System.out.println("Empty array");
//        }
        while(start<end){
            // swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
