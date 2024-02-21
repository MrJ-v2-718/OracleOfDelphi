public class BloodData {
	String bloodType;
	String rhFactor;
	
	public BloodData() {
		this("O", "+");
	}
	
	public BloodData(String bldType, String rh) {
		bloodType = bldType;
		rhFactor = rh;
	}
	
	public void setBloodType(String bldType) {
		bloodType = bldType;
	}
	
	public String getBloodType() {
		return bloodType;
	}
	
	public void setRhFactor(String rh) {
		rhFactor = rh;
	}
	
	public String getRhFactor() {
		return rhFactor;
	}
	
}
