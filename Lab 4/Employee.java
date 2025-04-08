class Employee{
String name;
int Year_of_joining;
String Adress;


Employee(String name, int Year_of_joining,String Adress){
this.name = name;
this.Year_of_joining= Year_of_joining;
this.Adress=Adress;
}

void display(){
System.out.println(name + " \t " + Year_of_joining+" \t  " + Adress);
}

public static void main(String args[]){
Employee emp1 = new Employee("Asad",2023,"Noor Lakhan");
Employee emp2 = new Employee("Azad",2022,"Shikarpur");
Employee emp3 = new Employee("Haider",2020,"Babrlo");
emp1.display();
emp2.display();
emp3.display();
}
}