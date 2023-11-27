public class Company  {
    String domainName;
    public Company(){
        this.domainName = "DefaultConstuctor.com";
    } //Default constructor close
    public Company(String dName){
        this.domainName = dName;
    } //parameterized constructor close
    public void getName(){
        System.out.println(this.domainName);
    }
    public static void main(String[] args) {
        Company defaultObj = new Company();
        Company programizObj = new Company("ByateWorld.com");
        defaultObj.getName();
        programizObj.getName();
    } //main close
} //class close
