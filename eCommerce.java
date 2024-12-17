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
public class eCommerce {

    public static List<List<Integer>> combinations(int [] arr,int target){
        HashSet<List<Integer>> combos=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        List<Integer>ret=Arrays.asList(arr[i],arr[j],arr[k]);
                        ret.sort(null);
                        combos.add(ret);
                    }
                }
            }
        }

        List<List<Integer>> answer=new ArrayList<>(combos);
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the value of the target");
        int target=sc.nextInt();
        List<List<Integer>> result=combinations(arr,target);
        for(List<Integer>i:result){
            System.out.print("[");
            for(int ii:i){
                System.out.print(ii);
            }
            System.out.print("]");
        }
    }
}
