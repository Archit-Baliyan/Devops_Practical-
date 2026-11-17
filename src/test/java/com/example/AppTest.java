package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    void testAppGreeting() {
        App app = new App();
        assertNotNull(app);
        assertEquals("Hello, World!", app.getGreeting());
    }
}
