package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Hours{

	@SerializedName("isOpen")
	private boolean isOpen;

	@SerializedName("timeframes")
	private List<TimeframesItem> timeframes;

	@SerializedName("isLocalHoliday")
	private boolean isLocalHoliday;

	@SerializedName("status")
	private String status;

	public void setIsOpen(boolean isOpen){
		this.isOpen = isOpen;
	}

	public boolean isIsOpen(){
		return isOpen;
	}

	public void setTimeframes(List<TimeframesItem> timeframes){
		this.timeframes = timeframes;
	}

	public List<TimeframesItem> getTimeframes(){
		return timeframes;
	}

	public void setIsLocalHoliday(boolean isLocalHoliday){
		this.isLocalHoliday = isLocalHoliday;
	}

	public boolean isIsLocalHoliday(){
		return isLocalHoliday;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Hours{" + 
			"isOpen = '" + isOpen + '\'' + 
			",timeframes = '" + timeframes + '\'' + 
			",isLocalHoliday = '" + isLocalHoliday + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}