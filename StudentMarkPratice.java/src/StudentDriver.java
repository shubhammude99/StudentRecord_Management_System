import java.util.Scanner;

public class StudentDriver
{
    Student s1 []=new Student [2];
    Student s;
    Scanner sc=new Scanner(System.in);
    public void addStudent()
    {
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]==null)
            {
                System.out.println("Enter the id");
                int id= sc.nextInt();
                System.out.println(" Enter the Name");
                String name=sc.next();
                System.out.println(" Enter the contact number");
                long contactNo=sc.nextLong();
               s=new Student(id,name,contactNo);
               s=s1[i];
                System.out.println(" student is added");
                return;

            }
        }
        System.out.println("Database is full");

    }
    public void removeStudent()
    {
        System.out.println(" ENter the id");
        int id= sc.nextInt();
       for(int i=0;i< s1.length;i++)
       {
           Student s= s1[i];
           if(s.id==id)
           {
               s1[i]=null;
               System.out.println(" Student is removed");
               return;

           }


       }
        System.out.println(" STudent is not found");


    }
    public void DisplayStudent()
    {
        for(int i=0;i<s1.length;i++)
        {
         if(s1[i]!=null)
         {
             System.out.println(s1[i]);
         }
        }

    }
    public void searchStudent()
    {
        System.out.println("enter id");
        int id = sc.nextInt();
        for (int i = 0; i < s1.length; i++)
        {
            if (s1[i] != null)
            {
                Student s = s1[i];
                if (s.id == id)
                {
                    System.out.println(s.name);
                    int[] mark = s.mark;
                    for (int j = 0; j < mark.length; j++)
                    {
                        System.out.println(mark[j]);
                    }
                    return;
                }
            }

        }
        System.out.println("id is not found");

    }
    public void dynamic()
    {
        System.out.println("1.pass 2.fail");
        switch (sc.nextInt())
        {
            case 1:
            {

                for (int i = 0; i < s1.length; i++)
                {
                    int c = 0;
                    if (s1[i] != null)
                    {
                        Student s = s1[i];
                        int[] marks = s.mark;
                        for (int j = 0; j < marks.length; j++)
                        {
                            if (marks[j] >= 35)
                                c++;
                        }
                        if (c == 5) {
                            System.out.println(s);
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("1. 1 sub 2. 2sub 3. sub 4.4sub 5.sub");
                //int c=0;
                switch (sc.nextInt()) {

                    case 1:
                    {
                        for (int i = 0; i < s1.length; i++)
                        {
                            int c = 0;
                            if (s1[i] != null)
                            {
                                Student s = s1[i];
                                int[] marks = s.mark;
                                for (int j = 0; j < marks.length; j++)
                                {
                                    if (marks[j] < 35)
                                        c++;
                                }
                                if (c == 1) {
                                    System.out.println(" fail in one sub");
                                    return;
                                }

                            }
                        }
                        break;
                    }
                    case 2 :
                    { for (int i = 0; i < s1.length; i++)
                    {
                        int c = 0;
                        if (s1[i] != null)
                        {
                            Student s = s1[i];
                            int[] marks = s.mark;
                            for (int j = 0; j < marks.length; j++)
                            {
                                if (marks[j] < 35)
                                    c++;
                            }
                            if (c == 2) {
                                System.out.println(" fail in 2 sub");
                                return;
                            }

                        }
                    }
                        break;

                    }
                    case 3:
                    {
                        for (int i = 0; i < s1.length; i++)
                        {
                            int c = 0;
                            if (s1[i] != null)
                            {
                                Student s = s1[i];
                                int[] marks = s.mark;
                                for (int j = 0; j < marks.length; j++)
                                {
                                    if (marks[j] < 35)
                                        c++;
                                }
                                if (c == 3)
                                {
                                    System.out.println(" fail in 3 sub");
                                    return;
                                }

                            }
                        }
                        break;
                    }
                    case 4:
                    {
                        for (int i = 0; i < s1.length; i++)
                        {
                            int c = 0;
                            if (s1[i] != null)
                            {
                                Student s = s1[i];
                                int[] marks = s.mark;
                                for (int j = 0; j < marks.length; j++) {
                                    if (marks[j] < 35)
                                        c++;
                                }
                                if (c == 4) {
                                    System.out.println(" fail in 4 sub");
                                    return;
                                }

                            }
                        }
                        break;
                    }
                    case 5:
                    {
                        for (int i = 0; i < s1.length; i++)
                        {
                            int c = 0;
                            if (s1[i] != null)
                            {
                                Student s = s1[i];
                                int[] marks = s.mark;
                                for (int j = 0; j < marks.length; j++) {
                                    if (marks[j] < 35)
                                        c++;
                                }
                                if (c == 5) {
                                    System.out.println(" fail in 5 sub");
                                    return;
                                }

                            }
                        }
                        break;
                    }
                }
            }
        }
    }

}



