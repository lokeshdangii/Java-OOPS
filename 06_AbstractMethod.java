/*
Abstract Method :- Many times we don't know implementation, then also happily we can declare a method with abstract modifier.
Abstract method has only declaration but not implementation.
Abstract method delcaration end with semi colon not curly braces.
ex --> 

    Public class Vehicle{
        public abstract int getNoofWheels();
    }

    public abstract String getTaste();  -->  taste depends on the type of food.
    public abstract double getInterestRate(); --> interest rate depends on type of Loan;
    
For Abstract methods, child class are responsible for implementation.

If a class contains atleast one abstract method, compulsorily class should be declared as abstract. 

For Example :- Vehicle and their number of Wheels. Until you don't know the type of vehicle you can's say no. of wheels
*/



abstract class Test {
    
    // abstract method --> compulsory ends with semicolon
    public abstract void m1();

    // non abstract method compulsroy have a body i.e.{} 
    public void m2(){
        /*
         * 
         */
    }

    // public void m3(); --> gives CE
}