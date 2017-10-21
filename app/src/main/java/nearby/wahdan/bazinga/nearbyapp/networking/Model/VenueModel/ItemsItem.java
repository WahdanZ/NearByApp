package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class ItemsItem{

	@SerializedName("canonicalUrl")
	private String canonicalUrl;

	@SerializedName("editable")
	private boolean editable;

	@SerializedName("collaborative")
	private boolean collaborative;

	@SerializedName("description")
	private String description;

	@SerializedName("photo")
	private Photo photo;

	@SerializedName("type")
	private String type;

	@SerializedName("url")
	private String url;

	@SerializedName("createdAt")
	private int createdAt;

	@SerializedName("listItems")
	private ListItems listItems;

	@SerializedName("followers")
	private Followers followers;

	@SerializedName("public")
	private boolean jsonMemberPublic;

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private String id;

	@SerializedName("user")
	private User user;

	@SerializedName("updatedAt")
	private int updatedAt;

	public void setCanonicalUrl(String canonicalUrl){
		this.canonicalUrl = canonicalUrl;
	}

	public String getCanonicalUrl(){
		return canonicalUrl;
	}

	public void setEditable(boolean editable){
		this.editable = editable;
	}

	public boolean isEditable(){
		return editable;
	}

	public void setCollaborative(boolean collaborative){
		this.collaborative = collaborative;
	}

	public boolean isCollaborative(){
		return collaborative;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setPhoto(Photo photo){
		this.photo = photo;
	}

	public Photo getPhoto(){
		return photo;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setListItems(ListItems listItems){
		this.listItems = listItems;
	}

	public ListItems getListItems(){
		return listItems;
	}

	public void setFollowers(Followers followers){
		this.followers = followers;
	}

	public Followers getFollowers(){
		return followers;
	}

	public void setJsonMemberPublic(boolean jsonMemberPublic){
		this.jsonMemberPublic = jsonMemberPublic;
	}

	public boolean isJsonMemberPublic(){
		return jsonMemberPublic;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setUpdatedAt(int updatedAt){
		this.updatedAt = updatedAt;
	}

	public int getUpdatedAt(){
		return updatedAt;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"canonicalUrl = '" + canonicalUrl + '\'' + 
			",editable = '" + editable + '\'' + 
			",collaborative = '" + collaborative + '\'' + 
			",description = '" + description + '\'' + 
			",photo = '" + photo + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",listItems = '" + listItems + '\'' + 
			",followers = '" + followers + '\'' + 
			",public = '" + jsonMemberPublic + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",user = '" + user + '\'' + 
			",updatedAt = '" + updatedAt + '\'' + 
			"}";
		}
}