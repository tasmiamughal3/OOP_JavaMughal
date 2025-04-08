import java.util.Scanner;
class Book{
 String title;
 String Author;
 boolean isAvaliable;
 
 Book(String title,String Author)
  {
   this.title=title;
   this.Author=Author;
   this.isAvaliable=true;
  } 
 void borrowBook()
 {
    if(isAvaliable)
    {
      isAvaliable=false;
      System.out.println("Book has been borrowed");
    }
    else{
      System.out.println("Book is Already borrowed");
    }
 }

 void returnBook()
 {
  isAvaliable=true;
  System.out.println("Book is Avalable"); 
 }

 void displayBookDetail()
 {
   System.out.println("Book Name :"+title);
   System.out.println("Authore Name:"+Author);
 }

 void status()
 {
   if(isAvaliable)
   {
     System.out.println("Avalible");
   }
   else
   {
     System.out.println("Not Avalible");
   }
 }


public static void main(String []args){
 Book b=new Book("ABSOLUTE JAVA","Safeeullah Shaikh");
 b.displayBookDetail();
 b.borrowBook();
 b.status();
 b.borrowBook();
 b.returnBook();
 b.status();
 b.borrowBook();

}
}