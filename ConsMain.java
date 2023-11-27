public class ConsMain {
    private int x;
    private ConsMain(){
        System.out.println("Constructor is called!");
        x = 139;
    }
    public static void main(String[] args){
        ConsMain obj = new ConsMain();
        System.out.println("Value of x = " + obj.x);
    }
}
