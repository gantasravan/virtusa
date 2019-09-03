package com.virtusa.rules;

import com.virtusa.constants.ConstantEnum;
import com.virtusa.services.NumberToWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Service
public class ValidationRules {

    @Autowired
    private NumberToWordService numberToWordService;

    public int checkInt(String input) {
        int number = 0;
        try {
            NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
            number = nf.parse(input).intValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return number;
    }

    /**
     * polymorphism implemented
     *
     * @param number
     * @return
     */
    public String numberToWordValidation(int number) {

        String result = null;
//        System.out.println("Please type a number(max upto 9 digits)");
        try {
            // read the number

            if (number == 0) {
//                System.out.print("Number in words: Zero");
                result = ConstantEnum.ZERO.getText();
            } else if (number > Integer.MAX_VALUE) {
//                System.out.println("Please enter a valid number");
                result = "Please enter a valid number";
            } else {
//                System.out.print("Number in words: " + numberToWord(number));
                result = numberToWordService.numberToWord(number);
//                result = convert(number);
            }
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
        return result;
    }

    /**
     * polymorphism implemeted..
     *
     * @param number
     * @return
     */
    public String numberToWordValidation(float number) {

        String result = null;
//        System.out.println("Please type a number(max upto 9 digits)");
        try {
            result = numberToWordService.numberToWord(number);
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
        return result;
    }
}
