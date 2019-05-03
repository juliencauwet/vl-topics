package org.greenwin.VLtopics.controllers;

import org.greenwin.VLtopics.entities.Topic;
import org.greenwin.VLtopics.proxies.UserProxy;
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

    @Autowired
    private UserProxy proxy;

    @GetMapping("/")
    public List<Topic> getTopics(){
        List<Topic> topics = topicRepository.findAll();
        for (Topic topic : topics){

        }
        return topics;
    }

    @GetMapping("/id/{id}")
    public Topic getTopicById(@PathVariable("id") int id){
        return topicRepository.getById(id);
    }

    @PostMapping("/")
    public Topic saveTopic(@RequestBody Topic topic){
        return topicRepository.save(topic);
    }

    @GetMapping("/{keyword}")
    public List<Topic> getTopicsByKeyWord(@PathVariable("keyword") String keyword){
        return topicRepository.getTopicsBySummaryContainingIgnoreCase(keyword);
    }
}
