class Demo{
public static void main(String args[]){
int x = 11, y= 0;
String name = null;
System.out.println("sum = " + (x + y));
try{
System.out.println("div = "+ (x/y));
System.out.println("length = " + name.length());
}
catch(ArithmeticException a) // a = new ArithmeticEXception()
{
a.printStackTrace();
}
catch (Exception np){
np.printStackTrace();
	}
System.out.println("mul = " + (x*y));
System.out.println("diff = " + (x-y));
}
}