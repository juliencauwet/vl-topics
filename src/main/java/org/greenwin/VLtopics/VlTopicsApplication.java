package org.greenwin.VLtopics;

import org.greenwin.VLtopics.entities.Topic;
import org.greenwin.VLtopics.repositories.TopicRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("org.greenwin")
@EnableDiscoveryClient
public class VlTopicsApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TopicRepository topicRepository;

	public static void main(String[] args) {
		SpringApplication.run(VlTopicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Topic topic1 = new Topic();
		topic1.setTitle("Brexit");
		topic1.setSummary("Le Royaume-Uni sort de l'Europe!");
		topic1.setAuthorId(1);

		Topic topic2 = new Topic();
		topic2.setTitle("Gilets jaunes");
		topic2.setSummary("une France en colère");
		topic2.setAuthorId(1);

		topicRepository.save(topic1);
		topicRepository.save(topic2);

	}
}

