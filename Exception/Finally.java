class Finally{
public static void main(String args[]){
int x = 11, y= 0;
String name = "hello";
System.out.println("sum = " + (x + y));
try{
System.out.println("div = "+ (x/y));


	try{
	    System.out.println("length = " + name.length());
	}
	catch (NullPointerException np){
	np.printStackTrace();
	}
}
catch(ArithmeticException a) // a = new ArithmeticEXception()
{
a.printStackTrace();
}
finally{
System.out.println("deallocate memory or close the connection");
}

System.out.println("mul = " + (x*y));
System.out.println("diff = " + (x-y));
}
}