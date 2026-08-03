class Phone {
    void turnOn() {
        System.out.println("Phone is turning on");
    }
}

class SmartPhone extends Phone {
    @Override
    void turnOn() {
        super.turnOn();
        System.out.println("SmartPhone is loading apps and internet services");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.turnOn();
    }
}
