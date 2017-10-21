package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Likes{

	@SerializedName("summary")
	private String summary;

	@SerializedName("count")
	private int count;

	@SerializedName("groups")
	private List<Object> groups;

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

	public void setGroups(List<Object> groups){
		this.groups = groups;
	}

	public List<Object> getGroups(){
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