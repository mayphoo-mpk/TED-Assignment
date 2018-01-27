package mayphoo.mpk.tedAssignment.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import mayphoo.mpk.tedAssignment.fragments.PlaylistFragment;
import mayphoo.mpk.tedAssignment.fragments.PodcastFragment;
import mayphoo.mpk.tedAssignment.fragments.TalkFragment;

/**
 * Created by User on 1/25/2018.
 */

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TalkFragment();
                //TalkFragment.newInstance();
            case 1:
                return new PlaylistFragment();
                /*PlaylistFragment.newInstance();
                break;*/
            case 2:
                return new PodcastFragment();
                /*PodcastFragment.newInstance();
                break;*/
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
