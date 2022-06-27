class Nestedif {
public static void main(String[] args) {
String address = "Kolkata, India";//declare string
if(address.endswith("India")) {  //if statement
if(address.contains("Dunlop")) {
System.out.println("Your city is Dunlop");//to print a statement
}
else if(address.contains("Newtown")) { // else if statement

System.out.println("Your city is Newtown");//to print a statement
}
else {

System.out.printl(address.split(",")[0]);//to print a statement
}
}
else {
System.out.println("You are not living in India"); //to print a statement
}
}
}
