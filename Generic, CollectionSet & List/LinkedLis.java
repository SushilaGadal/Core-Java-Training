import java.util.LinkedList;
class LinkedLis{
public static void main(String args[]){

LinkedList<Integer> l = new LinkedList<Integer>();
l.add(25);
l.add(20);
l.add(10);
l.add(50);
l.add(15);
l.add(30);
l.add(16);
l.add(51);

System.out.println(l);

System.out.println("poll: " + l.poll());

System.out.println("element: " + l.element());

System.out.println("pollLast: " + l.pollLast());

System.out.println("pollFirst: " + l.pollFirst());

System.out.println("OfferFirst: " + l.offerFirst(30));


}

}