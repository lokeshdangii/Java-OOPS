/*
    Interface is declared using interface keyword, 
    The class is responsible to provide implementation 
    Every method present inside interface is public and abstract.

    Whenever we are implementing any interface method, compulsory we should declare that method as public 
    Whenever we are implementing an interface, each and every method of that interface should be provide implementation otherwiese compiler will give error.

    To get secure from error we have two ways:-
        1. Provide implementation to all interface methods and if not want to provide implementation, then
        2. Make that class a abstract class. 
*/

interface Interf{
    void m1();
    void m2();
}

abstract class ServiceProvider implements Interf{

    public void m1(){

    }
}

class SubServiceProvider extends ServiceProvider{
    public void m2(){
        
    }
}



/*
2nd way --> Make that class a abstract class.

interface Interf{
    public void m1();
    public void m2();
}

abstract class ServiceProvider implements Interf{

    public void m1(){

    }

}

*/

