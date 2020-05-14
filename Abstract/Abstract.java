abstract class Hotel{
abstract void cost();
abstract void room();
void stay(){
System.out.println("Holiday Destination"); 
}

}

class Hyatt extends Hotel{
void cost(){
System.out.println("Cost of the Hyatt is $2000");
}
void room(){
System.out.println("Single and Deluxe are available");
}
}

class Solti extends Hotel {
void cost(){
System.out.println("Cost of the Hyatt is $1900");
}
void room(){
System.out.println("Triple and Deluxe are available");
}
}

class Overriding{
public static void main(String args[]){
Hotel x ;
x = new Hyatt();
x.cost();
x.room();
x.stay();
x = new Solti();
x.cost();
x.room();
x.stay();
}
}