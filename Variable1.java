class Employee{
Double pay;
static String company;
}  

class DemoEmployee{
 public static void main (String args[])
 {
  Employee sushila = new Employee();
  sushila.pay = 10.5;
  Employee.company = "Techno";
  System.out.println(sushila.pay);
  System.out.println(Employee.company);
}
} 
      