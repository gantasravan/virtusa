package com.virtusa.validations;

import com.virtusa.constants.ConstantEnum;
import com.virtusa.rules.ValidationRules;
import com.virtusa.services.NumberToWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

@Service
public class NumberToWordValidation {

    @Autowired
    private ValidationRules validationRules;


    public void numberToWordValidation() {
        System.out.print("Enter the number: ");
        boolean done = false;
        try {
            while (!done) {
                int number = 0;
                float fnumber = 0;
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    String input = scanner.nextLine();
                    number = validationRules.checkInt(input);
                    String result = validationRules.numberToWordValidation(number);
                    System.out.print("Number in words: " + result);
                    System.out.printf("%n");
                } else if (scanner.hasNextFloat()) {
                    fnumber = scanner.nextFloat();
                    String result = validationRules.numberToWordValidation(fnumber);
                    System.out.print("Number in words: " + result);
                    System.out.printf("%n");
                } else {
                    System.out.println("input is not an valid number");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("input is not an valid number");
            // Here catch NumberFormatException
            // So input is not a int.
        }
    }


}
