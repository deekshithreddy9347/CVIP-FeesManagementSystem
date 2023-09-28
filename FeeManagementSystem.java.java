//Fees Management system project using java programming
//this project manages the student fees and other fanancial issues
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

class Student_Management{
   private int student_id;
   private String student_name;
   private int student_fee;
   public int total_paid;
   //entering student details to private by using class constructor
   Student_Management(int student_id,int student_fees,String student_name){
    this.student_id=student_id;
    this.student_fee=student_fees;
    this.student_name=student_name;
   }
   //getting student details by this method
   public void student_details(){
    System.out.println("Student Id is:"+student_id);
    System.out.println("Student name is:"+student_name);
   }
   //getting student fees details
   public void student_fees(){
    System.out.println("Total student fees per every year:"+student_fee);
   }
   //Displaying total fees paid by student
   public void TotalFees_paid(int fees_paid,int month){
    System.out.println("Total fees paid by the student:");
    if(month<=8){
    System.out.println("student will able to pay");
    System.out.println(fees_paid);
    total_paid=fees_paid;
    }else{
        System.out.println("fees paying date completed");
        System.out.println("student doesn't able to pay the fees");
    }
   }
   //Displaying the remaining fees that student should have to pay for fee management 
   public void Remaining_fees(){
    int remaining_fee;
    remaining_fee=student_fee-total_paid;
    System.out.println("Total remaining fee have to be paid by student is:"+remaining_fee);
   }



}
/* creating Student class to get access for private details and methods of first class 
 */


class Student{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    //inputing the details of student
    System.out.println("Enter Student ID:");
    int student_id=sc.nextInt();
    System.out.println("Enter Student fees:");
    int student_fees=sc.nextInt();
    System.out.println("Enter student name:");
    String student_name=sc.next();
    Student_Management d1=new Student_Management(student_id,student_fees,student_name);
    while(true){
   System.out.println("FEE MANAGEMENT SYSTEM:");
   System.out.println("1.Student details:");
   System.out.println("2.Fee structure");
   System.out.println("3.Total fees paid");
   System.out.println("4.Remaining fees");

     int choice=sc.nextInt();
     switch(choice){
     case 1:
          System.out.println("Prining details of student:");
          d1.student_details();
          break;
    case 2:
          System.out.println("Fee structure of student:");
          d1.student_fees();
          break;
    case 3:
         System.out.println("Enter student fees paid:");
          int fees_paid=sc.nextInt();
          System.out.println("enter which month student paid his fee:");
          int month=sc.nextInt();
         d1.TotalFees_paid(fees_paid,month);
         break; 
    case 4:
         System.out.println("Remaining fee have to paid by student:");
         d1.Remaining_fees();
    default:
         System.out.println("INVALID OPTION");
       }
    }   




 }
}













