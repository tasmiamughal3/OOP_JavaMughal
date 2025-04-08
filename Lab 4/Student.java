class Student{
String name;
int [] grades;
String id;


Student(int [] num,String name,String id){
this.name=name;
this.id=id;
grades=num;
}
void displayInfo(){
System.out.println("name :" +"\t"+name);
System.out.println("id :"+"\t"+id);
for(int num:grades){
System.out.println(num+"  ");
}
}
public void avg(){
int sum=0;
for(int num:grades){
sum+=num;
}
System.out.println("Average :" +sum/5);

}
public void percentage(){
int obtained=0;
for(int num:grades){
obtained+=num;
}

System.out.println("Percentage :"+(obtained/500.0)*100);
}

public static void main(String args[]){
int num[]= {30,60,70,80,90};
int num2[]={60 ,50 ,30,20,90};
  Student s = new Student(num,"Safeeullah","AI0234");

  Student s2 = new Student(num2,"Kashif","Fr0234");
  s.displayInfo();
  s.avg();
 s.percentage();
  s2.displayInfo();
  s2.avg();
 s2.percentage();
}
}