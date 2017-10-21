package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TimeframesItem{

	@SerializedName("includesToday")
	private boolean includesToday;

	@SerializedName("days")
	private String days;

	@SerializedName("open")
	private List<OpenItem> open;

	@SerializedName("segments")
	private List<Object> segments;

	public void setIncludesToday(boolean includesToday){
		this.includesToday = includesToday;
	}

	public boolean isIncludesToday(){
		return includesToday;
	}

	public void setDays(String days){
		this.days = days;
	}

	public String getDays(){
		return days;
	}

	public void setOpen(List<OpenItem> open){
		this.open = open;
	}

	public List<OpenItem> getOpen(){
		return open;
	}

	public void setSegments(List<Object> segments){
		this.segments = segments;
	}

	public List<Object> getSegments(){
		return segments;
	}

	@Override
 	public String toString(){
		return 
			"TimeframesItem{" + 
			"includesToday = '" + includesToday + '\'' + 
			",days = '" + days + '\'' + 
			",open = '" + open + '\'' + 
			",segments = '" + segments + '\'' + 
			"}";
		}
}