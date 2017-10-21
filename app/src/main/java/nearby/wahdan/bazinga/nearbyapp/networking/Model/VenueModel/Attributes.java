package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Attributes{

	@SerializedName("groups")
	private List<GroupsItem> groups;

	public void setGroups(List<GroupsItem> groups){
		this.groups = groups;
	}

	public List<GroupsItem> getGroups(){
		return groups;
	}

	@Override
 	public String toString(){
		return 
			"Attributes{" + 
			"groups = '" + groups + '\'' + 
			"}";
		}
}