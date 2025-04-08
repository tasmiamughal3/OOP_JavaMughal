class Circle{
double radius ;
String color;

public Circle(){
this.radius=0;
this.color="";
}
void calculateArea(){
double Area = Math.PI*radius*radius;
System.out.println("The area of the circle : "+Area);
}


public static void main(String args []){

Circle red_circle = new Circle();

Circle green_circle = new Circle();
red_circle.radius = 4.5;
red_circle.color="Red";
green_circle.radius = 2.4;
green_circle.color="Green";
System.out.println("Radius of red circle: " + red_circle.radius);
        System.out.println("Radius of green circle: " + green_circle.radius);

        red_circle.calculateArea();
        green_circle.calculateArea();
    }
}