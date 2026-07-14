class MainPen{
	public static void main(String args[]){
		Pen p;
		p=new Pen();
		
		p.color="Red";
		p.brand="Yamaha";
		p.hight=5.3;
		p.madeIn="Srilanka";
		p.price=100;
		
		System.out.println("Color :"+p.color);
		System.out.println("Hight :"+p.hight);
		System.out.println("Madein :"+p.madeIn);
		System.out.println("Price :"+p.price);
		System.out.println("Brand :"+p.brand);
		p.write();
	}
}