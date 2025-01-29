
import java.util.Scanner;
class Task4
{

public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
String name[]=new String[6];
String choice="Ali";
for (int i=0;i<6;i++)
{
System.out.print("plz Enter value:");
name[i]=input.nextLine();
if (choice.equals(name[i]))
{
System.out.print("Yes Ali is here:");
break;
}


}







}
}