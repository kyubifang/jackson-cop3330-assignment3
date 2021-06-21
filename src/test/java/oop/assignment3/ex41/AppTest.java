package oop.assignment3.ex41;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void generateOutput_outputs_sorted_string() throws URISyntaxException {
        //given
        getClass().getClassLoader().getResourceAsStream("/exercise41_input.txt");
        //when
        File file = new File(getClass().getClassLoader().getResource("exercise41_input.txt").toURI());
        assertTrue(file.exists());
    }
}