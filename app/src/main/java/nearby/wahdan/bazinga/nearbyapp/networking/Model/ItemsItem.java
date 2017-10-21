package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemsItem{

	@SerializedName("venue")
	private Venue venue;

	@SerializedName("reasons")
	private Reasons reasons;

	@SerializedName("referralId")
	private String referralId;

	@SerializedName("tips")
	private List<TipsItem> tips;

	public void setVenue(Venue venue){
		this.venue = venue;
	}

	public Venue getVenue(){
		return venue;
	}

	public void setReasons(Reasons reasons){
		this.reasons = reasons;
	}

	public Reasons getReasons(){
		return reasons;
	}

	public void setReferralId(String referralId){
		this.referralId = referralId;
	}

	public String getReferralId(){
		return referralId;
	}

	public void setTips(List<TipsItem> tips){
		this.tips = tips;
	}

	public List<TipsItem> getTips(){
		return tips;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"venue = '" + venue + '\'' + 
			",reasons = '" + reasons + '\'' + 
			",referralId = '" + referralId + '\'' + 
			",tips = '" + tips + '\'' + 
			"}";
		}
}