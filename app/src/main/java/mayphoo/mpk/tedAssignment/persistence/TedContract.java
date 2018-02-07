package mayphoo.mpk.tedAssignment.persistence;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

import mayphoo.mpk.tedAssignment.TedApp;

/**
 * Created by User on 2/1/2018.
 */

public class TedContract {

    public static final String CONTENT_AUTHORITY = TedApp.class.getPackage().getName();
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    public static final String PATH_TALK = "talk";
    public static final String PATH_SPEAKER = "speaker";
    public static final String PATH_TAG = "tag";

    public static class TalkEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_TALK).build();

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TALK;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TALK;

        public static final String TABLE_NAME = PATH_TALK;

        public static final String COLUMN_TALK_ID = "talk_id";
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_SPEAKER_ID = "speaker_id";
        public static final String COLUMN_IMAGE_URL = "image_url";
        public static final String COLUMN_DURATION_IN_SEC = "duration_in_sec";
        public static final String COLUMN_DESCRIPTION = "description";

        public static Uri buildTalkUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

    }

    public static class SpeakerEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_SPEAKER).build();

        public static final String DIR_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" +
                CONTENT_AUTHORITY + "/" + PATH_SPEAKER;

        public static final String ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" +
                CONTENT_AUTHORITY + "/" + PATH_SPEAKER;

        public static final String TABLE_NAME = PATH_SPEAKER;
        public static final String COLUMN_SPEAKER_ID = "speaker_id";
        public static final String COLUMN_NAME = "name";

        public static Uri buildSpeakerUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

    }

    public static class TagEntry implements BaseColumns {

        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_TAG).build();

        public static final String DIR_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TAG;

        public static final String ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_TAG;

        public static final String TABLE_NAME = PATH_TAG;

        public static final String COLUMN_TAG_ID = "tag_id";
        public static final String COLUMN_TAG = "tag";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_TALK_ID = "talk_id";

        public static Uri buildTagUri(long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

    }

}
