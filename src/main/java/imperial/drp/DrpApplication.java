package imperial.drp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;

@SpringBootApplication
//@EnableJpaRepositories(bootstrapMode = BootstrapMode.DEFAULT)
public class DrpApplication {

  private static final Logger log = LoggerFactory.getLogger(DrpApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(DrpApplication.class);
  }
  @Bean
  public CommandLineRunner demo(HomeworkRepository repository) {
    return (args) -> {
      // save a few customers
      repository.save(new Homework("Jayme", "Mika", "Maths question 1", "31/5/2021"));
      repository.save(new Homework("Jayme", "Mika", "Maths question 2", "31/5/2021"));
      repository.save(new Homework("Jayme", "Mika", "Maths question 3", "31/5/2021"));
      repository.save(new Homework("Jayme", "Mika", "Maths question 4", "1/6/2021"));
      repository.save(new Homework("Jayme", "Mika", "Maths question 5", "1/6/2021"));
      repository.save(new Homework("Jayme", "Henry", "Further maths question 1", "1/6/2021"));
    };
  }

}
