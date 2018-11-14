package com.fxp.myaop;

import com.fxp.myaop.test.MyaopApplication;
import com.fxp.myaop.test.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MyaopApplication.class})
public class MyaopApplicationTests {
    @Autowired
    private MyService myService;
	@Test
	public void contextLoads() {
        myService.doSometing();
	}

}
