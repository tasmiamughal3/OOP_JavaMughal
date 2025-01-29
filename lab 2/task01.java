import java.util.Scanner;
class task01{
public static void main(String[]args){


Scanner input= new Scanner(System.in);
char const_arr[]={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
char userinput=input.next().charAt(0);

boolean isconstant=false;

for(int i=0;i<=const_arr.length;i++)
{
if(userinput==const_arr[i])
{
isconstant=true;
break;
}
}

if(isconstant){
System.out.print("constant");

}

else {
System.out.print(" not a constant");
}

}
}