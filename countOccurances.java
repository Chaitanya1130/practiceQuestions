import java.util.*;

import java.util.HashMap;

public class countOccurances {

    private static int result(int []arr,int key){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> i: map.entrySet()){
            if(key==i.getKey()){
                return i.getValue();
            }
        }
        System.out.println(map);
        return 0;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,3,3,4,4,5,5,-1,2,4};
        int target=12;
        System.out.println(result(arr,target));
    }
}
