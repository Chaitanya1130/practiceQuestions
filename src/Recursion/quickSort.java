package Recursion;

import java.util.Scanner;

public class quickSort {
    public static void swap(int[]arr,int element1,int element2){
        int temp=arr[element1];
        arr[element1]=arr[element2];
        arr[element2]=temp;
    }
    public static int partition(int[]arr,int start,int end){
        int p=arr[end];
        int l=start;
        int e=end-1;
       while(l<e){
           while(arr[l]<=p && l<end){
               l++;
           }
           while(arr[e]>p && e>start){
               e--;
           }
           if(l<e){
               swap(arr,l,e);
           }

       }
       swap(arr,l,end);
       return l;
    }
    public static void quicksort(int[]arr,int start,int end){
        if(start<end){
            int p=partition(arr,start,end);
            quicksort(arr,start,p-1);
            quicksort(arr,p+1,end);

        }
    }    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size= sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
            System.out.println("------------------------------------");
        }

        quicksort(arr,0,size-1);
        System.out.print("Sorted array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }
    }
    }

