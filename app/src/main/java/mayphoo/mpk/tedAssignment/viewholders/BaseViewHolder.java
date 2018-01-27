package mayphoo.mpk.tedAssignment.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by User on 1/26/2018.
 */

public abstract class BaseViewHolder<W> extends RecyclerView.ViewHolder implements View.OnClickListener  {

    protected W mData;

    public BaseViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        itemView.setOnClickListener(this);
    }

    public abstract void setData(W data);

}
