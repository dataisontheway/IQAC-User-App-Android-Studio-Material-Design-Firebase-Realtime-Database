package info.androidhive.navigationdrawer.other;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import info.androidhive.navigationdrawer.R;

public class PrivacyRecyclerViewAdapter extends RecyclerView.Adapter<PrivacyRecyclerViewAdapter.ViewHolder> {

    //public class PrivacyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    List<PrivacyInfo> MainImageUploadInfoList;

    public PrivacyRecyclerViewAdapter(Context context, List<PrivacyInfo> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }

    @Override
    public PrivacyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_privacy, parent, false);

        PrivacyRecyclerViewAdapter.ViewHolder viewHolder = new PrivacyRecyclerViewAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PrivacyRecyclerViewAdapter.ViewHolder holder, int position) {
        PrivacyInfo UploadInfo = MainImageUploadInfoList.get(position);

        holder.imageDescriptionTextView.setText(UploadInfo.getPrivacyDescription());

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