class Wrapper{
public static void main(String args[]){
int x = 20;
Integer a = new Integer(x); //Integer is a wrapper class
System.out.println(x);
System.out.println(a);
Integer y = 40; // auto-boxing
System.out.println(y);
Integer k = new Integer(200);
int z = k; // auto-unboxing
System.out.println(z);

}
}