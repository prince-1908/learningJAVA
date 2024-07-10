package Encapsulation;

class Student{
    private String name;

    void setter(String name){
        this.name = name;
    }

    String getter(){
        return this.name;
    }
}
class Main {
    public static void main(String[] args){
        Student st = new Student();

        st.setter("Prince");

        String name = st.getter();

        System.out.println(name);
    }
}
