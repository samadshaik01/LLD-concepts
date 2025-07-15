package org.example.design_stack_over_flow;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final int userId;
    private final String userName;
    private final String email;
    private final List<Question> questions;
    private final List<Answer> answers;
    private final List<Comment> comments;
    private int reputation;
    private static final int QUESTION_REPUTATION = 5;
    private static final int ANSWER_REPUTATION = 10;
    private static final int COMMENT_REPUTATION = 2;


    public User(String userName, String email) {
        this.userId = (int) (System.currentTimeMillis() % Integer.MAX_VALUE);;
        this.email = email;
        this.userName = userName;
        this.questions = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

}
