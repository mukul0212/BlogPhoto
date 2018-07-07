package com.example.mukul.blogphoto;

import java.util.Date;

public class Comments {

    private String message, user_id, user_name, image_url;
    private Date timestamp;

    public Comments(){

    }

    public Comments(String message, String user_id, Date timestamp, String user_name, String image_url) {
        this.message = message;
        this.user_id = user_id;
        this.timestamp = timestamp;
        this.user_name = user_name;
        this.image_url= image_url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
