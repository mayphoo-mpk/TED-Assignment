package mayphoo.mpk.tedAssignment.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 2/1/2018.
 */

public class TedDBHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "ted.db";
    private static final int DB_VERSION = 1;

    private static final String SQL_CREATE_TALK = "CREATE TABLE " + TedContract.TalkEntry.TABLE_NAME + " (" +
            TedContract.TalkEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TedContract.TalkEntry.COLUMN_TALK_ID + " INTEGER, " +
            TedContract.TalkEntry.COLUMN_TITLE + " TEXT, " +
            TedContract.TalkEntry.COLUMN_SPEAKER_ID + " INTEGER, " +
            TedContract.TalkEntry.COLUMN_IMAGE_URL + " TEXT, " +
            TedContract.TalkEntry.COLUMN_DURATION_IN_SEC + " INTEGER, " +
            TedContract.TalkEntry.COLUMN_DESCRIPTION + " TEXT, " +

            " UNIQUE (" + TedContract.TalkEntry.COLUMN_TALK_ID + ") ON CONFLICT REPLACE" +
            ");";

    private static final String SQL_CREATE_SPEAKER = "CREATE TABLE " + TedContract.SpeakerEntry.TABLE_NAME + " (" +
            TedContract.SpeakerEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TedContract.SpeakerEntry.COLUMN_SPEAKER_ID + " INTEGER, " +
            TedContract.SpeakerEntry.COLUMN_NAME + " TEXT, " +

            " UNIQUE (" + TedContract.SpeakerEntry.COLUMN_SPEAKER_ID + ") ON CONFLICT REPLACE" +
            ");";

    private static final String SQL_CREATE_TAG = "CREATE TABLE " + TedContract.TagEntry.TABLE_NAME + " (" +
            TedContract.TagEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            TedContract.TagEntry.COLUMN_TAG_ID + " INTEGER, " +
            TedContract.TagEntry.COLUMN_TAG + " TEXT, " +
            TedContract.TagEntry.COLUMN_DESCRIPTION + " TEXT, " +
            TedContract.TagEntry.COLUMN_TALK_ID + " INTEGER, " +

            " UNIQUE (" + TedContract.TagEntry.COLUMN_TAG_ID + ") ON CONFLICT REPLACE" +
            ");";

    public TedDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_SPEAKER);
        db.execSQL(SQL_CREATE_TALK);
        db.execSQL(SQL_CREATE_TAG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TedContract.TagEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TedContract.TalkEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + TedContract.SpeakerEntry.TABLE_NAME);

        onCreate(db);
    }
}
