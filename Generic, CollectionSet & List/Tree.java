import java.util.*;
class Tree{
public static void main(String args[]){
TreeSet<String> hs = new TreeSet<String>();
System.out.println(hs.isEmpty()); // give false
hs.add("s");
hs.add("T");
hs.add("R");
hs.add("A");
hs.add("");
hs.add("G");
hs.add("E");
hs.add("R");
hs.add("S");
hs.add("V");
System.out.println(hs);
System.out.println(hs.isEmpty()); // give true
System.out.println(hs.size());
System.out.println(hs.contains("S"));
System.out.println(hs.remove("R"));
System.out.println(hs);

Object o = hs.clone();
System.out.println(o);

}
}