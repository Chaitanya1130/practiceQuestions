//Write a function to merge 2 integer arrays sorted in a non-descending order
//        merge2Arrays(array1, m, array2, n)
//        - Note the size of the Array 1 is  m+n
//        - Size og Array 2 is n
//        - You need to merge Array 2 into Array1 and resulting array should be sorted
//          in non-descending order
//        - Don't create another array, use Array1.

//[1,2,3,4,5]   [10,20,30]
//[]
import java.util.*;
public class MergetwoArrays {

    public static void merge(int[] arr1,int size1,int[] arr2,int size2){
//        arr1 = new int[size1 + size2];
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        //front approach did not work
//        int pointer=0;
//        int firstPointer=0;
//        int secondPointer=0;
//        while(firstPointer<size1 && secondPointer<size2){
//            if(arr1[firstPointer]<arr2[secondPointer]){
//                arr1[pointer++]=arr1[firstPointer++];
//            }
//            else if(arr1[firstPointer]>arr2[secondPointer]){
//                arr1[pointer++]=arr2[secondPointer++];
//
//            }
//        }
//        while(firstPointer<size1){
//            arr1[pointer]=arr1[firstPointer];
//            firstPointer++;
//            pointer++;
//        }
//        while(secondPointer<size2){
//            arr1[pointer]=arr2[secondPointer];
//            secondPointer++;
//            pointer++;
//
//        }
        int totallength=size1+size2;
        int pointer=totallength-1;
        int backone=size1-1;
        int backtwo=size2-1;
        while(backone>=0 && backtwo>=0){
            if(arr1[backone]<=arr2[backtwo]){
                arr1[pointer]=arr2[backtwo];
                backtwo--;
            }
            else if(arr1[backone]>=arr2[backtwo]){
                arr1[pointer]=arr1[backone];
                backone--;

            }
            pointer--;
        }
        while(backtwo>=0){
            arr1[pointer--]=arr2[backtwo--];
        }
//        while(backone>=0){
//            arr1[pointer--]=arr1[backone--];
//        }


 }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter length of array2");
        int size2=sc.nextInt();
        int[] arr2=new int[size2];
        System.out.println("Enter elements of array2");
        for (int i = 0; i < size2; i++) {
            arr2[i]=sc.nextInt();
        }
        System.out.println("array2 is: ");
        for (int i = 0; i < size2; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("Enter length of array1");
        int size1=sc.nextInt();
        int[] arr1=new int[size1+size2];
        System.out.println("Enter elements of array1");
        for (int i = 0; i < size1; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("array1 is: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        merge(arr1,size1,arr2,size2);
        System.out.println("Merged array: " + Arrays.toString(arr1));
    }
}
