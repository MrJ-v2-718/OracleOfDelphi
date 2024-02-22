import java.time.*;

public class Wedding {
	private LocalDate weddingDate;
	private Couple couple;
	private String location;
	
	public Wedding(LocalDate date, Couple couple1, String location1) {
		weddingDate = date;
		couple = couple1;
		location = location1;
	}
	
	public LocalDate getWeddingDate() {
		return weddingDate;
	}
	
	public Couple getCouple() {
		return couple;
	}
	
	public String getLocation() {
		return location;
	}
}
