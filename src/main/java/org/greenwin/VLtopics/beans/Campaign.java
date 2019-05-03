package org.greenwin.VLtopics.beans;

import org.greenwin.VLtopics.entities.Topic;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Campaign {

    private int id;

    private Topic topic;

    private int TopicId;

    Set<Vote> votes = new HashSet<>();

    private LocalDate startDate;

    private LocalDate endDate;

    private List<Option> options;
}
