package mayphoo.mpk.tedAssignment.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TabHost;
import android.widget.TabWidget;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.tedAssignment.R;
import mayphoo.mpk.tedAssignment.TabFactory;
import mayphoo.mpk.tedAssignment.adapters.TabsPagerAdapter;
import mayphoo.mpk.tedAssignment.fragments.BaseFragment;

public class MainActivity extends BaseActivity implements TabHost.OnTabChangeListener, ViewPager.OnPageChangeListener, BaseFragment.OnToolbarTitleListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(android.R.id.tabhost)
    TabHost mTabHost;

    @BindView(android.R.id.tabs)
    TabWidget mTabWidget;

    @BindView(android.R.id.tabcontent)
    FrameLayout mTabContent;

    @BindView(R.id.viewpager)
    ViewPager mViewPager;

    private TabsPagerAdapter mTabsPagerAdapter;
    TabHost.TabSpec spec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent searchIntent = SearchActivity.newIntent(getApplicationContext());
                startActivity(searchIntent);
            }
        });

        //Tab Initialization
        initialiseTabHost();

        mTabsPagerAdapter = new TabsPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mTabsPagerAdapter);
        mViewPager.setOnPageChangeListener(this);
    }

    private void initialiseTabHost() {

        mTabHost.setup();

        spec = mTabHost.newTabSpec("first");
        spec.setIndicator("", getResources().getDrawable(R.drawable.ic_format_list_24dp));
        spec.setContent(new TabFactory(this));
        mTabHost.addTab(spec);

        spec = mTabHost.newTabSpec("second");
        spec.setIndicator("", getResources().getDrawable(R.drawable.ic_subscriptions_24dp));
        spec.setContent(new TabFactory(this));
        mTabHost.addTab(spec);

        spec = mTabHost.newTabSpec("third");
        spec.setIndicator("", getResources().getDrawable(R.drawable.ic_headset_24dp));
        spec.setContent(new TabFactory(this));
        mTabHost.addTab(spec);

        mTabHost.setOnTabChangedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Manages the Page changes, synchronizing it with Tabs
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        int pos = this.mViewPager.getCurrentItem();
        this.mTabHost.setCurrentTab(pos);
        onSetToolbarTitle(pos);
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    // Manages the Tab changes, synchronizing it with Pages
    @Override
    public void onTabChanged(String s) {
        int pos = this.mTabHost.getCurrentTab();
        this.mViewPager.setCurrentItem(pos);
        onSetToolbarTitle(pos);
    }

    //set toolbar title of current Fragment
    @Override
    public void onSetToolbarTitle(int position) {
        switch (position){
            case 0:
                toolbar.setTitle("TED Talks");
                toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
                break;
            case 1:
                toolbar.setTitle("TED Playlists");
                toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
                break;
            case 2:
                toolbar.setTitle("TED Podcasts");
                toolbar.setTitleTextColor(getResources().getColor(R.color.colorAccent));
            break;
        }
    }
}
