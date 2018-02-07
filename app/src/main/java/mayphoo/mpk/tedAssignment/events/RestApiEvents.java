package mayphoo.mpk.tedAssignment.events;

import android.content.Context;

import java.util.List;

import mayphoo.mpk.tedAssignment.data.vo.TalkVO;

/**
 * Created by User on 2/1/2018.
 */

public class RestApiEvents {

    public static class ErrorInvokingAPIEvent {
        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    public static class TalkDataLoadedEvent {
        private String loadedPageIndex;
        private List<TalkVO> loadTalks;
        private Context context;

        public TalkDataLoadedEvent(String loadedPageIndex, List<TalkVO> loadTalks, Context context) {
            this.loadedPageIndex = loadedPageIndex;
            this.loadTalks = loadTalks;
            this.context = context;
        }

        public String getLoadedPageIndex() {
            return loadedPageIndex;
        }

        public List<TalkVO> getLoadTalks() {
            return loadTalks;
        }

        public Context getContext() {
            return context;
        }
    }

}
