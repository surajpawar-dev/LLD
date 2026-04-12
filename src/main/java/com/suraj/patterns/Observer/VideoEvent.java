package com.suraj.patterns.Observer;

import java.time.LocalDateTime;

public class VideoEvent {
    private String title;
    private LocalDateTime uploadedAt;

    VideoEvent(String title, LocalDateTime uploadedAt) {
        this.title = title;
        this.uploadedAt = uploadedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    @Override
    public String toString() {
        return "VideoEvent{" +
                "title='" + title + '\'' +
                ", uploadedAt=" + uploadedAt +
                '}';
    }
}