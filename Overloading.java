import java.util.Scanner;
class Multiply{
void  product(int x, int y){
System.out.println("Product of integer is " + (x * y));
}
void  product(float x, float y){
System.out.println("Product of decimal is " + ( x * y));
}
}
class MethodOverloading{
public static void main (String args[]) {
Multiply mil = new Multiply();
Scanner sc = new Scanner(System.in);
System.out.println("Enter decimal number");
float a = sc.nextFloat();
float b = sc.nextFloat();
mil.product(a, b);

}
}