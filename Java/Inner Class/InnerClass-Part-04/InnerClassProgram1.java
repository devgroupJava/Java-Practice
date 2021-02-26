class Zomato{
	//instance method
	void order(){
		System.out.println("In Order Method !");
		//method local inner class
		class Hotel{
			String hotelName = null;


			Hotel(String hotelName){
			
				this.hotelName = hotelName;
		
			}
		
			void orderPlaced(){
		
				System.out.println("order placed at, "+hotelName);
		
			}	

		}
		Hotel h1 = new Hotel("Green Park");
		h1.orderPlaced();

	}	

	//Entry point method
	public static void main(String[] args) {
	
		Zomato z = new Zomato();
		z.order();	

	}	 
}