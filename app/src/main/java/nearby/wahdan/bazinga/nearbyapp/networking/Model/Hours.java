package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

public class Hours{

	@SerializedName("isOpen")
	private boolean isOpen;

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
			",isLocalHoliday = '" + isLocalHoliday + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}