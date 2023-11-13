package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class App {


    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);

        System.out.println("Hello! The application has started!");
    }

}