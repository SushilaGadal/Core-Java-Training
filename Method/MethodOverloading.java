class Hotel{
void room(){ 
System.out.println("1.SingleRoom 2.DoubleRoom 2.Triple");
}
void booking(String roomType, String roomType1){ 
System.out.println("Room booked is " + roomType + roomType1);
}

void price(int x, int y, int z){
System.out.println("Room price is " + x +" "  + y+" "  + z);
}
void price(float x, int y){
System.out.println("Room price is " + x+" " + y);
} 

void  booking(String roomType, String roomType1, String roomType2){ 
System.out.println("Room booked is " + roomType + roomType1 + roomType2);
}

String pay(double amount){ 
System.out.println("Customer Total bill is " + amount);
return "deposit paid"; 
}

}
class Customer{
public static void main(String args[]){

Hotel hyatt = new Hotel();
System.out.println("hyatt");
hyatt.room();
hyatt.booking("SingleRoom ", "DoubleRoom ",  " TripleRoom");
hyatt.price(134, 234, 345);
System.out.println("Checked in Hyatt and " + hyatt.pay(2250.26));


Hotel solti = new Hotel();
System.out.println("Solti");
solti.room();
solti.booking("SingleRoom ", "DoubleRoom ");
solti.price(134.2f, 234);
System.out.println("Checked in and  Solti and " + solti.pay(1550.26));


} 
}