package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceTest () {
        AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(TestConfig.class);

        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA A사용자가 10000원 주문
        int price = statefulService1.order("userA", 10000);

        //ThreadB B사용자가 20000원 주문
        int price2 = statefulService2.order("userA", 20000);

        //ThreadA : 사용자A가 주문 금액을 조회
//        int price = statefulService1.getPrice();
        System.out.println("price = " + price);

        assertThat(price2).isEqualTo(20000);

    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}