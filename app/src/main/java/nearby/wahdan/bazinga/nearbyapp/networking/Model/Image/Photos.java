package nearby.wahdan.bazinga.nearbyapp.networking.Model.Image;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Photos{

	@SerializedName("count")
	private int count;

	@SerializedName("dupesRemoved")
	private int dupesRemoved;

	@SerializedName("items")
	private List<ItemsItem> items;

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setDupesRemoved(int dupesRemoved){
		this.dupesRemoved = dupesRemoved;
	}

	public int getDupesRemoved(){
		return dupesRemoved;
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
			"Photos{" + 
			"count = '" + count + '\'' + 
			",dupesRemoved = '" + dupesRemoved + '\'' + 
			",items = '" + items + '\'' + 
			"}";
		}
}