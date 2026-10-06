import java.util.Scanner;
class Student
{
   String USN;
   String Name;
   void accept()
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter USN: ");
      USN = sc.nextLine();
      System.out.print("Enter Name: ");
      Name = sc.nextLine();
   }
   void display()
   {
      System.out.println("USN: "+USN);
      System.out.println("Name: "+Name);
   }
}
class StudentDemo
{
   public static void main(String[] args)
   {
      Student s1 = new Student();
      Student s2 = new Student();
      Student s3 = new Student();
      System.out.println("Enter Details of Student 1: ");
      s1.accept();
      System.out.println("Enter Details of Student 2: ");
      s2.accept();
      System.out.println("Enter Details of Student 3: ");
      s3.accept();
      
      System.out.println("\n--Student Details--");
      System.out.println("\nStudent 1: ");
      s1.display();
      System.out.println("\nStudent 2: ");
      s2.display();
      System.out.println("\nStudent 3: ");
      s3.display();
   }
}