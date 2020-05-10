package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FailTest {
    @Test
    void name() {
        assertThat(1).isEqualTo(2);
    }
}
