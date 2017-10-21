package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

public class Geocode{

	@SerializedName("cc")
	private String cc;

	@SerializedName("what")
	private String what;

	@SerializedName("displayString")
	private String displayString;

	@SerializedName("center")
	private Center center;

	@SerializedName("where")
	private String where;

	public void setCc(String cc){
		this.cc = cc;
	}

	public String getCc(){
		return cc;
	}

	public void setWhat(String what){
		this.what = what;
	}

	public String getWhat(){
		return what;
	}

	public void setDisplayString(String displayString){
		this.displayString = displayString;
	}

	public String getDisplayString(){
		return displayString;
	}

	public void setCenter(Center center){
		this.center = center;
	}

	public Center getCenter(){
		return center;
	}

	public void setWhere(String where){
		this.where = where;
	}

	public String getWhere(){
		return where;
	}

	@Override
 	public String toString(){
		return 
			"Geocode{" + 
			"cc = '" + cc + '\'' + 
			",what = '" + what + '\'' + 
			",displayString = '" + displayString + '\'' + 
			",center = '" + center + '\'' + 
			",where = '" + where + '\'' + 
			"}";
		}
}