package main.com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserController
{
  @RequestMapping("/display")
  public ModelAndView view(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
  {
    ModelAndView modelAndView = new ModelAndView();
    String name = httpServletRequest.getParameter("username");
    String password = httpServletRequest.getParameter("password");
    User user = new User();
    user.setUserName(name);
    user.setUserPassword(password);
    System.out.println(user.getUserName()+"  "+user.getUserPassword());
    modelAndView.setViewName("display");
    modelAndView.addObject("result",name);
    return modelAndView;
  }
}
