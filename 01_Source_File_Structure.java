/*

01_Java Source file structure introduction :-

                    
 * A java program can contain any number of class but atmost only one class can be declared as public.

 * If there is no public class then we can use any name for a java program there is no restrictions.
 * But if there is any public class assume that class B{} is public then compulsorily the name of the java program shoulb be B.java only.
 
 * More than one public class is not allowed because public means outside person can access, So to the outside person only one  class can be exhibited (accessed).

 * Many people think that the class which have the main method, that class name will the name of the program but there is no relation between the proram name and the Main() function. If there are multiple classes than multiple classes can hava Main function and we can use any name for the program if there is no public class in the program. 
*/

class A{
    public static void main(String args[]){
        System.out.println("A Class Main method");
    }
}

class B{
    public static void main(String args[]){
        System.out.println("B Class Main method");
    }
}


class C{
    public static void main(String args[]){
        System.out.println("C Class Main method");
    }
}

class D{

}

/*
As we have four class in our program and now when I compile this program few questions arise.
    
    Q1 : How may .class file will be generate ?
    Q2 : which Main method will be executed first?
    

    Ans1 : The important point is whenever we are compiling a Java program, for every class present in a program a separate (.class) file will be generated. Very unfortunate the program name (01_OOPS.java) class  will not be generated because there is no (01_OOPS) class in the program. 
  
    Remember, We can compile a Java program or source file (i.e .java) but we can run a Java class file  not a program. 


    Ans2 : No main method will be executed first, whichever class file we execute(run) its main method will be executed. 
    Whenever we are executing A class, A class main method will be executed.  ($ java A) 

    Q3 : What happens if there is no main function in any class ?
    Ans3 : On executing that class file we will get error. ($ java D) --> Error: Main method not found in class 

    Q4 : What happens if there is no program name class file ?
    Ans4 : $ java 01_OOPS --> Error: Could not find or load main class 01_OOPS 
*/
