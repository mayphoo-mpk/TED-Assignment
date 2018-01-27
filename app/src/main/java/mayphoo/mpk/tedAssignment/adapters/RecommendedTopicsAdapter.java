package mayphoo.mpk.tedAssignment.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;
import mayphoo.mpk.tedAssignment.viewholders.TalkViewHolder;

/**
 * Created by User on 1/26/2018.
 */

public class RecommendedTopicsAdapter extends BaseRecyclerAdapter<TalkViewHolder, TalkVO> {

    private TalkDelegate mTalkDelegate;

    public RecommendedTopicsAdapter(Context context, TalkDelegate talkDelegate) {
        super(context);
        mTalkDelegate = talkDelegate;
    }

    @Override
    public TalkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View talkView = mLayoutInflater.inflate(R.layout.view_item_recommended_topic, parent, false);
        return new TalkViewHolder(talkView, mTalkDelegate);
    }

    @Override
    public void onBindViewHolder(TalkViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
