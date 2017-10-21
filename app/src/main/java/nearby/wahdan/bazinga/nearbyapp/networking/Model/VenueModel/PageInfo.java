package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class PageInfo{

	@SerializedName("description")
	private String description;

	@SerializedName("banner")
	private String banner;

	@SerializedName("links")
	private Links links;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setBanner(String banner){
		this.banner = banner;
	}

	public String getBanner(){
		return banner;
	}

	public void setLinks(Links links){
		this.links = links;
	}

	public Links getLinks(){
		return links;
	}

	@Override
 	public String toString(){
		return 
			"PageInfo{" + 
			"description = '" + description + '\'' + 
			",banner = '" + banner + '\'' + 
			",links = '" + links + '\'' + 
			"}";
		}
}