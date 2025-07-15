package org.example.design_stack_over_flow;

import java.util.Date;

public class Answer {
    private final int answerId;
    private final String content;
    private final User author;
    private final Question question;
    private final boolean isAccepted;
    private final Date creationDate;

    public Answer(String content, User author, Question question) {
        this.answerId = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
        this.content = content;
        this.author = author;
        this.question = question;
        this.isAccepted = false;
        this.creationDate = new Date();
    }
}
