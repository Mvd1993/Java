import java.time.LocalDate;

public class Date {
LocalDate date;
	
	
	public Date() {
		this.date=LocalDate.now();
	}
	public Date(LocalDate date) {
		this.date = date;
	}
	

	public void addYears(long years){
		this.date = this.date.plusYears(years);
		
		
	}
	
	public LocalDate dateNow() {
		return LocalDate.now();
	}
	
	//----------------------------------------------------
	

	public LocalDate getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
