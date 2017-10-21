package nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel;

import com.google.gson.annotations.SerializedName;

public class PhrasesItem{

	@SerializedName("phrase")
	private String phrase;

	@SerializedName("count")
	private int count;

	@SerializedName("sample")
	private Sample sample;

	public void setPhrase(String phrase){
		this.phrase = phrase;
	}

	public String getPhrase(){
		return phrase;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setSample(Sample sample){
		this.sample = sample;
	}

	public Sample getSample(){
		return sample;
	}

	@Override
 	public String toString(){
		return 
			"PhrasesItem{" + 
			"phrase = '" + phrase + '\'' + 
			",count = '" + count + '\'' + 
			",sample = '" + sample + '\'' + 
			"}";
		}
}