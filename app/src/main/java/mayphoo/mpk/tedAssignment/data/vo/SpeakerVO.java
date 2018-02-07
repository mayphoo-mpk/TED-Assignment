package mayphoo.mpk.tedAssignment.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 2/1/2018.
 */

public class SpeakerVO {

    @SerializedName("speaker_id")
    private int speakerId;

    @SerializedName("name")
    private String name;

    public void setSpeakerId(int speakerId) {
        this.speakerId = speakerId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
