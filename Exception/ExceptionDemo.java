class ExceptionDemo{
public static void main(String args[]){
int x = 11, y= 0;
System.out.println("sum = " + (x + y));
try{
System.out.println("div = "+ (x/y));
}
catch(ArithmeticException a) // a = new ArithmeticEXception()
{
System.out.println(a.toString());
	}
System.out.println("mul = " + (x*y));
System.out.println("diff = " + (x-y));
}
}