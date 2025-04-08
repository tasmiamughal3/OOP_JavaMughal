class Circle2{
double radius ;
String color;

public Circle2(double radius, String color){
this.radius=radius;
this.color=color;
}
void calculateArea(){
double Area = Math.PI*radius*radius;
System.out.println("The area of the circle : "+Area);
}


public static void main(String args []){

Circle2 red_circle = new Circle2(2.4,"Red");

Circle2 green_circle = new Circle2(4.3,"Green");

System.out.println("Radius of red circle: " + red_circle.radius);
        System.out.println("Radius of green circle: " + green_circle.radius);

        red_circle.calculateArea();
        green_circle.calculateArea();
    }
}


