import java.util.Scanner;

public class StudentApplication
{
    public static void main(String[] args)
    {
        StudentDriver sd=new StudentDriver();
        Scanner sc=new Scanner(System.in);
        for(;;)
        {
            System.out.println(" 1.Add 2.Remove 3.Display 4.Sreach 5.Dynamic 6.Exit");
            switch(sc.nextInt())
            {
                case 1:
                    sd.addStudent();
                    break;
                case 2:
                    sd.removeStudent();
                    break;
                case 3:
                    sd.DisplayStudent();
                    break;
                case 4:
                    sd.searchStudent();
                    break;
                case 5:
                    sd.dynamic();
                    break;
                case 6:
                    System.out.println("Application is closed");
                    return;


            }
        }


    }


}
