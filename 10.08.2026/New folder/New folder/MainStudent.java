class MainStudent{
	public static void main(String args[]){
		Student Stu1=new Student();
		Stu1.setStudent();
		Stu1.getStudent();
		
		Student Stu2=new Student();
		Stu2.setStudent(5000);
		Stu2.getStudent();
		
		
		Student Stu3=new Student();
		Stu3.setStudent("Tamil");
		Stu3.getStudent();
		
		Student Stu4=new Student();
		Stu4.setStudent(5000,"Tamil");
		Stu4.getStudent();
		
		Student Stu5=new Student();
		Stu5.setStudent("Tamil",5000);
		Stu5.getStudent();
	}
}