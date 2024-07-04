/*
    Abstract Class --> Partially implemented class

    If a class is not completed due to some reason or the body(implementation) is not appropriate, then this partially implemented classes are declare as abstract.
    If we feel implementation is not appropriate, then happily we can declare class as abstract.

    If the class implementation is not proper, inappropriate then the object creation is not allowed. That's why we can create a object of the abstract class. 

    Instantiation of an abstract class is not possible.


    If a class contains atleast one abstract method, then compulsorily the class must be declare as abstract because if a class have abstact method it means the class is completely implemented, and if the class is not delcared absract then a user can create a object and can call that abstact method which doesn't contain any implementation.

    Abstract class may contation zero or many abstract methods.
    Eventhou if a class doesnot contain any abstract method then also we can declare it abstract if we feel implementation is not appropriate or incompleted.
 */

// Class must be declared abstract if it contains abstract method.
abstract class Test{
    public abstract void m1();
    public void m2(){}
}

// A class can be declared abstract if it doesn't contain abstract method.
abstract class Demo{
    public void m1(){}
    public void m2(){}
    public void m3(){}
    public void m4(){}
}
