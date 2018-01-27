package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.adapters.PlaylistsAdapter;
import mayphoo.mpk.tedAssignment.adapters.TalksAdapter;
import mayphoo.mpk.tedAssignment.components.ItemOffsetDecoration;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;

/**
 * Created by User on 1/25/2018.
 */

public class PlaylistFragment extends BaseFragment implements TalkDelegate {

    @BindView(R.id.rv_items)
    RecyclerView rvItems;

    private PlaylistsAdapter mPlaylistsAdapter;

    public static PlaylistFragment newInstance() {
        PlaylistFragment playlistFragment = new PlaylistFragment();
        return playlistFragment;
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
        rvItems.setLayoutManager(new GridLayoutManager(getContext(), 2));
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(getContext(), R.dimen.margin_small);
        rvItems.addItemDecoration(itemDecoration);
        mPlaylistsAdapter = new PlaylistsAdapter(getContext(), this);
        rvItems.setAdapter(mPlaylistsAdapter);

        return view;
    }

    @Override
    public void onTapTalk(TalkVO talk) {

    }

}
