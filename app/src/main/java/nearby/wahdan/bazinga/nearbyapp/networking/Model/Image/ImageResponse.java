package nearby.wahdan.bazinga.nearbyapp.networking.Model.Image;

import com.google.gson.annotations.SerializedName;

public class ImageResponse{

	@SerializedName("meta")
	private Meta meta;

	@SerializedName("response")
	private Response response;

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setResponse(Response response){
		this.response = response;
	}

	public Response getResponse(){
		return response;
	}

	@Override
 	public String toString(){
		return 
			"ImageResponse{" + 
			"meta = '" + meta + '\'' + 
			",response = '" + response + '\'' + 
			"}";
		}
}