package nearby.wahdan.bazinga.nearbyapp.networking.API;


import io.reactivex.Observable;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.FoursquareResponse;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.Image.ImageResponse;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.Venue;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel.VenueResponse;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by ahmedwahdan on 10/10/20.
 */

public interface FoursquareAPI {
    @GET("venues/explore/")
    Observable<Response<FoursquareResponse>> getVenues(@Query("ll") String latlng, @Query("client_id") String client_id,
                                                       @Query("client_secret") String client_secret, @Query("v") String v);
    @GET("venues/{id}/photos")
    Observable<Response<ImageResponse>> getPhoto(@Path("id") String id , @Query("client_id") String client_id,
                                                 @Query("client_secret") String client_secret, @Query("v") String v);
    @GET("venues/{id}/")
    Observable<Response<VenueResponse>> getVenue(@Path("id") String id , @Query("client_id") String client_id,
                                                 @Query("client_secret") String client_secret, @Query("v") String v);
}
