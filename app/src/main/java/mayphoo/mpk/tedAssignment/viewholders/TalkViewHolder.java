package mayphoo.mpk.tedAssignment.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;

/**
 * Created by User on 1/26/2018.
 */

public class TalkViewHolder extends BaseViewHolder<TalkVO> {

   /* @BindView(R.id.iv_talk)
    ImageView ivTalk;

    @BindView(R.id.tv_time)
    TextView tvTime;

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @BindView(R.id.tv_speaker)
    TextView tvSpeaker;*/

    private TalkDelegate mDelegate;

    public TalkViewHolder(View itemView, TalkDelegate talkDelegate) {
        super(itemView);
        mDelegate = talkDelegate;
    }

    @Override
    public void setData(TalkVO data) {
        mData = data;
    }

    @Override
    public void onClick(View view) {
        mDelegate.onTapTalk(mData);
    }

}
