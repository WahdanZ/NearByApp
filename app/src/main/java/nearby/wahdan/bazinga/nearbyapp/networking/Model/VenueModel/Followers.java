package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class Followers{

	@SerializedName("count")
	private int count;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	@Override
 	public String toString(){
		return 
			"Followers{" + 
			"count = '" + count + '\'' + 
			"}";
		}
}