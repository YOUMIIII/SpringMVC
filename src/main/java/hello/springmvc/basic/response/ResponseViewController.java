package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){
        model.addAttribute("data", "hello!");
        return "response/hello"; //@Controller이면서 String반환이면 리턴값이 물리적경로가됨
    }

    //3번 방식은 권장하진 않는 방법. void로 만들고 @Controller를 사용할 경우,
    //요청 URL을 참고해서 논리뷰로 알아서 사용. 하지만 명시성이 떨어지고, 딱 맞는 경우도 많지않음
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model){
        model.addAttribute("data", "hello!");
    }
}
