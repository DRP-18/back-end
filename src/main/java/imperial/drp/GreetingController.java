package imperial.drp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
  @Autowired
  private HomeworkRepository userRepository;

  @RequestMapping("/homework/{name}")
  public String greeting(@PathVariable(value="name") String name, Model model) {
    model.addAttribute("name", name);
    List<Homework> homeworks = userRepository.findByTutee(name);
    model.addAttribute("homeworks", homeworks);
    return "homework";
  }

}