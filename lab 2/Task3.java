import java.util.Scanner;
class Task3{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);   
System.out.print("Enter value of row:");
int row=input.nextInt();
System.out.print("Enter value of column:");
int col=input.nextInt();

int sum=0;
int arr[][]=new int[row][col];
int arr2[][]=new int[row][col];
for(int i=0;i<row;i++)
    {
    for(int b=0;b<col;b++)
    {
        System.out.print("Enter value of arr:");
        arr[i][b]=input.nextInt();

    }
}
for(int i=0;i<row;i++)
    {
        for(int b=0;b<col;b++)
    {
    System.out.print("Enter value of arr2:");
        arr2[i][b]=input.nextInt();

    }
    }
for(int i=0;i<row;i++)
    {
        System.out.print ("\n ");
        for(int b=0;b<col;b++)
    {
    System.out.print (arr[i][b]+arr2[i][b]+"  ");
    }




}




}
}