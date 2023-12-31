package arifunikom.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrintStreamTest {

    @Test
    void console() {
        PrintStream stream = System.out;

        stream.println("Hello World");
        stream.println("ini Print Stream");
    }

    @Test
    void printStream() {

        Path path = Path.of("print.txt");

        try(OutputStream outputStream = Files.newOutputStream(path);
        PrintStream stream = new PrintStream(outputStream)){

            stream.println("Test");
            stream.println("nim 10522014 sedang belajar java io");
            stream.println("ini adalah print stream");

        }catch (IOException e) {
            Assertions.fail(e);
        }

    }

}
