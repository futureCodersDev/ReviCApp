package RevisionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class RevPpqResourceController {
	@CrossOrigin(origins = "https://futurecodersdev.github.io")
    @GetMapping("/ppqResource")
    public RevPpqResource ppqResource(@RequestParam(value="resourceID", defaultValue="none") String resID) {
        return new RevPpqResource(resID);
    }

	@CrossOrigin(origins = "https://futurecodersdev.github.io")
    @GetMapping("/ppqResult")
    public RevPpqResource ppqResource(@RequestParam(value="resourceID", defaultValue="none") String resID,
                                      @RequestParam(value="answer", defaultValue="none") String answer)  {
        RevPpqResource ppq = new RevPpqResource(resID);
        ppq.setFeedback(answer);
        return ppq;
    }
}