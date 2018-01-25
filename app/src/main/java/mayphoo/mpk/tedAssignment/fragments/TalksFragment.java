package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;

/**
 * Created by User on 1/25/2018.
 */

public class TalksFragment extends BaseFragment {

    public static TalksFragment newInstance(){
        TalksFragment talksFragment = new TalksFragment();
        return talksFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);        //context is container Activity
    }

}
