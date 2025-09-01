package Abstraction;

 abstract public class vehicle {
    int no_tyres;
    void common(){
        System.out.println("This is common");
    }
    abstract void stop();
    public static void main(String[] args) {

        Car car = new Car();
        car.no_tyres=4;
        car.stop();
    }
}
