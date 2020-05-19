import java.io.*;
class Reader{
public static void main (String args[]) throws IOException,FileNotFoundException{
FileReader fi = new FileReader("example1.txt");
BufferedReader bi = new BufferedReader(fi);
int x=bi.read();
while(x!=-1){
System.out.print((char)x);
x=bi.read();
}
bi.close();
fi.close();
}
}