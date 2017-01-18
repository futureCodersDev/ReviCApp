package RevisionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class RevVidResourceController {

    @CrossOrigin(origins = "https://futurecodersdev.github.io")
    @GetMapping("/vidResource")
    public RevVidResource videoResource(@RequestParam(value = "resourceID", defaultValue = "none") String resID) {
        return new RevVidResource(resID);
    }

	@CrossOrigin(origins = "https://futurecodersdev.github.io")
    @GetMapping("/vidResult")
    public RevVidResource vidResource(@RequestParam(value="resourceID", defaultValue="none") String resID,
                                      @RequestParam(value="answer", defaultValue="none") String answer)  {

        RevVidResource video = new RevVidResource(resID);
        video.setFeedback(answer);
        return video;
    }
}