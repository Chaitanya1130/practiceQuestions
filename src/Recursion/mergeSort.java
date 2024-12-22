package Recursion;
import java.util.*;
public class mergeSort {

    public static void merge(int[]arr,int start,int mid,int end){
        int []temp=new int[arr.length];
        int s=start;
        int e=mid+1;
        int pointer=0;
        while(s<= mid && e<=end){
            if(arr[s]<=arr[e]){
                temp[pointer++]=arr[s++];
            }
            else{
                temp[pointer++]=arr[e++];
            }
        }
        while(s<=mid){
            temp[pointer++]=arr[s++];
        }
        while(e<=end){
            temp[pointer++]=arr[e++];
        }
        for (s=start,pointer=0;s<=end;s++,pointer++){
            arr[s]=temp[pointer];
        }

    }
    public static void mergesort(int []arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergesort(arr,start,mid);//used for looking after the left sub array
            mergesort(arr,mid+1,end);//used for looking after the right sub array
            merge(arr,start,mid,end);//used for merging
        }
        else{
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

        mergesort(arr,0,size-1);
        System.out.print("Sorted array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");

        }    }
}
