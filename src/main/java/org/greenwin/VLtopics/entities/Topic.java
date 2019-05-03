package org.greenwin.VLtopics.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
public class Topic {

    @Id
    @GeneratedValue
    private int id;

    private String title;
    private String summary;
    private Date dateOfCreation;

    @OneToOne(mappedBy = "topic")
    private History history;
    
    private int authorId;

}
