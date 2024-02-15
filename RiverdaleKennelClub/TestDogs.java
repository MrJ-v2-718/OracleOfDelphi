public class TestDogs {
	public static void main(String[] args) {
		DogTriathlonParticipant dog1 = 
			new DogTriathlonParticipant("Chewbacca", 2, 85, 89, 0);
		dog1.display();
		
		DogTriathlonParticipant dog2 = 
			new DogTriathlonParticipant("Lord Vader", 1, 95, 78, 70);
		dog2.display();
		
		DogTriathlonParticipant dog3 = 
			new DogTriathlonParticipant("Yoda", 3, 97, 77, 60);
		dog3.display();
	}
}
