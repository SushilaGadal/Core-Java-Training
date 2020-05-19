import java.io.*;
class Writer{
public static void main (String args[]) throws IOException,FileNotFoundException{
FileWriter fi = new FileWriter("example1.txt");
BufferedWriter bi = new BufferedWriter(fi);
String s = "welcome to java world";
bi.write(s);
bi.close();

}
}