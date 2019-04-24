package org.greenwin.VLtopics.repositories;

import org.greenwin.VLtopics.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Integer> {
    Vote getById(int id);

    List<Vote> findAllByUserId(int id);
}
