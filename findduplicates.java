import java.util.*;
public class findduplicates {

    private static List<Integer> duplicates(int []arr) {
        List<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int size = arr.length;
        System.out.println(answer);
        if (size == 1) {
            return answer;
        }

        int count = 0;
        for(int i=0;i<size;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>1){
                answer.add(i.getKey());
            }
        }
        System.out.println(map);
        return answer;
    }
    public static void main(String[] args) {
        int []arr={4,3,2,7,8,2,3,1};
        List<Integer> answer=duplicates(arr);
        System.out.println(answer);
    }
}
