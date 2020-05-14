import java.util.Stack;
class PracStack{
public static void main(String args[]){

Stack<String> s = new Stack<String>();
s.push("P");
s.push("U");
s.push("S");
s.push("H");
s.push("S");

System.out.println(s);

s.pop();
System.out.println(s);

System.out.println(s.peek()); // printed H



}

}