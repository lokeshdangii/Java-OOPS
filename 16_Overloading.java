/*
    Two methods are said to be overloaded if and only if both methods having same name but different argument types.
    for ex:-
            m1(int)
            m1(float)

            we don't need to worry about the return type and modifiers


    C doesnot support overloadin concept i.e two methods can not have same name.
    for ex:- 
        abs(int)  // in C we can not use abs for long and float there exist labs & fabs method/
        labs(long)
        fabs(float)
    
    But as java supports overloading there we can use same name methods for int, long and float
    i.e.
        abs(int)
        abs(float)
        abs(long)

    Advantages:-
    
    Provides more flexibility and reduces complexity for the programmer.
 */


class O16_Overloading {
    public static void m1(){
        System.out.println("No arg method");
    }

    public static void m1(int i){
        System.out.println("Int arg method");
    }

    public static void m1(double d){
        System.out.println("double arg method");
    }

    public static void main(String[] args) {

        // O16_Overloading a = new O16_Overloading();
        // a.m1();
        // a.m1(255);
        // a.m1(234.324);

        m1();
        m1(24);
        m1(23.34343);

        // on calling m1 for char it will get promoted to int so it wouldn't give any error.
        // This type of concept is call auto promotion in overloading  --> case 1
        m1('a');
        m1(20l); // long data type will be promoted to double as there is a m1 method for double arguments.
    }

}

/*
    Case 1:- 

    Case 1: Automatic promotion in overloading.

     In overloading if compiler is unable to find the method with exact match we
    won't get any compile time error immediately.

     1st compiler promotes the argument to the next level and checks whether the
    matched method is available or not if it is available then that method will be
    considered if it is not available then compiler promotes the argument once again
    to the next level. This process will be continued until all possible promotions still
    if the matched method is not available then we will get compile time error. This
    process is called automatic promotion in overloading.

    Method Resolution:- The process of which method to execute 
    In method overloading,  method resolution care was always taken by comiler based on reference type.

    Mehtod overloading is also known as Compile time polymorphism or static polymorphism or early binding.

    Automatic promotion of data type also occurs in method overloading.


    order of promotion of data types:-

    byte --> Short\
                    \_---> int --> long --> float --> double. 
                Char/
 */


// Case 2:- 
class Test{

    public void m1(Object O){
        System.out.println("Object Version...");
    }
    public void m1(String s){
        System.out.println("String Version....");
    }

    public static void main(String[] args) {
        Test t = new Test();

        t.m1(new Object());  // Object Version
        t.m1("Java");
        t.m1(null); //null is applicable for both object and String, So which m1 will be executed?

    // Ans :- If parent and child arguments are there, always child will get the chance, if the child is not mathched then only we will go to parent.
    }
}


/*
 O/P:--
    Object Version...
    String Version....
    String Version....
If the child arg method is not there then automatically parent method will get the chance.
Object class is the parent of String class. 
In overloading  exact match will always get the Highest Priority, if both parents and child methods matched then child will get the priority
 */

// case 3
class Test3{
    public void m1(String s){
        System.out.println("String Version..");
    }

    public void m1(StringBuffer sb){
        System.out.println("String Buffer version....");
    }

    public static void main(String[] args) {
        
        Test3 t = new Test3();
        t.m1("Lokesh");
        t.m1(new StringBuffer("Lokeshh"));
        // t.m1(null); // CE reference to m1 is ambiguous
    }
}
/*
        Object
         /\
        /   \
       /     \
    String   StringBuffer

    When there is no relation between parent and child and null matches with both String and String buffer, the compiler will give error.
 */


// case4 -->
 class Test4{
    // var arg method concept come for 1.5V
    public void m1(int i){
        System.out.println("General Method");
    }

    public void m1(int... i){
        System.out.println("var-arg method");
    }

    public static void main(String args[]){
        Test4 t = new Test4();
        t.m1();                 //  var-arg method  
        t.m1(10,20,35);    //  var-arg method
        t.m1(5);  // General Method will get chance because it is old concept 
    }
 }

 /* 
    For single argument both methods get matched but Whenever a old and new concept fight then old concept is always going to win. In java old is gold  
*/