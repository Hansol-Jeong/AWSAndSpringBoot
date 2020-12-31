package com.example.book.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class HelloResponseDtoTest {
    @Test
    public void lombok_test() {
        String name = "hansol";
        int amount = 25;

        HelloResponseDto dto = new HelloResponseDto(name, amount);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}