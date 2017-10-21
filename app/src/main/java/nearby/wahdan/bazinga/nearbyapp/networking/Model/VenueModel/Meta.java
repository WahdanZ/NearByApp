package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class Meta{

	@SerializedName("code")
	private int code;

	@SerializedName("requestId")
	private String requestId;

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	public String getRequestId(){
		return requestId;
	}

	@Override
 	public String toString(){
		return 
			"Meta{" + 
			"code = '" + code + '\'' + 
			",requestId = '" + requestId + '\'' + 
			"}";
		}
}