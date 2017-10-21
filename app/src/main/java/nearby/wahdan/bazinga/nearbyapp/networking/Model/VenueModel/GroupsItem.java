package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class GroupsItem{

	@SerializedName("summary")
	private String summary;

	@SerializedName("name")
	private String name;

	@SerializedName("count")
	private int count;

	@SerializedName("type")
	private String type;

	@SerializedName("items")
	private List<ItemsItem> items;

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	@Override
 	public String toString(){
		return 
			"GroupsItem{" + 
			"summary = '" + summary + '\'' + 
			",name = '" + name + '\'' + 
			",count = '" + count + '\'' + 
			",type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}