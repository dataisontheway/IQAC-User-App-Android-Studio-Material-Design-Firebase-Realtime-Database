package info.androidhive.navigationdrawer.other;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.androidhive.navigationdrawer.R;

public class EventRecyclerViewAdapter extends RecyclerView.Adapter<EventRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<EventInfo> MainImageUploadInfoList;

    public EventRecyclerViewAdapter(Context context, List<EventInfo> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }

    @Override
    public EventRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_event, parent, false);

        EventRecyclerViewAdapter.ViewHolder viewHolder = new EventRecyclerViewAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventRecyclerViewAdapter.ViewHolder holder, int position) {

        EventInfo UploadInfo = MainImageUploadInfoList.get(position);

        holder.textViewProgramme.setText(UploadInfo.getEventProgramme());
        holder.textViewTime.setText(UploadInfo.getEventTime());
        holder.textViewVenue.setText(UploadInfo.getEventVenue());

    }

    @Override
    public int getItemCount() {

        return MainImageUploadInfoList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewProgramme;
        public TextView textViewTime;
        public TextView textViewVenue;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewProgramme = (TextView) itemView.findViewById(R.id.programme);
            textViewTime = (TextView) itemView.findViewById(R.id.time);
            textViewVenue = (TextView) itemView.findViewById(R.id.venue);

        }
    }
}