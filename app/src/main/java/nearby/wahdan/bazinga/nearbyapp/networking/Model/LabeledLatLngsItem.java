package nearby.wahdan.bazinga.nearbyapp.networking.Model;

import com.google.gson.annotations.SerializedName;

public class LabeledLatLngsItem{

	@SerializedName("lng")
	private double lng;

	@SerializedName("label")
	private String label;

	@SerializedName("lat")
	private double lat;

	public void setLng(double lng){
		this.lng = lng;
	}

	public double getLng(){
		return lng;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"LabeledLatLngsItem{" + 
			"lng = '" + lng + '\'' + 
			",label = '" + label + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}