import java.io.*;
class BufferOut{
public static void main (String args[]) throws IOException,FileNotFoundException{
FileOutputStream file = new FileOutputStream("example.txt");
BufferedOutputStream bi = new BufferedOutputStream(file);
String s = "welcome to java world";
byte b[]=s.getBytes();
bi.write(b);
bi.flush();

}
}