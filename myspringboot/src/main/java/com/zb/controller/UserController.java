package com.zb.controller;

import com.github.pagehelper.PageInfo;
import com.zb.model.Result;
import com.zb.model.TokenResult;
import com.zb.model.UmsRole;
import com.zb.model.User;
import com.zb.service.UserService;
import com.zb.token.TokenUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhangbin on 2018/8/6.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

//    @RequestMapping("/user")
//    @ResponseBody
//    public User getUserById(int id){
//        User user = userService.selectByPrimaryKey(id);
//        return user;
//    }

    @RequestMapping("/api/admin/info")
    @ResponseBody
    public Result getAdminInfo(HttpServletRequest request){
        String token = request.getAttribute("token").toString();
//        User user = userService.selectByPrimaryKey(id);
        Result result = Result.newInstance();
        result.setData(TokenUtils.getToken(token));
//        return result;

        User token1 = TokenUtils.getToken(token);
        HashMap<String, Object> data = new HashMap<>();
        data.put("username", token1.getUsername());
        data.put("menus", null);
        data.put("icon", token1.getIcon());
        UmsRole role = new UmsRole();
        role.setName("超级管理员");

        List<UmsRole> roleList = new ArrayList<>();
        roleList.add(role);
        List<String> roles = roleList.stream().map(UmsRole::getName).collect(Collectors.toList());
        data.put("roles",roles);

        result.setData(data);

        return result;

    }

//
//    @RequestMapping("/userlist")
//    @RequiresPermissions("user:list")
//    public String getUserList(Model model, PageInfo pageInfo){
//        int pageNum  = (pageInfo.getPageNum() == 0)? 1 : pageInfo.getPageNum();
//        int pageSize  = (pageInfo.getPageSize() == 0)? 10 : pageInfo.getPageSize();
//        PageInfo<User> result = userService.selectAll(pageNum, pageSize);
//        model.addAttribute("users", result.getList());
//        model.addAttribute("pageInfo", result);
//        return "userlist";
//    }
//
//    @RequestMapping("/userdelete")
//    @RequiresPermissions("user:delete")
//    public String userdelete(int id){
//        userService.deleteByPrimaryKey(id);
//        return "redirect:/userlist";
//    }
//
//    @RequestMapping("/useredit")
//    @RequiresPermissions("user:edit")
//    public String useredit(int id, Model model){
//        User user = userService.selectByPrimaryKey(id);
//        model.addAttribute("user", user);
//        return "useredit";
//    }
//
//    @RequestMapping(value = "/userupdateoradd", method = RequestMethod.POST)
//    @RequiresPermissions("user:updateoradd")
//    public String userUpdateOrAdd(User user){
//        if(user.getId() == 0){
//            userService.insertSelective(user);
//        } else {
//            userService.updateByPrimaryKeySelective(user);
//        }
//        return "redirect:/userlist";
//    }

}
