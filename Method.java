
class Inheritence {

    // Parent Class
    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound.");
        }
    }

    static class Dog extends Animal {
        void sound() {
            super.sound();
            System.out.println("Dog barks.");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();

    }
}