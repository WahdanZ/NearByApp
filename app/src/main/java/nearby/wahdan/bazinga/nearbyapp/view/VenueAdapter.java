package nearby.wahdan.bazinga.nearbyapp.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import nearby.wahdan.bazinga.nearbyapp.R;
import nearby.wahdan.bazinga.nearbyapp.networking.Model.VenueModel.Venue;

/**
 * Created by ahmedwahdan on 10/21/17.
 */

public class VenueAdapter extends  RecyclerView.Adapter<VenueAdapter.venueViewHolder>{
   private List<Venue> venueList;
    private Context context;

    public VenueAdapter( Context context) {
        venueList = new ArrayList<>();
        this.context = context;
    }

    @Override
    public venueViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.venue_item,parent,false);
        return new venueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(venueViewHolder holder, int position) {
        Venue venue = venueList.get(position);
        holder.venuename.setText(venue.getName());
        if (venue.getDescription() != null)
            holder.description.setText(venue.getLocation().getAddress());
        else
            holder.description.setText(R.string.no_des);

        Glide.with(context).load(venue.getImgUrl()).centerCrop().crossFade().into(holder.thumbnail);






    }

    @Override
    public int getItemCount() {
        return venueList.size();
    }

    public void updateList(List<Venue> venues){
        venueList.clear();
        venueList.addAll(venues);
        notifyDataSetChanged();
    }

    public class venueViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.thumbnail)
        ImageView thumbnail;
        @BindView(R.id.venuename)
        TextView venuename;
        @BindView(R.id.description)
        TextView description;

        public venueViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
