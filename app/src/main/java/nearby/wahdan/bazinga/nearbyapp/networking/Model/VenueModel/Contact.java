package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class Contact{

	@SerializedName("twitter")
	private String twitter;

	@SerializedName("phone")
	private String phone;

	@SerializedName("facebookUsername")
	private String facebookUsername;

	@SerializedName("facebook")
	private String facebook;

	@SerializedName("formattedPhone")
	private String formattedPhone;

	@SerializedName("instagram")
	private String instagram;

	@SerializedName("facebookName")
	private String facebookName;

	public void setTwitter(String twitter){
		this.twitter = twitter;
	}

	public String getTwitter(){
		return twitter;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setFacebookUsername(String facebookUsername){
		this.facebookUsername = facebookUsername;
	}

	public String getFacebookUsername(){
		return facebookUsername;
	}

	public void setFacebook(String facebook){
		this.facebook = facebook;
	}

	public String getFacebook(){
		return facebook;
	}

	public void setFormattedPhone(String formattedPhone){
		this.formattedPhone = formattedPhone;
	}

	public String getFormattedPhone(){
		return formattedPhone;
	}

	public void setInstagram(String instagram){
		this.instagram = instagram;
	}

	public String getInstagram(){
		return instagram;
	}

	public void setFacebookName(String facebookName){
		this.facebookName = facebookName;
	}

	public String getFacebookName(){
		return facebookName;
	}

	@Override
 	public String toString(){
		return 
			"Contact{" + 
			"twitter = '" + twitter + '\'' + 
			",phone = '" + phone + '\'' + 
			",facebookUsername = '" + facebookUsername + '\'' + 
			",facebook = '" + facebook + '\'' + 
			",formattedPhone = '" + formattedPhone + '\'' + 
			",instagram = '" + instagram + '\'' + 
			",facebookName = '" + facebookName + '\'' + 
			"}";
		}
}