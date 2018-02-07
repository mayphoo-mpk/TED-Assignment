package mayphoo.mpk.tedAssignment.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import mayphoo.mpk.tedAssignment.data.vo.TalkVO;
import mayphoo.mpk.tedAssignment.network.TedResponse;

/**
 * Created by User on 1/26/2018.
 */

public class GetTalkResponse extends TedResponse {

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("page")
    private String pageNo;

    @SerializedName("ted_talks")
    private List<TalkVO> tedTalks;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPageNo() {
        return pageNo;
    }

    public List<TalkVO> getTedTalks() {
        return tedTalks;
    }

}
