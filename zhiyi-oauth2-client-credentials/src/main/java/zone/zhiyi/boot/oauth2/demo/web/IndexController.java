package zone.zhiyi.boot.oauth2.demo.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/info")
    public Object getInfo() {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
