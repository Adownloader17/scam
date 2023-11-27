import java.util.Scanner;
public class Gradebook
{
    public static void main(String[] args)
    {
        int i, j;
        int add;
        int[][] arr =new int [5][3];
        System.out.println("**********Grade Book Of Students************");
        Scanner s=new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.println("Enter the Marks for student "+(i+1));
            for(j=0;j<3;j++)
            {
                System.out.print("test "+(j+1)+":");
                arr[i][j]=s.nextInt();
            }//for j close
        }//for i close
//Display the data
        System.out.print("\n Marks \tTest 1\tTest 2\tTest 3\tTotal");
        System.out.print("\n__________________________________________");
        for(i=0;i<5;i++)
        {
            add=0;
            System.out.print("\nStudent "+(i+1)+"\t");
            for(j=0;j<3;j++)
            {
                System.out.print(" "+arr[i][j]+"\t");
                add=add+arr[i][j];
            }
            System.out.print(" "+add+"\t");
        }
    }//main close
}//class close
