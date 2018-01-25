package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;

/**
 * Created by User on 1/25/2018.
 */

public class PlaylistsFragment extends BaseFragment {

    public static PlaylistsFragment newInstance() {
        PlaylistsFragment playlistsFragment = new PlaylistsFragment();
        return playlistsFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);        //context is container Activity
    }

}
