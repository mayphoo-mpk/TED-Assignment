package mayphoo.mpk.tedAssignment.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mayphoo.mpk.tedAssignment.viewholders.BaseViewHolder;

/**
 * Created by User on 1/26/2018.
 */

public abstract class BaseRecyclerAdapter<T extends BaseViewHolder, W> extends RecyclerView.Adapter<T> {

    protected List<W> mData;
    protected LayoutInflater mLayoutInflater;

    public BaseRecyclerAdapter(Context context) {
        mData = new ArrayList<>();
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(T holder, int position) {
        holder.setData(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setNewData(List<W> newData){
        mData = newData;
        notifyDataSetChanged();
    }
}
