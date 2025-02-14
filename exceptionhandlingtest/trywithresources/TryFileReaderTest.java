package com.example.exceptionhandling.trywithresources;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

class TryFileReaderTest {
    @Test
    void testReadFirstLineSuccess() throws IOException {
        String testFileName = "testfile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(testFileName))) {
            writer.write("Hello, world!\nThis is a test file.");
        }
        assertEquals("Hello, world!", TryFileReader.readFirstLine(testFileName));
    }

    @Test
    void testReadFirstLineFileNotFound() {
        Exception exception = assertThrows(IOException.class, () -> TryFileReader.readFirstLine("nonexistent.txt"));
        assertNotNull(exception.getMessage());
    }
}