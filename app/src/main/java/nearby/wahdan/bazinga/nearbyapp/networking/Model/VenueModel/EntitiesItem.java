package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EntitiesItem{

	@SerializedName("indices")
	private List<Integer> indices;

	@SerializedName("type")
	private String type;

	public void setIndices(List<Integer> indices){
		this.indices = indices;
	}

	public List<Integer> getIndices(){
		return indices;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"EntitiesItem{" + 
			"indices = '" + indices + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}