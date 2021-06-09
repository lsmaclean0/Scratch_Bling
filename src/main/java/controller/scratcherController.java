package controller;

import com.scratch.Scratch_Bling.ScratchBlingApplication;
import model.scratchers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import repository.ScratcherRepo;

@RestController
public class scratcherController {

    private static final Logger logger = LoggerFactory.getLogger(ScratchBlingApplication.class);

    @Autowired
    private ScratcherRepo scratcherRepo;

    @GetMapping("/")
    public String hello() {
        logger.info("request made");
        return "Hello";
    }

    @GetMapping("/scratchers")
    public Page<scratchers> getScratchers(Pageable pageable) {
        return scratcherRepo.findAll(pageable);
    }

    @PostMapping("/addScratcher")
    public String addScratcher(@RequestBody scratchers scratcher) {
        if(scratcher != null) {
            scratcherRepo.insert(scratcher);
            return "Added bling Scratcher";
        } else {
            return "Request body empty. please try again with request body";
        }

    }

    @PutMapping("/scratchers/{name}")
    public String updateScratcher(@RequestBody scratchers scratcher) {
        if(scratcher != null) {
            scratcherRepo.update(scratcher);
            return "Added bling Scratcher";
        } else {
            return "Request body empty. please try again with request body";
        }
    }

    @DeleteMapping("/scratchers")
    public String deleteScratcher(scratchers scratcher) {
        if(scratcher != null) {
            scratcherRepo.update(scratcher);
            return "Added bling Scratcher";
        } else {
            return "Request body empty. please try again with request body";
        }
    }
}
