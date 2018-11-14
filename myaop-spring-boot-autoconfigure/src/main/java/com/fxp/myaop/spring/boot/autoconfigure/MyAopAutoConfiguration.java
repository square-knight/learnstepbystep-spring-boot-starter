package com.fxp.myaop.spring.boot.autoconfigure;

import com.fxp.myaop.function.AopCreater;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Usage:
 * <p>
 * Description:
 * User: fuxinpeng
 * Date: 2018-11-13
 * Time: 7:11 PM
 */
@Configuration
@ConditionalOnClass({Enhancer.class})//当依赖中存在Enhancer时，这个配置类才生效
@EnableConfigurationProperties(MyAopProperties.class)//使绑定的外部配置生效
public class MyAopAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
        //在没有这个bean时才注入，比如，你想要对AopCreater里的行为做修改，你可以自己注入一个AopCreater，这样这个bean就不会被注入
    AopCreater aopCreater(){
        AopCreater aopCreater = new AopCreater();
        return aopCreater;
    }
}
