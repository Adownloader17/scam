public class Vehicles {
    int wheels;
    private Vehicles(int wheel)
    {
        wheels = wheel;
        System.out.println(wheels + " wheeler vehicle created.");
    } //Parameterized constructor
    public static void main(String[] args)
    {
        Vehicles v1 = new Vehicles(2);
        Vehicles v2 = new Vehicles(3);
        Vehicles v3 = new Vehicles(4);
    }
}
