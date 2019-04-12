package org.greenwin.VLtopics.repositories;

import org.greenwin.VLtopics.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {

    Topic getById(int id);
}
