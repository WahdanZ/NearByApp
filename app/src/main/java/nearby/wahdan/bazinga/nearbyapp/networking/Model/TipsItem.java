package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

public class TipsItem{

	@SerializedName("canonicalUrl")
	private String canonicalUrl;

	@SerializedName("photo")
	private Photo photo;

	@SerializedName("type")
	private String type;

	@SerializedName("disagreeCount")
	private int disagreeCount;

	@SerializedName("todo")
	private Todo todo;

	@SerializedName("createdAt")
	private int createdAt;

	@SerializedName("photourl")
	private String photourl;

	@SerializedName("logView")
	private boolean logView;

	@SerializedName("agreeCount")
	private int agreeCount;

	@SerializedName("id")
	private String id;

	@SerializedName("text")
	private String text;

	@SerializedName("user")
	private User user;

	@SerializedName("likes")
	private Likes likes;

	public void setCanonicalUrl(String canonicalUrl){
		this.canonicalUrl = canonicalUrl;
	}

	public String getCanonicalUrl(){
		return canonicalUrl;
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

	public void setDisagreeCount(int disagreeCount){
		this.disagreeCount = disagreeCount;
	}

	public int getDisagreeCount(){
		return disagreeCount;
	}

	public void setTodo(Todo todo){
		this.todo = todo;
	}

	public Todo getTodo(){
		return todo;
	}

	public void setCreatedAt(int createdAt){
		this.createdAt = createdAt;
	}

	public int getCreatedAt(){
		return createdAt;
	}

	public void setPhotourl(String photourl){
		this.photourl = photourl;
	}

	public String getPhotourl(){
		return photourl;
	}

	public void setLogView(boolean logView){
		this.logView = logView;
	}

	public boolean isLogView(){
		return logView;
	}

	public void setAgreeCount(int agreeCount){
		this.agreeCount = agreeCount;
	}

	public int getAgreeCount(){
		return agreeCount;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	public void setLikes(Likes likes){
		this.likes = likes;
	}

	public Likes getLikes(){
		return likes;
	}

	@Override
 	public String toString(){
		return 
			"TipsItem{" + 
			"canonicalUrl = '" + canonicalUrl + '\'' + 
			",photo = '" + photo + '\'' + 
			",type = '" + type + '\'' + 
			",disagreeCount = '" + disagreeCount + '\'' + 
			",todo = '" + todo + '\'' + 
			",createdAt = '" + createdAt + '\'' + 
			",photourl = '" + photourl + '\'' + 
			",logView = '" + logView + '\'' + 
			",agreeCount = '" + agreeCount + '\'' + 
			",id = '" + id + '\'' + 
			",text = '" + text + '\'' + 
			",user = '" + user + '\'' + 
			",likes = '" + likes + '\'' + 
			"}";
		}
}