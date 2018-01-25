package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;

/**
 * Created by User on 1/25/2018.
 */

public class PodcastsFragment extends BaseFragment {

    public static PodcastsFragment newInstance() {
        PodcastsFragment podcastsFragment = new PodcastsFragment();
        return podcastsFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);        //context is container Activity
    }

}
