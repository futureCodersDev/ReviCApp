package RevisionTest;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class SubjectsController {

    private static final String template = "Subjects: %s";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/subjects")
    public Subjects subjects(@RequestParam(value="name", defaultValue="none") String name) {
        return new Subjects(counter.incrementAndGet(),
                String.format(template, name));
    }
}