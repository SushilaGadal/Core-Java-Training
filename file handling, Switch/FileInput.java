import java.io.*;
class FileInput{
public static void main (String args[]) throws IOException,FileNotFoundException{
FileInputStream file = new FileInputStream("example.txt");
BufferedInputStream bi = new BufferedInputStream(file);
int x = bi.read();
while(x!=-1){
System.out.print((char)x);
x=bi.read();
}
}
}