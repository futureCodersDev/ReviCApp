package RevisionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class RevTopicController {

    //@CrossOrigin(origins = "http://localhost")
    @GetMapping("/topic")
    public RevTopic topic(@RequestParam(value="name", defaultValue="none") String topic_name) {
        return new RevTopic(topic_name);
    }
}
