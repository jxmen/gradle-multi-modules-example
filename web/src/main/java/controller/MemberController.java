package controller;

import com.multimodule.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MemberController {

    public static void main(String[] args) {
        SpringApplication.run(MemberController.class, args);
    }

    @GetMapping("/member")
    public Member getMember() {
        return new Member("member");
    }
}
