/*
    Rules of overriding

    1. In overriding method names and arguments must be same. That is method
    signature must be same.

    2. Until 1.4 version the return types must be same but from 1.5 version onwards co-
    variant return types are allowed.

    3. According to this Child class method return type need not be same as Parent
    class method return type its Child types also allowed.

    4. Overriding concept is not applicable for private methods, but based on our requirement we can define the same private method in the child class also but there is no relation btw the child and Parend method.

    5. Parent class final methods we can't override in the Child class.

    6. Parent class non final methods we can override as final in child class. We can
    override native methods in the child classes.

    7. while overriding we can reduce the scope of the method i.e access modifier like from public to protected.
 */

class P{
    public Object m1(){
        return null; 
    }
}

class C extends P{
    public String m1(){
        return "kuch bhi";
    }
}