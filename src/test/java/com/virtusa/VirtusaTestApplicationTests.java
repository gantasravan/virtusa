package com.virtusa;

import com.virtusa.rules.ValidationRules;
import com.virtusa.services.NumberToWordService;
import com.virtusa.validations.NumberToWordValidation;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VirtusaTestApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private NumberToWordService numberToWordService;

    @Test
    public void testNumberZero() {
        String result = numberToWordService.numberToWord(0);
        //Verify request succeed
        Assert.assertEquals("zero", result);
    }

    @Test
    public void testNumberOne() {
        String result = numberToWordService.numberToWord(1);
        //Verify request succeed
        Assert.assertEquals("one", result);
    }
}
