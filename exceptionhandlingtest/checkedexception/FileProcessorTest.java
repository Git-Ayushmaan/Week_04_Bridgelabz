package com.example.exceptionhandling.checkedexception;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class FileProcessorTest {
    private FileProcessor fileProcessor;
    private String testFileName = "testfile.txt";

    @BeforeEach
    void setUp() throws IOException {
        fileProcessor = new FileProcessor();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFileName))) {
            writer.write("Hello, world!\nThis is a test file.");
        }
    }

    @Test
    void testReadFileSuccess() {
        assertDoesNotThrow(() -> fileProcessor.readFile(testFileName));
    }

    @Test
    void testReadFileNotFound() {
        Exception exception = assertThrows(RuntimeException.class, () -> fileProcessor.readFile("nonexistent.txt"));
        assertEquals("File not found", exception.getMessage());
    }
}
