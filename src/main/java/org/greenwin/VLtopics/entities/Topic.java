package org.greenwin.VLtopics.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Topic {

    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String summary;
    private Date dateOfCreation;
    
    private int authorId;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "topic")
    private List<Vote> votes;

}
