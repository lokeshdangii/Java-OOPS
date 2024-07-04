/*
    Member Level Modifier

    1.Public:- If a method or variable is declared public then we can acess that member from anywhere i.e within a class, outside the class, within a package or outside the package.

    Before checking visibily of the member, Java comulsory check visibility of the class. If the class is visible than only we have to think of memeber visibilty.
    if the class is not accessible eventhough a member is public it is of no use.


    2. Default:- if a memeber is declared as default we can only access that member within a current package.So, Default access is also known as package level access


    3. Private:- A private member is only accessible within a same class. So private means class level.

    4. Protected:- If a variable or method declared as protected, within the current package anywhere you can access but, outside pakcage only can access in child class.

    Protected member from outside package you can access only in the child class and you should use child class reference only.  i.e B b = new B() and not A a = new B();

   
    Highly recommended modifier for data member(variable) is private
    recommended modifier for method is pubic.

    Private:- class level
    Default:- package level
    Public:-  Global level
    Protected:- Default + Child(kids)

    Easily Accessible :- Private < Default < Protected < Public
 */

package pack1;

// public class O08_MemberLevelModifier {
    
// }

class A{

    // public void m1(){
    void m1(){
        System.out.println("A class Method");
    }
}





