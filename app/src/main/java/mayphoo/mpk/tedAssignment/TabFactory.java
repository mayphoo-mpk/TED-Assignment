package mayphoo.mpk.tedAssignment;

import android.content.Context;
import android.view.View;
import android.widget.TabHost;

/**
 * Created by User on 1/25/2018.
 */

public class TabFactory implements TabHost.TabContentFactory {

    private final Context mContext;

    public TabFactory(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public View createTabContent(String s) {
        View v = new View(mContext);
        v.setMinimumWidth(0);
        v.setMinimumHeight(0);
        return v;
    }
}
