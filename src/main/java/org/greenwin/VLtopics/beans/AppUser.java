package org.greenwin.VLtopics.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    private int Id;

    private String username;

    private String password;

    //@ManyToMany
    //private Set<AppRole> roles = new HashSet<>();

    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
