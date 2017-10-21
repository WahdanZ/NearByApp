package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("venue")
	private Venue venue;

	public void setVenue(Venue venue){
		this.venue = venue;
	}

	public Venue getVenue(){
		return venue;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"venue = '" + venue + '\'' + 
			"}";
		}
}