package com.anuradha.fcm.demo.dto;

public class NotificationDTO {
    private long id;
    private String title;
    private String body;
    private String topic;

    public NotificationDTO() {
    }

    public NotificationDTO(long id, String title, String body, String topic) {
        this.setId(id);
        this.setTitle(title);
        this.setBody(body);
        this.setTopic(topic);
    }

    @Override
    public String toString() {
        return "NotificationDTO{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", body='" + getBody() + '\'' +
                ", topic='" + getTopic() + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
