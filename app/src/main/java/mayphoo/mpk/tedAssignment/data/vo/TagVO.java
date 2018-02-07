package mayphoo.mpk.tedAssignment.data.vo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 2/1/2018.
 */

public class TagVO {

    @SerializedName("tag_id")
    private int tagId;

    @SerializedName("tag")
    private String tag;

    @SerializedName("description")
    private String description;
}
