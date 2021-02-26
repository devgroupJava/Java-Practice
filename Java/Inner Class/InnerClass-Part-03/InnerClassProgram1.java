class Outer{

	int a = 10;

	class Inner{
		int a = 20;
		void xyz(){
			int a = 30;	
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Outer.this.a);
		}

	}

	public static void main(String[] args) {

		Outer o = new Outer();
		Inner in1 = o.new Inner();
		in1.xyz();

	}
}