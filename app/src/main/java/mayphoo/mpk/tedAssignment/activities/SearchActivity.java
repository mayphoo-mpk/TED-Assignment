package mayphoo.mpk.tedAssignment.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.adapters.RecommendedSpeakersAdapter;
import mayphoo.mpk.tedAssignment.adapters.RecommendedTopicsAdapter;
import mayphoo.mpk.tedAssignment.adapters.SearchResultAdapter;
import mayphoo.mpk.tedAssignment.components.ItemOffsetDecoration;
import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.delegates.TalkDelegate;

/**
 * Created by User on 1/27/2018.
 */

public class SearchActivity extends BaseActivity implements TalkDelegate {

    @BindView(R.id.rl_recommended)
    RelativeLayout rlRecommended;

    @BindView(R.id.rv_recommended_topics)
    RecyclerView rvRecommendedTopics;

    @BindView(R.id.rv_recommended_speakers)
    RecyclerView rvRecommendedSpeakers;

    @BindView(R.id.rv_search_results)
    RecyclerView rvSearchResults;

    @BindView(R.id.edtxt_search)
    EditText edTxtSearch;

    private RecommendedTopicsAdapter mRecommendedTopicsAdapter;

    private RecommendedSpeakersAdapter mRecommendedSpeakersAdapter;

    private SearchResultAdapter mSearchResultAdapter;

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, SearchActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ButterKnife.bind(this, this);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        rvRecommendedTopics.setHasFixedSize(true);
        rvRecommendedTopics.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        mRecommendedTopicsAdapter = new RecommendedTopicsAdapter(getApplicationContext(), this);
        rvRecommendedTopics.setAdapter(mRecommendedTopicsAdapter);

        rvRecommendedSpeakers.setHasFixedSize(true);
        rvRecommendedSpeakers.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        mRecommendedSpeakersAdapter = new RecommendedSpeakersAdapter(getApplicationContext(), this);
        rvRecommendedSpeakers.setAdapter(mRecommendedSpeakersAdapter);

        rvSearchResults.setHasFixedSize(true);
        rvSearchResults.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(getApplicationContext(), R.dimen.margin_small);
        rvSearchResults.addItemDecoration(itemDecoration);
        mSearchResultAdapter = new SearchResultAdapter(getApplicationContext(), this);
        rvSearchResults.setAdapter(mSearchResultAdapter);

        edTxtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(charSequence != null || charSequence.equals(" ")) {
                    rlRecommended.setVisibility(View.GONE);
                    rvSearchResults.setVisibility(View.VISIBLE);
                } else {
                    rvSearchResults.setVisibility(View.GONE);
                    rlRecommended.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onTapTalk(TalkVO talk) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
