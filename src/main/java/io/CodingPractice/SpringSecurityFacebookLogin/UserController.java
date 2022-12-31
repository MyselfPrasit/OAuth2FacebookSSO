package io.CodingPractice.SpringSecurityFacebookLogin;

import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collections;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user")
    public String user(final Principal principal) {
        Map<String, Object> details = (Map<String, Object>) ((OAuth2Authentication)principal).getUserAuthentication().getDetails();
        return "Hello "+details.get("name")+", Wish You a Happy New Year 2023!!!";
    }

}
