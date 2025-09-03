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


//package Test;
//
//abstract public class Booking {
//    int amount;
//    int refund;
//
//    abstract void cancel();
//
//    public static void main(String[] args) {
//        Cab cab = new Cab();
//        cab.amount = 500;
//        System.out.println("Cab booking request (ID: CAB101)");
//        cab.refund = 300;
//        cab.cancel();
//        System.out.println();
//
//        Train train = new Train();
//        train.amount = 1200;
//        System.out.println("Train ticket booking (ID: TRN202)");
//        train.refund = 1000;
//        train.cancel();
//        System.out.println();
//
//        Bus bus = new Bus();
//        bus.amount = 200;
//        System.out.println("Bus booking request (ID: BUS303)");
//        bus.cancel();
//    }
//}
//
//class Cab extends Booking {
//    void cancel() {
//        System.out.println("Cab booking cancelled. Refund given = " + refund);
//    }
//}
//
//class Train extends Booking {
//    void cancel() {
//        System.out.println("Train booking cancelled. Refund given = " + refund);
//    }
//}
//
//class Bus extends Booking {
//    void cancel() {
//        System.out.println("Bus tickets cannot be cancelled.");
//    }
//}
