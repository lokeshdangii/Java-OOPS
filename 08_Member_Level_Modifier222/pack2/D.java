
package pack2;
import pack1.C;

class D extends C{
    public static void main(String[] args) {
        D d = new D(); // D d --> this part i.e before equal is called reference 
        d.m1();  
   
        D e = new D();
        e.m1();
    }
}