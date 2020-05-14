import java.util.*;
class Tree_Set{
public static void main(String args[]){
TreeSet<String> tree = new TreeSet<String>();
tree.add("s");
tree.add("T");
tree.add("R");
tree.add("A");
tree.add("J");
tree.add("K");
tree.add("M");
tree.add("");
tree.add("G");
tree.add("E");
tree.add("R");
tree.add("S");
tree.add("V");

TreeSet<Double> ree = new TreeSet<Double>();
ree.add(10.5);
ree.add(20.5);
ree.add(30.5);
ree.add(40.5);

System.out.println(tree);
System.out.println(tree.headSet("A", true));
System.out.println(tree.tailSet("E", false));
System.out.println(tree.subSet("A",false,"E",true)); //sfalse to notinclude
						   // true to include

System.out.println(tree.first());
System.out.println(tree.last());

System.out.println(ree);
System.out.println(ree.floor(10.5));
System.out.println(ree.ceiling(10.5));



	
}

}