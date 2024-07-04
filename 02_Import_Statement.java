import java.util.ArrayList;
import java.util.regex.*;
// import java.util.regex.Pattern;


// 02 About import statement

/*
The biggest advantage of import statement is : 
    1) We don't require to use full qualified name.
    2) Length of the code is going to reduced
    3) Better Readability

Two types of import statements are there :- 
    (1) Explicit import -->  import java.util.AL;   (for particular class)
    (2) Implicit import -->  import java.util.*;

    Explicit import is highly recommended for use. Implicit import is not at all recommended.
*/

/*

Other packages : 
    (1) Java lang package :- String, Thread, Exception, StringBuffer etc.
    java.lang package is not required to import it is by default availabel for every program.
    All Classes and Interfaces present in lang package can be happily accesseble without using any import statement. They are available in every java program. For ex String class. 

    (2) Default packages :- current working directory.
*/

class Test{

    // we can create ArrayList using the FQN Full Qualified Name 
    // ArrayList l = new ArrayList<>();  --> gives error without importing arraylist from utility package
    java.util.ArrayList l = new java.util.ArrayList<>();   // will work fine
    ArrayList list = new ArrayList<>();

    // Lang packages --> Did not require any import statement
    String s = new String("Lokesh");
    Thread t = new Thread();
    Exception e = new Exception();
    StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.call();

        Library R1 = new Library();
        R1.openingTime();
    }
}

/*  
Important point : 
    Whenever we are importing a package all classes and interfaces present in the that package are available but not the subpackage classes.
    If you want to use any class present inside subpackage  compulsory we have to write import statement upto subpackage level

    java
    |
    |__ util
        |
        |__ regex
            |
            |__Pattern

            Ques : To use pattern package which will be the valid option : 

            (1) import java.*
            (2) import java.util*;
            (3) import java.util.regex.*;

            Ans : Option 3 is valid. 
 */


class Demo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");
    }
}