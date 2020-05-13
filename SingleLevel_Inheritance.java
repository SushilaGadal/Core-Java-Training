import java.util.Scanner;
class Cube{
int x;
  void input(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number");
  x = sc.nextInt();

}
void cubic(){
System.out.println("Cube = " + (x*x*x));
}
}

class Sum extends Cube {
int y;
   void take(){
   Scanner sc = new Scanner(System.in);
   System.out.println("enter y ");
   y = sc.nextInt();
   }
void add(){
 System.out.println("Sum = "  + (x + y));
}
}

class SingleInheritance{
public static void main(String args[]){
Sum ans = new Sum();
ans.input();
ans.cubic();
ans.take();
ans.add();

}
}
   
  