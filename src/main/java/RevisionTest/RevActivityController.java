package RevisionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class RevActivityController {

    //@CrossOrigin(origins = "http://localhost")
    @GetMapping("/activity")
    public RevActivity activity(@RequestParam(value="name", defaultValue="none") String activity_name) {
       return new RevActivity(activity_name);
    }

    @GetMapping("/vidResource")
    public RevVidResource videoResource(@RequestParam(value="resourceID", defaultValue="none") String resID) {
        return new RevVidResource(resID);
    }

    @GetMapping("/ppqResource")
    public RevPpqResource ppqResource(@RequestParam(value="resourceID", defaultValue="none") String resID) {
        return new RevPpqResource(resID);
    }

    @GetMapping("/vidResult")
    public RevVidResource vidResource(@RequestParam(value="resource", defaultValue="none") RevVidResource video)  {
        if((video.getResID() == "none")||(video.getAnswer() == "")){
            video.setFeedback("Insufficient information given for relevant feedback.");
            video.setFinalResult(0);
            return video;
        }
        else{
            video.processResults();
            return video;
        }
    }

    @GetMapping("/ppqResult")
    public RevPpqResource ppqResource(@RequestParam(value="resource", defaultValue="none") RevPpqResource ppq)  {
        if((ppq.getResID() == "none")||(ppq.getAnswer() == "")){
            ppq.setFeedback("Insufficient information given for relevant feedback.");
            ppq.setFinalResult(0);
            return ppq;
        }
        else{
            ppq.processResults();
            return ppq;
        }
    }
}
