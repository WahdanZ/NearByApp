package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GroupsItem{

	@SerializedName("name")
	private String name;

	@SerializedName("count")
	private int count;

	@SerializedName("type")
	private String type;

	@SerializedName("items")
	private List<ItemsItem> items;

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
			"name = '" + name + '\'' + 
			",count = '" + count + '\'' + 
			",type = '" + type + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}