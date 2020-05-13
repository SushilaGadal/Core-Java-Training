class Hotel{
void welcome(){
System.out.println("Place to stay in holiday"); 
}
}
class Hyatt extends Hotel{
void hyattInfo(){
System.out.println("Information about the Hyatt");
}
}
class Solti extends Hotel {
void soltiInfo(){
System.out.println("Information about the Solti");
}
}

class Hierarchical{
public static void main(String args[]){
Hyatt info = new Hyatt();
info.welcome();
info.hyattInfo();
Solti  a = new Solti();
a.welcome();
a.soltiInfo();
}
}