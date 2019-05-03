package org.greenwin.VLtopics.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class History {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    private Topic topic;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "history")
    private List<Event> events;
}
