package com.duofx.controller;

import com.duofx.model.Person;
import com.duofx.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by duofx on 2020/6/8.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/selectPerson")
    public void selectPerson(HttpServletRequest request, HttpServletResponse response) throws IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        long personId = Long.parseLong(request.getParameter("id"));
        Person person = personService.findPersonById(personId);

//        ObjectMapper mapper = new ObjectMapper();
//
//        response.getWriter().write(mapper.writeValueAsString(person));
        response.getWriter().close();
    }

    @RequestMapping("/create")
    public String test(HttpServletResponse response) {
        response.setCharacterEncoding("utf-8");
        return "springmvc创建成功";
    }


}