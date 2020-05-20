import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
int id;
String name;
public Student(int id, String name){
this.id=id;
this.name=name;
}
}
class Serialization{
public static void main(String args[])throws Exception{
Student shiva = new Student(2023, "shiva");
FileOutputStream fi= new FileOutputStream("practice.txt");
ObjectOutputStream ob = new ObjectOutputStream(fi);
ob.writeObject(shiva);
ob.close();
}
}