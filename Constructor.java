class Student{
Student(int id, String a){
System.out.println("Id = " + id);
System.out.println("name = " +  a);
}
Student(String add){
this(1023,"Sushila");
System.out.println("address = " + add);
}
}
class Constructor{
public static void main(String args[]){
Student info = new Student("kathmandu");
}
}