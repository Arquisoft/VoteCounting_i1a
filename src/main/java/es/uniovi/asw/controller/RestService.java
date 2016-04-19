package es.uniovi.asw.controller;

import es.uniovi.asw.model.VoteCount;
import es.uniovi.asw.persistence.VoteCountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

    @Autowired
    private VoteCountRepository voteCountRepository;

    @RequestMapping("/api/results")
    public Iterable<VoteCount> results() {
        return voteCountRepository.findAll();
    }

}
