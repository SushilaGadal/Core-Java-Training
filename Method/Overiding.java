class Hotel{
void cost(){
System.out.println("Feel free to stay"); 
}
void room(){
System.out.println("Different types of Room available");
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
Hotel x = new Hotel();
x.cost();
x.room();
x = new Hyatt();
x.cost();
x.room();
x = new Solti();
x.cost();
x.room();
}
}