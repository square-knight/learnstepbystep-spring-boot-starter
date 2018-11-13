import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Usage:
 * <p>
 * Description:
 * User: fuxinpeng
 * Date: 2018-11-13
 * Time: 7:13 PM
 */
@ConfigurationProperties(prefix = MyAopProperties.PREFIX)
public class MyAopProperties {
    public static final String PREFIX = "myaop";
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
