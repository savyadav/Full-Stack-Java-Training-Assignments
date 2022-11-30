package question3;

public class BookMyMovie {
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	BookMyMovie(int movieId, int noOfTickets)
	{
		this.movieId=movieId;
		this.noOfTickets=noOfTickets;
	}
	public void calculateDiscount()
	{
		if ((movieId==101 ||movieId==102||movieId==103)&& noOfTickets<5)
		{
			
			this.setDiscount(0);
	    }
		else if((movieId==101 ||movieId==103)&& noOfTickets>=5&&noOfTickets<10)
		{
			
			this.setDiscount(15);
		}
		else if((movieId==101 ||movieId==103)&& noOfTickets>=10&&noOfTickets<=15)
		{
			
			this.setDiscount(20);
		}
		else if((movieId==102)&& noOfTickets>=5&&noOfTickets<10)
		{
			
			this.setDiscount(10);
		}
		else if((movieId==102)&& noOfTickets>=10&&noOfTickets<=15)
		{
			
			this.setDiscount(15);
		}
		
	}
	public double calculateTicketAmount()
	{
		double baseFare=0;
	     if(movieId ==101)
	     {
	    	 baseFare=120;
	     }
	     if(movieId ==102)
	     {
	    	 movieId=170;
	     }
	     if(movieId ==103)
	     {
	    	 baseFare=150;
	     }
	     calculateDiscount();    
		
totalAmount=baseFare*noOfTickets-(baseFare*noOfTickets*(this.getDiscount()/100));
return totalAmount;
	}
	

}
