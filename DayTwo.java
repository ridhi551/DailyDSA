package mypack;

import java.util.Arrays;

public class DayTwo {
    public static void main(String[] args) {

        int[] arr = {12,345,2,6,7896};
        int target = 3;
//        System.out.println(linearSearch(arr,target));
//        System.out.println(elementLinearSearch(arr,target));
//        System.out.println(boolLinearSearch(arr,target));
//        System.out.println(searchInString("Ridhi",'r'));
//        System.out.println(searchInString2("Ridhi",'y'));

//        System.out.println(findMax(arr));
//        System.out.println(findMin(arr));

//        int[][] array = {{1,2,3},{3,4},{3,9}};
//
//        System.out.println(Arrays.toString(searchIn2DArray(array, target)));
//        System.out.println(max(array));

        System.out.println(countEvenDigits(arr));

    }
    private static int linearSearch(int[] arr, int target){
        int index=-1;

        if(arr.length == 0){
            return index;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                index = i;
                return index;
            }
        }
        return index;
    }
    private static int elementLinearSearch(int[] arr, int target){
        int value=Integer.MAX_VALUE;
        if(arr.length==0){
            return value;
        }
        for(int element : arr){
            if (element == target){
                value = element;
                return value;
            }
        }
        return value;

    }
    private static boolean boolLinearSearch(int[] arr, int target){
        boolean present = false;
        for(int element: arr){
            if(element == target){
                present = true;
            }
        }
        return present;
    }
    private static boolean searchInString(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
    private static boolean searchInString2(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    private static boolean searchInRange(String str, char ch, int start, int end){
        if(str.length()==0){
            return false;
        }

        for(int i = start; i<=end; i++){
            if(str.charAt(i)==ch){
                return true;
            }

        }
        return false;
    }

    private static int findMax(int[] arr){
        int index = -1;
        int maxValue = arr[0];
        if(arr.length ==0){
            return index;
        }
        for(int i=0; i< arr.length; i++){
            if(maxValue<arr[i]){
                maxValue = arr[i];
                index = i;
            }

        }
        return index;
    }
    private static int findMin(int[] arr){
        int index = -1;
        int minValue = arr[0];
        if(arr.length ==0){
            return index;
        }
        for(int i=1; i< arr.length; i++){
            if(minValue>arr[i]){
                minValue = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int[] searchIn2DArray(int [][] arr, int target){


        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static int max(int[][] arr){
        int maxValue=Integer.MIN_VALUE;

        for(int[] row :arr){
            for(int col: row){
                if(maxValue < col){
                    maxValue = col;

                }

            }
        }
        return maxValue;
    }

    private static int countEvenDigits(int[] arr){
        int digitCount=0,count=0;


        for(int i=0; i< arr.length; i++){
            if(arr[i]<0){
                arr[i] *= -1;
            }
            if(arr[i]==0){
                return 1;
            }
            while(arr[i]>0){
                digitCount++;
                arr[i]= arr[i]/10;
            }
            if(digitCount %2 ==0){
                count++;
            }
            digitCount=0;
        }

        // code to count number of digits is:
        //int num = (int)(Math.log10(arr[i]) + 1)
        return count;
    }

    private static int maximumWealth(int[][] accounts){
        int wealth = 0;

        for(int[] person: accounts){
            for(int wealthInEachAccount: person ){
                wealth += wealthInEachAccount;
            }
        }

        return wealth;
    }

}
