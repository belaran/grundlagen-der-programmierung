
public class Consultant {

	long id;
	char countryLetterCodeFirst = 'D';
	char countryLetterCodeSecond = 'E';
	float costByDay;
	long phoneNumber; //this will fails
	int experienceYears = 1;

	public static float costOfConsultantForDays(
			Consultant consultant, int nbDays){
		return consultant.costByDay * nbDays *
			consultant.experienceYears;
	}
	
	public static float costOfConsultantForDays(
			float costByDay, int nbDays){
		return costByDay * nbDays;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consultant consultant = new Consultant();
		consultant.id = 1;
		consultant.countryLetterCodeFirst = 'F';
		consultant.countryLetterCodeSecond = 'R';
		// careful, this guy might go on strike...
		consultant.experienceYears = 4;
		consultant.costByDay = 
			1000 * consultant.experienceYears;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
