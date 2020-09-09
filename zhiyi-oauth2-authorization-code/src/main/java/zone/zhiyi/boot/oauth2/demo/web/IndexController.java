package zone.zhiyi.boot.oauth2.demo.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/info")
    @ResponseBody
    public Object getInfo() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
