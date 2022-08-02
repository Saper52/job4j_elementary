package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String in = "Hi, Bot";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String in = "Bye";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenUnknowBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expexted = "I don't know. Please, ask another question.";
        assertThat(result).isEqualTo(expexted);
    }
}