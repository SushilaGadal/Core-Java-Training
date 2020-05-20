import java.io.*;
class Deserialization{
public static void main(String args[])throws Exception{
FileInputStream fi= new FileInputStream("practice.txt");
ObjectInputStream in=new ObjectInputStream(fi);
Object o=in.readObject();
Student shiva=(Student)o;
System.out.println(shiva.id);
System.out.println(shiva .name);
}
}