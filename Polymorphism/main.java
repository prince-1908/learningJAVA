package Polymorphism;

class Sum{
    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class Animals{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animals{
    @Override
    void sound(){
        System.out.println("Bark");
    }
}

class Constr{
    Constr(int a, int b){
        System.out.println(a+b);
    }

    Constr(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
class Main{
    public static void main(String[] args){
        Sum sum = new Sum();
        sum.sum(2,3);
        sum.sum(2,3,4);

        Animals animal = new Animals();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Constr constr = new Constr(1, 2);
        Constr const2 = new Constr(1, 2, 3);
    }
}