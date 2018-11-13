package com.fxp.myaop.service;

import com.fxp.myaop.function.WithAspect;
import org.springframework.stereotype.Service;

/**
 * Usage:
 * <p>
 * Description:
 * User: fuxinpeng
 * Date: 2018-11-13
 * Time: 4:35 PM
 */
@Service
@WithAspect
public class MyService {
    public void doSometing(){
        System.out.println("my work is so easy!!");
    }
}
