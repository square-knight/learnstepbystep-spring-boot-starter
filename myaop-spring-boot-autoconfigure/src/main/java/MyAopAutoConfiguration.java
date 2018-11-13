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
@ConditionalOnClass({Enhancer.class})
@EnableConfigurationProperties(MyAopProperties.class)
public class MyAopAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    AopCreater aopCreater(){
        AopCreater aopCreater = new AopCreater();
        return aopCreater;
    }
}
