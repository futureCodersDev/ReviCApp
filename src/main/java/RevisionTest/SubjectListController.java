package RevisionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class SubjectListController {

    @CrossOrigin(origins = "https://futurecodersdev.github.io")
    @GetMapping("/subjectList")
    public SubjectList subjectList(@RequestParam(value="user", defaultValue="none") String username) {
        return new SubjectList(username);
    }
}