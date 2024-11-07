package com.db;

public class Board {
    // 튜플 하나의 값을 객체화되어서 데이터를 담아야 한다.
    // 스태틱 안넣은 이유는 각각 다른값을 넣기 위해서이다
    // 데이터베이스랑 연동위해선 커넥션 만들어야 한다
    private int boardId;
    private String title;
    private String contents;
    private String writer;
    private String createdAt;
    private String updatedAt;

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

