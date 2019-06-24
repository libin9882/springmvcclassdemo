package cn.smbms.controller;


import cn.smbms.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.*;

@Controller
@RequestMapping("/userController")
public class UserController {

List<User> list =null;
    public  UserController(){
        list=new ArrayList<>();
        User user1=new User();
        user1.setId(1);
        user1.setUserCode("admin");
        user1.setAddress("安宁区政府");



        User user2=new User();
        user2.setId(2);
        user2.setUserCode("admin");
        user2.setAddress("安宁教育港");
        list.add(user1);
        list.add(user2);
    }






    //http://localhost:8088/userController/toLogin.jsp
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("/login")
    public String login(@RequestParam(value="userName",required=false) String userName ,
                        @RequestParam(value="userPassword",required=false) String userPassword
                        ,Model model){

            if(userName.equals("admin")&&userPassword.equals("admin")){
                model.addAttribute("list",list);
                return  "index";
            }
            return "login";


    }
}
