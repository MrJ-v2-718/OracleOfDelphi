public class SpaService {
	private String serviceDescription;
	private double price;
	
	public SpaService() {
		this("XXX", 0);
	}
	
	public SpaService(String desc, double pr) {
		serviceDescription = desc;
		price = pr;
	}
	
	public void setServiceDescription(String service) {
		serviceDescription = service;
	}
	
	public String getServiceDescription() {
		return serviceDescription;
	}
	
	public void setPrice(double servicePrice) {
		price = servicePrice;
	}
	
	public double getPrice() {
		return price;
	}
}
