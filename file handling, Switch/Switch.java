import java.util.Scanner;
class Switch{
public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter choice (1/2/3)");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("1. Chicken Tikka");
break;
case 2:
System.out.println("1. Chicken Bulgogi");
break;
case 3:
System.out.println("1. Chicken curry");
break;
default:
System.out.println("wrong order");


}

}
}