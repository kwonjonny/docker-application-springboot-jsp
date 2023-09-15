package docker.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("spring/")
public class DockerApplicationController {

    @GetMapping("docker")
    public String dockerApplication() {
        System.out.println("코드");
        System.out.println("젠킨스 코드 변경 커밋!!!!");
        System.out.println("코드");
        return "spring/docker";
    }
}
