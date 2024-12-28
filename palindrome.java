public class palindrome {

    public static boolean isPalindrome(String string){
        int size=string.length();
        int start=0;
        int end=size-1;
        while(start<end){


            while(string.charAt(start)==' '|| string.charAt(start)==','){start++;}
            while(string.charAt(end)==' '||string.charAt(end)==','){end--;}
            if(string.toLowerCase().charAt(start)!=string.toLowerCase().charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String string="racecar";
        boolean check=isPalindrome(string);
        System.out.println(check);
    }
}
