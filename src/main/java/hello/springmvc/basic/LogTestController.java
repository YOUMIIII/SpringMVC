package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j 롬복이 제공하는 이 @를 쓰면 1번 코드 생략가능함.
@RestController //@Controller는 뷰가 리턴되야하는데 @RestController는 리턴하는 값이 문자여도 반환됨
public class LogTestController {
    //1번 코드
    private final Logger log = LoggerFactory.getLogger(getClass());//getClass == 현재 클래스

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";
        log.info(" info log=" + name); //아래랑 같은뜻이지만 info말고 다른 식은 이렇게 쓰면 안됨.(쓸데없는 연산을 하게되기때문)
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);


        return "ok";
    }
}
