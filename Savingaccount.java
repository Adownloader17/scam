public class Savingaccount  {
    static double annualinterestrate;
    private double savingbalance;
    double monthlyinterest;
    Savingaccount(double balance) {
        savingbalance=balance;
    } 
    void interest() {
        System.out.println("Saving Balance ="+savingbalance);
        monthlyinterest=((savingbalance*annualinterestrate)/12);
        System.out.println("Monthly Interest ="+monthlyinterest);
        savingbalance=savingbalance+monthlyinterest;
        System.out.println("Saving Balance ="+savingbalance);
    } 
    void interest(double newannualinterestrate){
        annualinterestrate=newannualinterestrate;
        System.out.println("Annual interest rate ="
                +annualinterestrate);
    } 


        public static void main(String[] args){
            Savingaccount s=new Savingaccount(2000.0);
            s.interest(0.05);
            s.interest();
            Savingaccount s1=new Savingaccount(3000.0);
            s1.interest(0.05);
            s1.interest();
        }
    } 
