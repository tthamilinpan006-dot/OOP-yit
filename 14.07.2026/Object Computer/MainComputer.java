class MainComputer{
	public static void main(String args[]){
		Computer c;
		c=new Computer();
		
		c.color="Red";
		c.wight=1;
		c.madeIn="Srilanka";
		c.price=100;
		
		System.out.println("Color"+c.color);
		System.out.println("Hight"+c.wight);
		System.out.println("Madein"+c.madeIn);
		System.out.println("Price"+c.price);
		c.write();
	}	
}