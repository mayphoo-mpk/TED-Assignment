package mayphoo.mpk.tedAssignment.fragments;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by User on 1/25/2018.
 */

public class BaseFragment extends Fragment {

    OnToolbarTitleListener mCallback;

    //Container Activity must implement this interface
    public interface OnToolbarTitleListener {
        public void onSetToolbarTitle(int position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //This makes sure that the container activity has implemented the callback interface.
        //If not, it throws an exception
        try{
            mCallback = (OnToolbarTitleListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " must implement OnToolbarTitleListener");
        }
    }
}
