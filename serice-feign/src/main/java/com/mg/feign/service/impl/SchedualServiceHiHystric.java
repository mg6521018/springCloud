package com.mg.feign.service.impl;

import com.mg.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * Created by magang on 2017/10/31.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
