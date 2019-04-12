package org.greenwin.VLtopics.controllers;

import org.greenwin.VLtopics.entities.Topic;
import org.greenwin.VLtopics.repositories.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping("/")
    public List<Topic> getTopics(){
        return topicRepository.findAll();
    }

    @GetMapping("/{id}")
    public Topic getTopicById(@PathVariable("id") int id){
        return topicRepository.getById(id);
    }

    @PostMapping("/")
    public Topic saveTopic(@RequestBody Topic topic){
        return topicRepository.save(topic);
    }
}
