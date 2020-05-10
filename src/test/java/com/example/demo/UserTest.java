package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    private final User user = new User();

    @Test
    void aTest() {
        assertThat(user.a()).isEqualTo(1);
    }

    @Test
    void bTest() {
        assertThat(user.b()).isEqualTo(2);
    }

    @Test
    void cTest() {
        assertThat(user.c()).isEqualTo(3);
    }
}
