package This;

class This{
    int value = 0;

    This(){
        // this(0);
        System.out.println("I am constructor");
    }

    This(int value){
        System.out.println("I am parameterized constructor");
        this.value = value;
    }

    // Referring to Instance Variables
    void hey(int value){
        System.out.println(this.value);
        System.out.println(value);
    }

    // returning current class instance
    This getInstance(){
        return this;
    }

    // Passing the Current Object as a Parameter
    void display(int value){
        System.out.println(value);
    }

    void show(This obj){
        display(obj.value);
    }

    void method(){
        show(this);
    }

    //  Invoking Methods of the Current Object
    void methodAgain(){
        this.method();
    }
}
class Main {
    public static void main(String[] args){
        This t = new This();
        t.hey(5);

        This t2 = t.getInstance();
        t2.hey(69);

        This t3 = new This(66999);
        t3.method(); 

        t3.methodAgain();
    }
}
