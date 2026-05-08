package ru.vasilev.study;

import org.springframework.stereotype.Component;

@Component("somePopMusic")
public class PopMusic implements Music{

    @Override
    public String getSong() {
        return "Michael Jackson - What about us";
    }
}
