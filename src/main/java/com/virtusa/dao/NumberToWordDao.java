package com.virtusa.dao;

import org.springframework.stereotype.Service;

public interface NumberToWordDao {

    public String numberToWord(int number);

    public String numberToWord(float number);
}
