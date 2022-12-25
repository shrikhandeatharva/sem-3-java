import java.util.*;
import java.lang.String;
interface Machine {
    void accelerate();
    void start();
    void stop();
    void turn();
}
class Vehicle implements Machine {
    int engine_num;
    int chassis_num;
    void variables(int m, int n) {
        engine_num = m;
        chassis_num = n;
        System.out.println("Engine numer : " + m);
        System.out.println("Chassis number : " + n + "\n");
    }
    public void accelerate() {
        System.out.println("It can be accelerated or deaccelerated. ");
    }
    public void start() {
        System.out.println("It can be started.");
    }
    public void stop() {
        System.out.println("It can be stopped.");
    }
    public void turn() {
        System.out.println("It can be turned.");
    }
}
class Car extends Vehicle {
    void steering() {
        System.out.println("For Car :");
        System.out.println("It has steering.");
    }
}
class Boat extends Vehicle {
    void propeller(){
        System.out.println("For Boat :");
        System.out.println("It has propeller.");
    }
}
class Aeroplane extends Vehicle {
    void wings() {
        System.out.println("For Aeroplane :");
        System.out.println("It has wings.");
    }
}
public class prac7 {
public static void main(String[] args){
    Car c = new Car();
    Boat b = new Boat();
    Aeroplane a = new Aeroplane();
    c.steering();
    c.start();
    c.stop();
    c.turn();
    c.accelerate();
    c.variables(4567,19700);
    b.propeller();
    b.start();
    b.stop();
    b.turn();
    b.accelerate();
    b.variables(5643,98765);
    a.wings();
    a.start();
    a.stop();
    a.turn();
    a.accelerate();
    a.variables(862,86420); 
}
}
