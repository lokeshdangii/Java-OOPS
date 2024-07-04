/*
    By declaring data member private we can make outside person unable to access.
    To access and update private member we use public getter and setters.

    The main advantage of data hiding is Security. 
 */

class O10_DataHiding {
    
    private double balance;

    public double getBalance(){
        // validations
        boolean valid = true; // or false
        if(valid){
            return balance;
        }

        return -1.0;
    }
}
