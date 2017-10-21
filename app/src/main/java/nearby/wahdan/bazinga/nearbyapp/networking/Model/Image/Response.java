package nearby.wahdan.bazinga.nearbyapp.networking.Model.Image;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("photos")
	private Photos photos;

	public void setPhotos(Photos photos){
		this.photos = photos;
	}

	public Photos getPhotos(){
		return photos;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"photos = '" + photos + '\'' + 
			"}";
		}
}