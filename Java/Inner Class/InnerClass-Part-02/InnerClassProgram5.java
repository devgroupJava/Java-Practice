class Outer{
	//instance variable
	int x = 10;
	
	//inner class
	class Inner{
		
		void xyz(){
			System.out.println("In iner class of outer class !");
		}

	}
}

class InnerDemo{
	public static void main(String[] args) {
		
		Outer o = new Outer();
		System.out.println(o.x);				//10

		/*Inner i = new Inner();
		i.xyz();*/								//can not find symbol

	/*	Inner i = o.new Inner();				// can not find symbol
		i.xyz();*/

		Outer.Inner i = o.new Inner();
		i.xyz();

	}
}