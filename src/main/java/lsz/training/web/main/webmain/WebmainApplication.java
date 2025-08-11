package lsz.training.web.main.webmain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("lsz.training.web.main.controller")
public class WebmainApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebmainApplication.class, args);
	}

}
