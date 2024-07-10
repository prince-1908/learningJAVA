package Constructor;

class PapaClass{
    PapaClass(){
        System.out.println("Mein to papa hu.. is pure package ka papa..");
    }
}

class myClass extends PapaClass{
    int value;

    // default constructor
    myClass(){
        this.value = 0;
    }

    //  parameterized constructor
    myClass(int val){
        this.value += val;
    }

    // copy Constructor
    myClass(myClass obj){
        this.value = obj.value;
    }

    // constructor chaining
    myClass(float val){
        this(69);
    }

    // calling parent constructor
    myClass(boolean val){
        super();
    }

    void console(){
        System.out.println(value);
    }
}

class Main {
    public static void main(String[] args){
        myClass cls = new myClass();
        cls.console();

        myClass cls2 = new myClass(5);
        cls2.console();

        myClass cls3 = new myClass(cls2);
        cls3.console();

        myClass cls4 = new myClass(4.27f);
        cls4.console();

        myClass cls5 = new myClass(true);
        cls5.console();
    }
}
