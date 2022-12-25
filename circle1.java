public class circle1 {
int r;
double peri, area;
 public circle1(int r) {
peri= 2*Math.PI*r;
area= Math.PI *r*r;
}
public static void main(String[] args) {
circle1 C1= new circle1(10);
circle1 C2= new circle1(7);
System.out.println("Perimeter of C1 is :" + C1.peri);
System.out.println("Area of C1 is: "+C1.area);
System.out.println("Perimeter of C2 is :"+C2.peri);
System.out.println("Area of C2 is: " + C2.area);
if (C1.area > C2.area) {
System.out.println("Circle 1 is bigger than Circle 2 ");
} else if (C2.area > C2.area) {
System.out.println("Circle 2 is bigger than Circle 1");
}else{ System.out.println("Both circle are equal ");
}
}
}

