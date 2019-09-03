package com.virtusa;

import com.virtusa.services.NumberToWordService;
import com.virtusa.validations.NumberToWordValidation;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class VirtusaTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VirtusaTestApplication.class, args);
        NumberToWordValidation numberToWordValidation = context.getBean(NumberToWordValidation.class);
        numberToWordValidation.numberToWordValidation();
    }


}
