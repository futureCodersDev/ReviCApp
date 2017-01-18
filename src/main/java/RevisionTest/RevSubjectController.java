package RevisionTest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class RevSubjectController {

    private static final String template = "Subject: %s";

    @CrossOrigin(origins = "https://futurecodersdev.github.io")
    @GetMapping("/subject")
    public RevSubject subject(@RequestParam(value="name", defaultValue="none") String name) {
        return new RevSubject(name);
    }
}