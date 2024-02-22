import java.time.*;

public class Couple {
	private Person groom;
	private Person bride;
	
	public Couple(Person groom1, Person bride1) {
		groom = groom1;
		bride = bride1;
	}
	
	public Person getGroom() {
		return groom;
	}
	
	public Person getBride() {
		return bride;
	}
}
