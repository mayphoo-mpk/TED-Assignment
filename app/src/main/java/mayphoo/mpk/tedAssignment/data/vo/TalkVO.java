package mayphoo.mpk.tedAssignment.data.vo;

import android.content.ContentValues;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 1/26/2018.
 */

public class TalkVO {

    @SerializedName("talk_id")
    private int talkId;

    @SerializedName("title")
    private String title;

    @SerializedName("speaker")
    private SpeakerVO speaker;

    @SerializedName("imageUrl")
    private String imageUrl;

    @SerializedName("durationInSec")
    private int durationInSec;

    @SerializedName("description")
    private String description;

    @SerializedName("tag")
    private List<TagVO> tags;

    public int getTalkId() {
        return talkId;
    }

    public String getTitle() {
        return title;
    }

    public SpeakerVO getSpeaker() {
        return speaker;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getDurationInSec() {
        return durationInSec;
    }

    public String getDescription() {
        return description;
    }

    public List<TagVO> getTags() {
        return tags;
    }

    /*public ContentValues parseToContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put();
    }*/

}
