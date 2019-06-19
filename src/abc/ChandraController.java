package abc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/c")
public class ChandraController 
{
	@RequestMapping(method = RequestMethod.GET)
  public String getc(ModelMap model)
  {
	  model.addAttribute("x",21);
	  
	  
	  return "d";
	  
  }
}
