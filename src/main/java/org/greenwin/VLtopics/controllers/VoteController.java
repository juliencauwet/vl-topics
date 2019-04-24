package org.greenwin.VLvotes.controllers;

import org.greenwin.VLtopics.entities.Vote;
import org.greenwin.VLtopics.repositories.VoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/votes")
public class VoteController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private VoteRepository voteRepository;

    @GetMapping("/")
    public List<Vote> getVotes(){
        return voteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vote getVoteById(@PathVariable("id") int id){
        return voteRepository.getById(id);
    }

    @PostMapping("/")
    public Vote saveVote(@RequestBody Vote vote){
        return voteRepository.save(vote);
    }

}
