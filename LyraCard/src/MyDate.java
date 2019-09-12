import java.sql.Date;
import java.time.LocalDate;

public class MyDate {
	LocalDate date;
	
	
	public MyDate() {
		this.date=LocalDate.now();
	}
	public MyDate(LocalDate date) {
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
