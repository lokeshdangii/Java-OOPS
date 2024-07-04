/*
    1. Method Overriding:- If the child class is not satisfied with parent method implementation then the child is allowed to redifine its method based on its requirements, this process is call M  Overriding.

    2. The Parent class method which is overridden is called overridden method.
    3. The Child class method which is overriding is called overriding method.

    In overriding method resolution is always takes care by JVM based on runtime
    object hence overriding is also considered as runtime polymorphism or dynamic
    polymorphism or late binding.

    Note: In overriding runtime object will play the role and reference type is dummy.
        P p1 = new C();
        refernce type :- P p1
        runtime object :- new C()
 */

class P{
    public void property(){
        System.out.println("Cash + Gold + Loan");
    }

    public void marriageSon(){    // overridden method
        System.out.println("Appalamma/Subalaxmi");
    }
}

class C extends P{
    public void marriageSon(){   // overriding method
        System.out.println("Katrinaa");
    }
}

class Test{
    public static void main(String[] args) {
        P p = new P();
        p.marriageSon();  // --> Parent method

        C c = new C();
        c.marriageSon(); // --> Child method

        P p1 = new C();
        p1.marriageSon();  // --> child method
    }
}

/*
    'P p1 = new C();
     p1.marriageSon();'  
     on compiling compiler is always going to check that P class have that marriageSon method or not, if not present it will give compile time error. But, any P class contains method so code gets compiled happily. At runtime JVM is always going to check in child class the method is overridden or not, in the child class if the method is overridden, at runtime based on runtime object child class is always going to get the chance.
     
     Remember, in this case P and C both contain marriageSon, but based on runtime object [new C()], child class method is alway going to get a chance.
    
     P p1 = new C();
     refernce type :- P p1
     runtime object :- new C()
 */