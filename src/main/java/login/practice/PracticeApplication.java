package login.practice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(PracticeService practiceService) {
		return args -> {
			practiceService.savePractice(); // 서비스 메서드 호출
			System.out.println("Practice saved!");
		};
	}
}
