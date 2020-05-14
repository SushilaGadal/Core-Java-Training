class Amrstrong{
  public static void main(String args[]){
  int n = 153, x = 0 , rem = 0;
   for (x = 0; n > 0;) {
      rem = n % 10;
      x = x + (rem*rem*rem);
      n = n/10;
     }
    System.out.println("sum = " + x);
    
    if ( x == 153 ){
     System.out.println("number 153 " + " is amrstrong ");
      }
     else {
     System.out.println("number 153" + " is not amrstrong ");
     }
  }
}