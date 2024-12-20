//Problem 1
//An e-commerce platform offers discounts when a customer buys three products
// whose total cost equals a specific target price. For instance, if the target price is $100,
// the platform needs to identify all combinations of three products from the catalog whose
// prices sum up to $100.
//
//        Details:
//
//The catalog has a list of product prices: [30, 20, 50, 40, 10, 25, 15, 35].
//The target price for the discount is $100.
//The goal is to find combinations of three prices from the catalog that meet the target price.
//



import java.util.*;
public class ecomm {
    public static  List<List<Integer>> combinations(int arr[],int target) {
        Arrays.sort(arr);
        int size = arr.length;
        List<List<Integer>>res = new ArrayList<List<Integer>>();
        for(int i=0;i<size;i++){
            int start=i+1;
            int end=size-1;
            while(start<end){
                int sum=arr[i]+arr[start]+arr[end];
                if(sum<target){
                    start++;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    res.add(Arrays.asList(arr[i],arr[start],arr[end]));
                    start++;
                    end--;

                }
            }
        }

        return res;
    }



public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements: ");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("Enter the target value: ");
    int target=sc.nextInt();
    List<List<Integer>> result=combinations(arr,target);
    for(List<Integer> i:result){
        System.out.println(i);
    }

}
}
