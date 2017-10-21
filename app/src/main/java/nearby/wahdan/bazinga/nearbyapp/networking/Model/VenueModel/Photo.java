package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class Photo{

	@SerializedName("createdAt")
	private int createdAt;

	@SerializedName("visibility")
	private String visibility;

	@SerializedName("prefix")
	private String prefix;

	@SerializedName("width")
	private int width;

	@SerializedName("id")
	private String id;

	@SerializedName("suffix")
	private String suffix;

	@SerializedName("user")
	private User user;

	@SerializedName("height")
	private int height;

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setVisibility(String visibility){
		this.visibility = visibility;
	}

	public String getVisibility(){
		return visibility;
	}

	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public String getPrefix(){
		return prefix;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setSuffix(String suffix){
		this.suffix = suffix;
	}

	public String getSuffix(){
		return suffix;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"Photo{" + 
			"createdAt = '" + createdAt + '\'' + 
			",visibility = '" + visibility + '\'' + 
			",prefix = '" + prefix + '\'' + 
			",width = '" + width + '\'' + 
			",id = '" + id + '\'' + 
			",suffix = '" + suffix + '\'' + 
			",user = '" + user + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}