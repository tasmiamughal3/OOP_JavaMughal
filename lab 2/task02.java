import java.util.Scanner;
class task02{
public static void main(String []args){
 Scanner input=new Scanner(System.in);
System.out.print("Enter the elements of Array");
int []num=new int [10];
int sum=0;
for(int i=0;i<num.length;i++)
{
  num[i]=input.nextInt();
if(num[i]%4==0){
  sum=sum+num[i];
}

}
System.out.println(sum);
}

}