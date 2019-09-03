package com.virtusa.services;

import com.virtusa.dao.NumberToWordDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NumberToWordService {

    @Autowired
    private NumberToWordDao numberToWordDao;

    public String numberToWord(int number) {
        return numberToWordDao.numberToWord(number);
    }

    public String numberToWord(float number) {
        return numberToWordDao.numberToWord(number);
    }

}
