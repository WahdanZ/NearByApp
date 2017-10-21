package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class Page{

	@SerializedName("pageInfo")
	private PageInfo pageInfo;

	@SerializedName("user")
	private User user;

	public void setPageInfo(PageInfo pageInfo){
		this.pageInfo = pageInfo;
	}

	public PageInfo getPageInfo(){
		return pageInfo;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}

	@Override
 	public String toString(){
		return 
			"Page{" + 
			"pageInfo = '" + pageInfo + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}
}