package Recursion;
import java.util.*;
public class towerOfHanoi {
    public static void hanoi(int n,char source,char destination,char temp){
        if(n<0){
            return;
        }
        else{
            hanoi(n-1,source,temp,destination);
            System.out.println("Moving disk " + n + " from " + source + " to " + destination);
            hanoi(n-1,temp,source,destination);

        }
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of plates");
        int n=sc.nextInt();
        hanoi(n,'A','B','C');
    }
}
