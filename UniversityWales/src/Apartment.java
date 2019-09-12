public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }
        return false;
    }
    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.price() - otherApartment.price());
    }
     public boolean moreExpensiveThan(Apartment otherApartment){
         if (this.price() > otherApartment.price()){
             return true;
         }
         return false;
      
     }
     
     public int price() {
    	 return this.squareMeters*this.pricePerSquareMeter;
     }
   //price in my salary
 	public Boolean priceInSalary(double min, double max) {
 		return this.price() > min && this.price() < max;
 	}
 	
 	//price for a year
 		public Double priceYear(int students) {
 			return (double)this.price()*14/students;
 		}
		
 		//GETTERS AND SETTERS
 		public int getRooms() {
			return rooms;
		}
		public void setRooms(int rooms) {
			this.rooms = rooms;
		}
		public int getSquareMeters() {
			return squareMeters;
		}
		public void setSquareMeters(int squareMeters) {
			this.squareMeters = squareMeters;
		}
		public int getPricePerSquareMeter() {
			return pricePerSquareMeter;
		}
		public void setPricePerSquareMeter(int pricePerSquareMeter) {
			this.pricePerSquareMeter = pricePerSquareMeter;
		}
		
		//TOSTRING
		@Override
		public String toString() {
			return "Apartment [rooms=" + rooms + ", squareMeters=" + squareMeters + ", pricePerSquareMeter="
					+ pricePerSquareMeter + "]";
		}		
}
