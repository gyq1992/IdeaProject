package com.example.gyq.controller;

import com.example.gyq.pojo.Users;
import com.example.gyq.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class UsersController {
    @Autowired
    private IUsersService userService;
    @RequestMapping("ulist")
    public String ulist(Model model){
       List<Users> uList = userService.ulist();
       model.addAttribute("ulist", uList);
        return "ulist";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }


    @RequestMapping("add")
    public String addUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
        Users users = new Users();
        String ucode = request.getParameter("ucode");
        String uname = request.getParameter("uname");
        String password = request.getParameter("password");
        String id = request.getParameter("rid");
        if (ucode != null && uname != null && password != null && id != null) {
            int rid = Integer.parseInt(id);
            users.setUcode(ucode);
            users.setUname(uname);
            users.setPassword(password);
            users.setRid(rid);
            users.setCreateDate(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
            users.setCreateBy("gyq");
            userService.addUser(users);
            request.getRequestDispatcher("ulist").forward(request, response);
        }
        return "add";

    }
    @RequestMapping("hello")
    public String hello(){
        return "helloworld";
    }

    public IUsersService getUserService() {
        return userService;
    }

    public void setUserService(IUsersService userService) {
        this.userService = userService;
    }
}
