import java.util.Scanner;
class MainStudent{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		Student s= new Student();
		
		System.out.print("Enter Your ID :");	
		int id=scan.nextInt();
		System.out.print("Enter Your Name :");	
		String name=scan.nextLine();
		
		s.setStudent(id,name);
		s.getStudent();
		
		
	}
}