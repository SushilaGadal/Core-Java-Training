import java.util.Scanner;
class Product extends Thread{
int x;
int y;
public void run(){
System.out.println("Enter the value of x");
Scanner sc = new Scanner(System.in);
x=sc.nextInt();
System.out.println("Enter the value of y");
y=sc.nextInt();
}
public static void main(String args[])throws Exception{
Product p = new Product();
p.start();
p.join();
int c;
c=p.x*p.y;
System.out.println("The product of x and y is " + c); 
}



} 