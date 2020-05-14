import java.util.Scanner;
class Mammals{
String m;
 void input(){
 Scanner sc =  new Scanner(System.in);
 System.out.println("Enter name of species");
 m = sc.nextLine();
}
 void mam(){
 System.out.println("Species is " + m);
}
}

class Animal extends Mammals{
String a;
void ani(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter type ");
a = sc.nextLine();
}
void anim(){
 System.out.println("Type is " + a);
 System.out.println(a + " is " + m);
}
}

class Tiger extends Animal{
String t;
	void tig(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter name of animal");
       t= sc.nextLine();
}

void tige(){
 System.out.println("Animal is" + t);
 System.out.println( t + " is " + a + " which is " + m);
}
}

class Answer{
public static void main(String args[]){
Tiger ans = new Tiger();
ans.input();
ans.mam();
ans.ani();
ans.anim();
ans.tig();
ans.tige();

}

}