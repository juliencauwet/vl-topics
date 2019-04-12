package org.greenwin.VLtopics.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

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

}
