package org.greenwin.VLtopics.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.greenwin.VLtopics.beans.AppUser;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vote {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "topic")
    private Topic topic;

    private int userId;

    @Transient
    private AppUser user;



}
