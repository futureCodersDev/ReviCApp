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
}
