package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.adapters.TalksAdapter;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;

/**
 * Created by User on 1/25/2018.
 */

public class TalkFragment extends BaseFragment implements LoaderManager.LoaderCallbacks<Cursor>, TalkDelegate {

    @BindView(R.id.rv_items)
    RecyclerView rvItems;

    private TalksAdapter mTalksAdapter;

    public static TalkFragment newInstance(){
        TalkFragment talkFragment = new TalkFragment();
        return talkFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_item, container, false);
        ButterKnife.bind(this, view);

        rvItems.setHasFixedSize(true);
        rvItems.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        mTalksAdapter = new TalksAdapter(getContext(), this);
        rvItems.setAdapter(mTalksAdapter);

        return view;
    }

    @Override
    public void onTapTalk(TalkVO talk) {

    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
