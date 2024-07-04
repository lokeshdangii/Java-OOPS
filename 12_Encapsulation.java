/*
    Encapsulation:- The process of grouping(encapsulating) data members and corresponding methods into a single unit   
    Example:- Every java class is an example of encapsulation.

    If any component follows data hiding and abstraction that component is said to be encapsulated component 
    Encapsulation = Data hiding + abstraction

    Example:-

    class Account{

        private double balance;

        public double getBalance(){
            // Validations
            return balance;
        }

        public void setBalance(double amount){

            this.balance = this.blance + amount;
        }
    }

    Althoug the above methods are not abstract but the enduser in not aware of how balance is accessed and updated, enduser is unaware of internal implementation, So we can say the above component i.e Account is following abstraction and is a encapsulated component.

    Hiding data behind method is the concept of Encapsulation.

    What is the main advantage of encapsulation?
    Ans:- All the advantage of Data hiding and abstractions are the advantages of encapsulation because encapsulation is not a new term it is a [data hiding + abstraction]

    1. Security
    2. Enhancement is easy
    3. improves Maintainability & Modularity
    4. It provides flexibility to the user to use system very easily.

    Disadvantages:-

    As for every data member we implememt getter and setter as well as validation in it, this increases the length of code and slows down execution.

 */

class Student{
    
    // Data members
    String name;
    int age;
    String school;
    String course;
    int roll;

    // methods

    public void write(){}
    public void read(){}
    public void play(){}


}