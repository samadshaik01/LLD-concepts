package org.example.practice.stack_over_flow;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
public class User {
    final String name;
    final String email;
    List<Question> questions;
    int reputation;


}
