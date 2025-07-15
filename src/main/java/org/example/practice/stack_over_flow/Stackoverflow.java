package org.example.practice.stack_over_flow;

import org.example.practice.stack_over_flow.comment.Comment;

import java.util.List;

public class Stackoverflow {

    User createUser(String name, String email) {
        return new User(name,email);
    }

    Question createQuestion(User user, String title, String content, List<String> tags) {
        return new Question(user,title,content,tags);
    }

    Answer answerQuestion(User user, Question question, String content) {
        return new Answer(user,question,content);
    }

    Comment commentQuestion(User user, Question question, String content) {
        return null;
    }

    Comment commentAnswer(User user, Answer answer, String content) {
        return null;
    }

}
