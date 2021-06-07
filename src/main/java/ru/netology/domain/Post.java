package ru.netology.domain;

import java.sql.Time;
import java.util.Date;

public class Post {

    private int id;
    private Owner owner;
    private Date date;
    private Time time;
    private String text;
    private String imgUrl;
    private Like like;
    private Message message;
    private Share share;
    private View view;

}
