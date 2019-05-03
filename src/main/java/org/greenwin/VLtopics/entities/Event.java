package org.greenwin.VLtopics.entities;

import lombok.*;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue
    private int id;

    private LocalDate eventDate;

    @ManyToOne
    @JoinColumn(name = "history")
    private History history;

}
