package mainpackage;

	public class Cinemas {
	    private int cinemasId;
	    private boolean cinemaIs3D;
	    private int cinemaNumberOfSeats;

	    public Cinemas(int cinemaId, boolean cinemaIs3D, int cinemaNumberOfSeats) {
	        this.cinemasId = cinemaId;
	        this.cinemaIs3D = cinemaIs3D;
	        this.cinemaNumberOfSeats = cinemaNumberOfSeats;
	    }

	    public int getCinemaId() {
	        return cinemasId;
	    }

	    public void setCinemaId(int cinemaId) {
	        this.cinemasId = cinemaId;
	    }

	    public boolean isCinemaIs3D() {
	        return cinemaIs3D;
	    }

	    public void setCinemaIs3D(boolean cinemaIs3D) {
	        this.cinemaIs3D = cinemaIs3D;
	    }

	    public int getCinemaNumberOfSeats() {
	        return cinemaNumberOfSeats;
	    }

	    public void setCinemaNumberOfSeats(int cinemaNumberOfSeats) {
	        this.cinemaNumberOfSeats = cinemaNumberOfSeats;
	    }
	    
	}
