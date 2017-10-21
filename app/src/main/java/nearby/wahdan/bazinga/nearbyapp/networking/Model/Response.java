package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response{

	@SerializedName("geocode")
	private Geocode geocode;

	@SerializedName("groups")
	private List<GroupsItem> groups;

	public void setGeocode(Geocode geocode){
		this.geocode = geocode;
	}

	public Geocode getGeocode(){
		return geocode;
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
			"Response{" + 
			"geocode = '" + geocode + '\'' + 
			",groups = '" + groups + '\'' + 
			"}";
		}
}