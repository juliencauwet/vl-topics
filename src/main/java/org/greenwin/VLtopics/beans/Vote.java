package org.greenwin.VLtopics.beans;

import java.time.LocalDate;

public class Vote {

    private int id;

    private int userId;

    private AppUser user;

    private LocalDate date;

    private  Campaign campaign;

    private Option option;
}
