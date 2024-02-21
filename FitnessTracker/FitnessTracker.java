import java.time.*;

public class FitnessTracker {
	String activity;
	int minutes;
	LocalDate date;
	
	public FitnessTracker() {
		activity = "running";
		minutes = 0;
		date = LocalDate.of(2024, 1, 1);
	}
	
	public FitnessTracker(String name, int minutesInput, LocalDate datePassed) {
		activity = name;
		minutes = minutesInput;
		date = datePassed;
	}
	
	public String getActivity() {
		return activity;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public LocalDate getDate() {
		return date;
	}	
	
}
