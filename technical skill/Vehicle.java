public class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class car extends Vehicle{
    @Override
    void start() {
        super.start();
        System.out.println("Car - specific system");
    }
}


class Main{
    
}