package nearby.wahdan.bazinga.nearbyapp.networking.Model.Image;

import com.google.gson.annotations.SerializedName;

public class Checkin{

	@SerializedName("createdAt")
	private int createdAt;

	@SerializedName("timeZoneOffset")
	private int timeZoneOffset;

	@SerializedName("id")
	private String id;

	@SerializedName("type")
	private String type;

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setTimeZoneOffset(int timeZoneOffset){
		this.timeZoneOffset = timeZoneOffset;
	}

	public int getTimeZoneOffset(){
		return timeZoneOffset;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
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
			"Checkin{" + 
			"createdAt = '" + createdAt + '\'' + 
			",timeZoneOffset = '" + timeZoneOffset + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}