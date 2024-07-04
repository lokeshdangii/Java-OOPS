/*
    Whenever we are extending an abstract class, for each and every abstract method of the parent, compulsory provide the implementation in the child class. Otherwiese, we will get CE
 */

abstract class Test{
    public abstract void m1();
    public abstract void m2();
}

class subTest extends Test{
    public void m1(){}
    public void m2(){}
}


/*
    To get rid of this error we have two ways 
        1. Either you can provide implementaion of all Abs Method in the sub class and if don't know the implementation
        2. then declare the class as abstract then it would be the responsibily of the next level child class to implement it.
 */

 abstract class Test2{
    public abstract void m1();
    public abstract void m2();
}

abstract class subTest2 extends Test2{
    public void m1(){}
}

class subsubTest2 extends subTest2{
    public void m2(){

    }
}


// Vehicle example implementation

abstract class Vehicle{
    abstract public int getNoOfWheels();
}

class Bus extends Vehicle{
    public int getNoOfWheels(){
        return 6;
    }
}

class Auto extends Vehicle{
    public int getNoOfWheels(){
        return 3;
    }
}

class Demo{
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println("No. of wheels in a bus : " +b.getNoOfWheels() );

        Auto a = new Auto();
        System.out.println("No. of wheels in a auto : " +a.getNoOfWheels() );
    }
}



/*
    What is the advantage of declaring an abstract method in the parent class?
    If we don't declare abs method in parent class, then child class may or may not implement that method but if we declare abstract method in the parent, then for child it is compulsory to implement that method.
    
    Above every child class of Vehicle should compulsory provide implementation for getNoOfWheels(), if we have such type of programming requirement then declare this class and method as abstract.

    So for child class which method to provide implementation such methods we have to identify and we have to declare as abstract in the parent and then without implementing that child class can not skip implementation. It is mandatory for the child class to provide implementation.
 */

