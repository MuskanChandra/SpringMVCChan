package abc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Std")
public class StudentData 
{
	@RequestMapping(method = RequestMethod.GET)
	public String getStd(ModelMap model)
	{
		
		model.addAttribute("This is your Turn. Be safe and Careful about everything", 21);
		return "Data";
	}
}
