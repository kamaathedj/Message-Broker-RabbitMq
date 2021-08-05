package com.kamaathedj.Messanging.model;

public class Message  {
    int id;
    String from;
    String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
