package info.androidhive.navigationdrawer.other;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import info.androidhive.navigationdrawer.R;

public class AboutRecyclerViewAdapter extends RecyclerView.Adapter<AboutRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<AboutInfo> MainImageUploadInfoList;

    public AboutRecyclerViewAdapter(Context context, List<AboutInfo> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }

    @Override
    public AboutRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_about, parent, false);

        AboutRecyclerViewAdapter.ViewHolder viewHolder = new AboutRecyclerViewAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AboutRecyclerViewAdapter.ViewHolder holder, int position) {
        AboutInfo UploadInfo = MainImageUploadInfoList.get(position);

        holder.imageDescriptionTextView.setText(UploadInfo.getAboutDescription());

    }

    @Override
    public int getItemCount() {

        return MainImageUploadInfoList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView imageDescriptionTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            imageDescriptionTextView = (TextView) itemView.findViewById(R.id.description);

        }
    }
}

