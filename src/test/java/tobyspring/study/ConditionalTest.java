package tobyspring.study;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class ConditionalTest {
    @Test
    void conditional() {
    }

    @Configuration
    static class Config1 {
        @Bean
        MyBean myBean() {
            return new MyBean();
        }
    }

    @Configuration
    static class Config2 {
        @Bean
        MyBean myBean() {
            return new MyBean();
        }
    }


    static class MyBean {
    }
}
