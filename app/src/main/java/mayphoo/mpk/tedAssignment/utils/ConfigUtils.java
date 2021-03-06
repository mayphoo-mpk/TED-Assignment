package mayphoo.mpk.tedAssignment.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by User on 1/26/2018.
 */

public class ConfigUtils {

    private static final String KEY_PAGE_INDEX = "KEY_PAGE_INDEX";

    private SharedPreferences mSharedPreferences;

    public ConfigUtils(Context context) {
        mSharedPreferences = context.getSharedPreferences("ConfigUtils", Context.MODE_PRIVATE);
    }

    public void savePageIndex(int pageIndex) {
        mSharedPreferences.edit().putInt(KEY_PAGE_INDEX, pageIndex).apply();
    }

    public int loadPageIndex() {
        return mSharedPreferences.getInt(KEY_PAGE_INDEX , 1);
    }
}
