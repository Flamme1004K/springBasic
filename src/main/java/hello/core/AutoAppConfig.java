package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//@ComponentScan이 붙은 클래스를 찾아서 빈으로 등록한다.
@ComponentScan(
        //basePackages = "hello.core",
        //basePackageClasses = AutoAppConfig.class, //Default는 @ComponentScan을 붙인 클래스 패키지 부터이다.
        excludeFilters =
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//AppConfig의 등록을 막는다.
public class AutoAppConfig {
}
