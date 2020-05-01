class Actor{
int age;
static String country;
} 
class InfoActor{
public static void main (String args[]){
Actor john = new Actor();
john.age = 35;
Actor.country = "USA";
System.out.println("John age is" + john.age);
System.out.println("He is from" + Actor.country);
}
}