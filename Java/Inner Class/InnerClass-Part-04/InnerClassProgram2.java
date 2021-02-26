class Admission{

	Admission(String field){

		if(field.equals("Medical")){
			NEET();
		}else if (field.equals("Engg")) {
			JEE();
		}
	}	
	void NEET(){
			class GovCollege{
				void college(){
					System.out.println("AIIMS");
				}

			}
			class PrivateCollege{
				void college(){
					System.out.println("Bharti Vidyapeeth");
				}
					
			}
			GovCollege gov = new GovCollege();
			gov.college();


	
		}

		void JEE(){

			class GovCollege{	

				void college(){
					System.out.println("COEP");
				}
				
			}
			class PrivateCollege{
				void college(){
					System.out.println("Zeal");
				}
				
			}

			PrivateCollege pvt = new PrivateCollege();
			pvt.college();

		}

}
class Decision{

	public static void main(String[] args) {
		Admission adm = new Admission("Medical");
			Admission adms = new Admission("Engg");
	}

}