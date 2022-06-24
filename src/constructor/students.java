package constructor;

public class students {
	String name;
	int english;
	int maths;
	int science;
	students(String name, int english, int maths, int science) 
	{
		this.name= name;
		this.english= english;
		this.maths= maths;
		this.science= science;
System.out.println("name of student:" +name
		+"/n english marks=" +english
		+"/n math marks=" +maths
		+"/n science marks=" +science);
System.out.println(); 

	}
	
		
	

	public static void main(String[] args) {
		students s=new students("swati",85,80,76);
		students s1=new students("apurva",89,98,55);
		students s2=new students("amol",99,80,67);
		students s3= new students("harshal",88,77,45);
		students s4=new students("lakshit",98,87,66);
		students s5=new students("nilima",77,39,78);
		students s6=new students("varun",66,57,87);
		students s7=new students("tanvi",89,75,47); 
		students s8=new students("damini",87,76,90);
		students s9=new students("raj",86,83,78);
		
		

	}

}
