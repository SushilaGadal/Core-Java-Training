class Practice<S>{
void show (S a){
System.out.println(a);
}
}
class Generic{
public static void main(String args[]){
Practice<Integer> i= new Practice<Integer>();
i.show(10);
Practice<Double> j= new Practice<Double>();
j.show(10.5);
Practice<String> k= new Practice<String>();
k.show("Rahul");

// Practice x = new Practice(); // unsafe to do it like this 
// x.show(20);
// x.show(20.5);

}
}