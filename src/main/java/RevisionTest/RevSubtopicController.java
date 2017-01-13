package RevisionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class RevSubtopicController {

    //@CrossOrigin(origins = "http://localhost")
    @GetMapping("/subtopic")
    public RevSubtopic subtopic(@RequestParam(value="name", defaultValue="none") String subtopic_name) {
        return new RevSubtopic(subtopic_name);
    }
}
