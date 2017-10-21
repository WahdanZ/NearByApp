package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("gender")
	private String gender;

	@SerializedName("lists")
	private Lists lists;

	@SerializedName("homeCity")
	private String homeCity;

	@SerializedName("contact")
	private Contact contact;

	@SerializedName("photo")
	private Photo photo;

	@SerializedName("bio")
	private String bio;

	@SerializedName("id")
	private String id;

	@SerializedName("type")
	private String type;

	@SerializedName("tips")
	private Tips tips;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setLists(Lists lists){
		this.lists = lists;
	}

	public Lists getLists(){
		return lists;
	}

	public void setHomeCity(String homeCity){
		this.homeCity = homeCity;
	}

	public String getHomeCity(){
		return homeCity;
	}

	public void setContact(Contact contact){
		this.contact = contact;
	}

	public Contact getContact(){
		return contact;
	}

	public void setPhoto(Photo photo){
		this.photo = photo;
	}

	public Photo getPhoto(){
		return photo;
	}

	public void setBio(String bio){
		this.bio = bio;
	}

	public String getBio(){
		return bio;
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

	public void setTips(Tips tips){
		this.tips = tips;
	}

	public Tips getTips(){
		return tips;
	}

	@Override
 	public String toString(){
		return 
			"User{" + 
			"firstName = '" + firstName + '\'' + 
			",gender = '" + gender + '\'' + 
			",lists = '" + lists + '\'' + 
			",homeCity = '" + homeCity + '\'' + 
			",contact = '" + contact + '\'' + 
			",photo = '" + photo + '\'' + 
			",bio = '" + bio + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",tips = '" + tips + '\'' + 
			"}";
		}
}