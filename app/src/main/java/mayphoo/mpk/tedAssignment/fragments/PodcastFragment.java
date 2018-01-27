package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.adapters.PodcastsAdapter;
import mayphoo.mpk.tedAssignment.adapters.TalksAdapter;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;

/**
 * Created by User on 1/25/2018.
 */

public class PodcastFragment extends BaseFragment implements TalkDelegate {

    @BindView(R.id.rv_items)
    RecyclerView rvItems;

    private PodcastsAdapter mPodcastAdapter;

    public static PodcastFragment newInstance() {
        PodcastFragment podcastFragment = new PodcastFragment();
        return podcastFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);        //context is container Activity
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_item, container, false);
        ButterKnife.bind(this, view);

        rvItems.setHasFixedSize(true);
        rvItems.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mPodcastAdapter = new PodcastsAdapter(getContext(), this);
        rvItems.setAdapter(mPodcastAdapter);

        return view;
    }

    @Override
    public void onTapTalk(TalkVO talk) {

    }

}
