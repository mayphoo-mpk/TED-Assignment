package mayphoo.mpk.tedAssignment.mvp.presenters;

/**
 * Created by User on 1/26/2018.
 */

public abstract class BasePresenter<T> {

    protected T mView;

    public void onCreate(T view){
        mView = view;
    }

    public abstract void onStart();

    public void onResume(){

    }

    public void onPause() {

    }

    public abstract void onStop();

    public void onDestroy() {

    }
}
