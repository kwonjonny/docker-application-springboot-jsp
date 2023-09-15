package docker.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("spring/")
public class DockerApplicationController {

    @GetMapping("docker")
    public String dockerApplication() {
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");
        log.info("코드 변경 컨트롤러");

        return "spring/docker";
    }
}
