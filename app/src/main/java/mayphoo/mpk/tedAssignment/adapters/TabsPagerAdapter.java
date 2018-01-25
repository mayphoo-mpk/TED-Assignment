package mayphoo.mpk.tedAssignment.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import mayphoo.mpk.tedAssignment.fragments.TalksFragment;
import mayphoo.mpk.tedAssignment.fragments.PodcastsFragment;
import mayphoo.mpk.tedAssignment.fragments.PlaylistsFragment;

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
                return new TalksFragment();
                //TalksFragment.newInstance();
            case 1:
                return new PlaylistsFragment();
                /*PlaylistsFragment.newInstance();
                break;*/
            case 2:
                return new PodcastsFragment();
                /*PodcastsFragment.newInstance();
                break;*/
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
