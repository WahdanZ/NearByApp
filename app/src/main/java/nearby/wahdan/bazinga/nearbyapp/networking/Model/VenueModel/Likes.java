package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Likes{

	@SerializedName("summary")
	private String summary;

	@SerializedName("count")
	private int count;

	@SerializedName("groups")
	private List<GroupsItem> groups;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setGroups(List<GroupsItem> groups){
		this.groups = groups;
	}

	public List<GroupsItem> getGroups(){
		return groups;
	}

	@Override
 	public String toString(){
		return 
			"Likes{" + 
			"summary = '" + summary + '\'' + 
			",count = '" + count + '\'' + 
			",groups = '" + groups + '\'' + 
			"}";
		}
}