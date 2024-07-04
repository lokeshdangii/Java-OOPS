/*
    On parent reference we can not call child specific methods as well as variables.
    On chile reference we can call methods and variable of both the child and parent class.

    Parent refernce can be used to hold child class object
 */

class P{
    public void m1(){
        System.out.println("Parent");
    }
}

class C extends P{
    public void m2(){
        System.out.println("Child");
    }
} 

class Test{
    public static void main(String[] args) {
        
        // case1:- Parent reference and parent object
        P p = new P();
        p.m1();
        // p.m2(); // On parent reference we can not call child specific methods.

        // Case2:- Child reference and child object
        C c = new C();
        c.m1();  // valid
        c.m2();  // valid

        // case3:- Parent refernce can be used to hold child class object
        P parent = new C();
        parent.m1();
        // parent.m2();  // Parent is of P type so for the P the m2 method is not available

        // Parent refernce --> child class method eventhough the object is the child class object then also we can not acces child class method because refernce is of P type.


        // case4:- Child reference to hold Parent object -> child reference cannot be used to hold parent object
        // C child = new P(); --> invalid
    }
}


/*
    Types of Inheritance in Java
    1. Single Inheritance:- One parent and one child
    2. Multiple Inheritance:- The process of extending more than one parent class at a time. Java doesn't support multiple inheritance.

    3. Multilevel Inheritance
    4. Hierarchial Inheritance:- from a single class we create multiple child classes.
    5. Hybrid Inheritance:- when used multiple types of inheritance simultaneously  --> Not supported in Java.
*/