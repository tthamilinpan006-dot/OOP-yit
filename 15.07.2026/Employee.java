class Employee{
	int id;
	String name;
	double BasicSalary;
	double Bonus;
	
	void setEmployee(){
		id=1000;
		name="Seelan";
		BasicSalary=150000;
	
	}
	void calcBonus(){
		if(BasicSalary>=100000){
			Bonus=BasicSalary*0.1;
		}else if (BasicSalary<100000){
			Bonus=BasicSalary*0.05;
		}
	
	}
	void getEmployee(){
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("BasicSalary :"+BasicSalary);
		System.out.println("Bonus :"+Bonus);
		System.out.println("NetSalary :"+(BasicSalary+Bonus));
	}
	
}