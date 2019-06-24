package cn.smbms.controller;

import cn.smbms.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/userController")
public class UserController {

    List<User> list = new ArrayList<>();
    public UserController(){
         list = new ArrayList<>();
         User user1 = new User();
         user1.setId(1);
         user1.setUserCode("admin1");
         user1.setAddress("登陆了1");

         User user2 = new User();
         user2.setId(2);
         user2.setUserCode("admin2");
         user2.setAddress("登陆了2");

         User user3 = new User();
         user3.setId(3);
         user3.setUserCode("admin3");
         user3.setAddress("登陆了3");

         list.add(user1);
         list.add(user2);
         list.add(user3);
    }

    @RequestMapping("/toUserAddPage")
    public String toUserAddPage(){
        return "user_add";
    }

    @RequestMapping("/findUserList")
    public String findUserList(Model model){
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("deleteUserById")
    public String deleteUserById(String id){

        return "redirect:findUserList";
    }

    @RequestMapping("/doAddUser")
    public String doAddUser(User user){
        list.add(user);
        return "redirect:findUserList";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


    @RequestMapping("/Login")
        public String Login(@RequestParam(value = "userName",required = false)String userName,
                            @RequestParam(value = "userPassword",required = false)String userPassword,
                            Model model){
            if (userName.equals("admin")&&userPassword.equals("123456")){
                model.addAttribute("list",list);

                return "index";
            }
            return "login";

        }
}
