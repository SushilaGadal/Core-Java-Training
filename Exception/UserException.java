import java.util.Scanner;
class Vote extends Exception{
Vote (String msg){
System.out.println(msg);
}
}

class UserException{
public static void main(String args []) throws Exception{
Scanner sc = new Scanner (System.in);
System.out.println("Enter age for the Drinking");
int age= sc.nextInt();
if (age >= 21)
System.out.println("Can drink");
else
throw new Vote("Cannot drink");

}
}