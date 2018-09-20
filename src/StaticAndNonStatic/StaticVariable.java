package StaticAndNonStatic;

public class StaticVariable {
//example on a Student roll number and name
	int rollno; //instance variable
	String name;
	static String univname = "NWMSU"; //static variable
	//constructor
	StaticVariable(int r, String n) {
		rollno = r;
		name = n;
	}
	//method which returns nothing but to display values
	void display(){
		System.out.println(rollno+" "+name+" "+univname);
	}
	//main method to show values of objects and output
		public static void main(String args[]){  
			StaticVariable s1 = new StaticVariable(111,"Karan");  
			StaticVariable s2 = new StaticVariable(222,"Aryan");  
			   
			 //StaticVariable.univname="UCM";  //to change univname for all objects
			 s1.display();  
			 s2.display();  
			 }  
			 
}