class task{
 public static void main(String[]args){
 String text="level";
 String rev="";

 for(int i=text.length()-1;i>=0;i--){
    rev=rev+(text.charAt(i));}
 if(text.equals(rev)){
 System.out.print("palindrome ");
 }
 else{
  System.out.print(" not palindrome");  
 }
 }
}