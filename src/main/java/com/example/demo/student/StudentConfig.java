package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
//import java.time.Month;
import java.time.Month;
import java.util.List;

import static java.time.Month.JUNE;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
          StudentRepository repository){
        return args -> {
           Student hend= new Student(
                    "Hend",
                    "hend.okasha408@gmail.com",
                    LocalDate.of(2003, JUNE,20)
           );

            Student hagar= new Student(
                    "Hagar",
                    "hagar@gmail.com",
                    LocalDate.of(2004, JUNE,20)
            );
            repository.saveAll(
                   List.of(hend,hagar)
            );
        };
    }
}
