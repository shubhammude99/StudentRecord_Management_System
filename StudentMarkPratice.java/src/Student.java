import java.util.Scanner;

public class Student
{
    int id;
    String name;
    long contactNo;
    int mark[]=new int[4];
    Scanner sc= new Scanner(System.in);
   public Student (int id, String name, long contactNo)
    {
        this.id=id;
        this.name=name;
        this.contactNo= this.contactNo;
        isStored();
    }
    public void isStored()
    {
        System.out.println("Enter the mark");
        for(int i=0;i<mark.length;i++)
        {
         mark[i]= sc.nextInt();
        }

    }
    public String toString()
    {
        return (id +"  "+name + "  " +contactNo);
    }



}
