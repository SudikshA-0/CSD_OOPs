package Test1;


abstract public class QuickRide {
    int Price;
    int refund;

    abstract void cancel();

    public static void main(String[] args) {
        cab cab = new cab();
        cab.Price = 500;
        System.out.println("Cab booking request (ID: CAB101)");
        cab.refund = 300;
        cab.cancel();
        System.out.println();

        train train = new train();
        train.Price = 1200;
        System.out.println("Train ticket booking (ID: TRN202)");
        train.refund = 1000;
        train.cancel();
        System.out.println();

        bus bus = new bus();
        bus.Price = 200;
        System.out.println("Bus booking request (ID: BUS303)");
        bus.cancel();
    }
}




