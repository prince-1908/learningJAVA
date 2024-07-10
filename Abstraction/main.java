package Abstraction;

abstract class myClass{
    abstract void draw();
}
class myChildClass extends myClass{
    void draw(){
        System.out.println("i am a shape");
    }
}

interface Inter{
    void sayHi();
}
class ChildInter implements Inter{
    public void sayHi(){
        System.out.println("hello world");
    }
}

class Main {
    public static void main(String[] args){
        myChildClass child = new myChildClass();
        child.draw();

        ChildInter childInter = new ChildInter();
        childInter.sayHi();
    }
}
