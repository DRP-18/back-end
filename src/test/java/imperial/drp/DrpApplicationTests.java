package imperial.drp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DrpApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void exampleTest() {
		assertThat("Test", is("Test"));
	}
}
