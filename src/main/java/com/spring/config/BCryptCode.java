package com.spring.config;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by t.daun on 7/17/2017.
 */
public class BCryptCode {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("m123"));
    }
}
