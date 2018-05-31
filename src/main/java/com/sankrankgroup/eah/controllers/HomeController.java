package com.sankrankgroup.eah.controllers;
import com.sankrankgroup.eah.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.sankrankgroup.eah.bean.UserBean;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.sankrankgroup.eah.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

/**
 * @author Shama
 *
 */
@Controller
@EnableWebMvc

public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser(User user) {
        System.out.println("in Save method ");
        //User user = prepareModel(userBean);
        userService.addUser(user);
        return new ModelAndView("redirect:/success.html");
    }
    @RequestMapping("/checklogin")
    

    public String checkLogin(User user) {

        return "welcome";
    }
    @RequestMapping("/success")
    public String welcome() {
        return "success";
    }
    @RequestMapping("/greeting")
    public String homePage() {
        return "greeting";
    }
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
    @RequestMapping("/register")
    public String register(@RequestParam(name = "name", required = false,
            defaultValue = "Shama") String name, Model model) {
        model.addAttribute("serverTime", new Date().getTime());
        return "register";
    }
    private User prepareModel(UserBean userBean){
        User user = new User();
        //user.setUserId(userBean.getUserId());
        user.setUserName(userBean.getUserName());
        user.setFirstName(userBean.getFirstName());
        user.setLastName(userBean.getLastName());
        //user.setEmailAddress(userBean.getEmailAddress());
        user.setPassword(userBean.getPassword());
        return user;
    }
}
