interface Business{
 void networth();
 void profit();
}



abstract class Hotel implements Business{
void scope(){
System.out.println("Hotel has good scope of business");
 }
}

abstract class AutoShop implements Business{
void available(){
System.out.println("All kind of vehicle are available");
 }
}


class Hyatt extends Hotel{
public void networth(){
System.out.println("Net worth of the Hyatt is 2 billion");
}
public void profit(){
System.out.println("Profit of the Hyatt is 1 million per year");
}
}

class MCB extends AutoShop{
public void networth(){
System.out.println("Net worth of the MCB is 3.5 billion");
}
public void profit(){
System.out.println("Profit of the MCB is 2 million per year");
}
}


class Interface{
public static void main(String args[]){
Hotel x ;
x = new Hyatt();
x.scope();
x.networth();
x.profit();
AutoShop y = new MCB();
y.available();
y.networth();
y.profit();
}
}