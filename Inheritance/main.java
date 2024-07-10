package Inheritance;

class Animal {
    int legs = 4;

    String eats() {
        return "Food";
    }

    void sayHi(){
        System.out.println("Hello");
    }
}

class Dog extends Animal {
    void DogLegs() {
        System.out.printf("Dog has %d legs\n", super.legs);
    }

    void DogEats() {
        System.out.printf("Dog eats %s\n", super.eats());
    }

    @Override
    void sayHi(){
        System.out.println("Kya bolti company kamayle bhot money");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.DogLegs();
        dog.DogEats();

        dog.sayHi();
    }
}
