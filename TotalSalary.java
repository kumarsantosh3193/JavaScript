
import java.util.*;
class TotalSalary{

public static void main(String args[]){

Scanner sc= new Scanner(System.in);


System.out.println("Enter the basic salary");

int sal;
 sal=sc.nextInt();

if(sal>=10000){
 
  int b=(sal*10)/100;

  sal=sal+b;

System.out.println("Total salary is " +sal);
}
 
 else

System.out.println("The sal is " +sal);
}
}