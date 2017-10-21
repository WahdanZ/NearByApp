package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class BeenHere{

	@SerializedName("marked")
	private boolean marked;

	@SerializedName("count")
	private int count;

	@SerializedName("unconfirmedCount")
	private int unconfirmedCount;

	@SerializedName("lastCheckinExpiredAt")
	private int lastCheckinExpiredAt;

	public void setMarked(boolean marked){
		this.marked = marked;
	}

	public boolean isMarked(){
		return marked;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setUnconfirmedCount(int unconfirmedCount){
		this.unconfirmedCount = unconfirmedCount;
	}

	public int getUnconfirmedCount(){
		return unconfirmedCount;
	}

	public void setLastCheckinExpiredAt(int lastCheckinExpiredAt){
		this.lastCheckinExpiredAt = lastCheckinExpiredAt;
	}

	public int getLastCheckinExpiredAt(){
		return lastCheckinExpiredAt;
	}

	@Override
 	public String toString(){
		return 
			"BeenHere{" + 
			"marked = '" + marked + '\'' + 
			",count = '" + count + '\'' + 
			",unconfirmedCount = '" + unconfirmedCount + '\'' + 
			",lastCheckinExpiredAt = '" + lastCheckinExpiredAt + '\'' + 
			"}";
		}
}