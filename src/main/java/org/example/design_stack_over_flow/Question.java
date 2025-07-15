package org.example.design_stack_over_flow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Commentable,Votable{
    private final int questionId;
    private final String title;
    private final String content;
    private final User author;
    private final Date creationDate;
    private final List<Answer> answers;
    private final List<Tag> tags;
    private final List<Comment> comments;
    private Answer acceptedAnswer;

    public Question(String title, String content, User author, List<Answer> answers, List<Tag> tags, List<Comment> comments) {
        this.questionId = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationDate = new Date();
        this.answers = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public void addAnswer(User author, Question question, Answer answer) {
    }

    @Override
    public void addComment(User user, Comment comment) {
    }

    @Override
    public List<Comment> getComments() {
        return List.of();
    }

    @Override
    public void Vote(User voter, VoteType type) {

    }

    @Override
    public int getVoteCount() {
        return 0;
    }
}
