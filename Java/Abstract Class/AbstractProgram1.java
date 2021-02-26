abstract class Biryani{
	Biryani(){
		System.out.println("Biryani Constructor");
	}
	abstract void quantity();
	abstract void price();
	void test(){
		System.out.println("Bestttt Testtt !");
	}

}
class PKBiryani extends Biryani{
	PKBiryani(){
		System.out.println("PK Biryani Constructor");
	}
	void quantity(){
		System.out.println("Jasttt !");
	}	

	void price(){
		System.out.println("AVG !");
	}	

}
class MainDemo{
	public static void main(String[] args) {
		PKBiryani pk = new PKBiryani();
		pk.quantity();
		pk.price();
		pk.test();
	}
}