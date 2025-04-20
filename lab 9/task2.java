import java.util.Scanner;
class Task2{
    public static void isPalindrome(String str){

        String reverse = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }

        if(str.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome : ");
        }
        else
        {
            System.out.println("Not a Palindrome :");
        }
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any word ");
        String word=in.nextLine();

        isPalindrome(word);
    }
}