class MainComputer{
	public static void main(String args[]){
		Computer c;
		c=new Computer();
		
		c.color="Red";
		c.ram=16;
		c.madeIn="Srilanka";
		c.price=100;
		c.storage=512;
		
		System.out.println("Color :"+c.color);
		System.out.println("Ram :"+c.ram);
		System.out.println("Madein :"+c.madeIn);
		System.out.println("Price :"+c.price);
		System.out.println("Storage : :"+c.storage);
		c.coding();
		c.play();
		c.edit();

	}	
}