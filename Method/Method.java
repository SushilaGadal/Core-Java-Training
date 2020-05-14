class Hotel{
void room(){ // without return type and without parameters
System.out.println("1.SingleRoom 2.DoubleRoom 2.Triple");
}
void booking(String roomType){ // without return type and with parameters
System.out.println("Room booked is " + roomType);
}
String bookedRoom(){ //with return type and without parameters
return "SingleRoom";
}
String pay(double amount){ // with return type and with parameters
System.out.println("Customer Total bill is " + amount);
return "deposit paid"; 
}
}
class Customer{
public static void main(String args[]){
Hotel hyatt = new Hotel();
hyatt.room();
hyatt.booking("SingleRoom");
System.out.println("Checked room is " + hyatt.bookedRoom());
System.out.println("Checked in and " + hyatt.pay(250.26));
} 
}