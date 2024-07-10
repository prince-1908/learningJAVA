package classesAndObjects;

class Hello{
    String name;
    Hello(String name){
        this.name = name;
    }

    void sayHi(){
        System.out.printf("Hello Mr. %s", this.name);
    }
}
class Main{
    public static void main(String[] args){
        Hello h = new Hello("Prince");
        h.sayHi();
    }
}