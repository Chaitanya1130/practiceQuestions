package searching_sorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;


public class groupAnagrams {
    public static List<List<String>> groupanagrams(String arr[]) {
        //create a map which has key:sorted string and value:list of strings corresponding to the key
        Map<String, List<String>> map = new HashMap<>();
        for (String i : arr) {
            //convert the strings to char array and sort them and convert them back to string
            char[] charArray = i.toCharArray();
            Arrays.sort(charArray);
            String newString = String.valueOf(charArray);
            //if newstring is present in the key->add it to the list
            map.computeIfAbsent(newString,key->new ArrayList<>()).add(i);

        }
        return new ArrayList<>(map.values());

    }
    public static void main(String[] args) {
        String arr[]={"eat","bat","cat","tab"};
        List<List<String>> result=groupanagrams(arr);
        for(List<String> i:result){
            System.out.print(i);
        }
    }
}



