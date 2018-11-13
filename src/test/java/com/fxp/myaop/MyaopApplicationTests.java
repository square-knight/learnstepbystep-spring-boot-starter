package com.fxp.myaop;

import com.fxp.myaop.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyaopApplicationTests {
    @Autowired
    private MyService myService;
	@Test
	public void contextLoads() {
        myService.doSometing();
	}

}
