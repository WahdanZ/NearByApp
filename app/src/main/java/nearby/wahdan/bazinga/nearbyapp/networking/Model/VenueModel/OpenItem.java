package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class OpenItem{

	@SerializedName("renderedTime")
	private String renderedTime;

	public void setRenderedTime(String renderedTime){
		this.renderedTime = renderedTime;
	}

	public String getRenderedTime(){
		return renderedTime;
	}

	@Override
 	public String toString(){
		return 
			"OpenItem{" + 
			"renderedTime = '" + renderedTime + '\'' + 
			"}";
		}
}