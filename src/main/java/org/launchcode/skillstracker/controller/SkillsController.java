package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping("/")
    @ResponseBody
    public String display(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker</h1>" +
                "<br>" +
                "<h3> We have a few skills that we would like to learn. Here is the list " +
                "<br>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    @ResponseBody
    public String forminfo(){
    return "<html>" +
            "<body>" +
            "<form action = '/submit' method='POST'>" +
            "<label for='name'>Name</label>" +
            "<br>" +
            "<input type = 'text' name= 'name' />" +
            "<br>" +
            "<label for ='languages'> Choose a language</label>" +
            "<select name= 'languages' id = 'l1'>" +
            "<option value = 'Java' id = 'java'>Java</option>" +
            "<option value = 'JavaScript' id ='javascript'>JavaScript</option>" +
            "<option value = 'Python' id ='python'>Python</option>" +
            "</select>" +
            "<br>" +
            "<label for ='seclanguages'> Choose a language</label>" +
            "<select name= 'seclanguages' id = 'l2'/>" +
            "<option value = 'Java' id = 'java'>Java</option>" +
            "<option value = 'JavaScript' id='javascript'>JavaScript</option>" +
            "<option value = 'Python' id='python'>Python</option>" +
            "</select>" +
            "<br>" +
            "<label for ='thirdlanguages'> Choose a language</label>" +
            "<select name= 'thirdlanguages' id = 'l3'>" +
            "<option value = 'Java' id ='java'>Java</option>" +
            "<option value = 'JavaScript' id = 'javascript'>JavaScript</option>" +
            "<option value = 'Python' id = 'python'>Python</option>" +
            "</select>" +
            "<br>" +
            "<button name = 'submit'>Submit</button>" +
            "</form>" +
            "</body>" +
            "</html>";


    }
    @PostMapping("/submit")
    @ResponseBody
    public String submitForm(@RequestParam String name,String languages, String seclanguages,String thirdlanguages){
        return "<Html>" +
                "<body>" +
                "<h3>" +name +"</h3>" +
                "<br>" +
                "<table>" +
                "<tr> <th> choice1 </th>" +
                "<th> choice2 </th>" +
                "<th> choice3 </th>" +
                "</tr>" +
                "<tr> <td> "+languages +"</td>" +
                "<td> "+ seclanguages +"</td>" +
                "<td>"+ thirdlanguages+"</td>" +
                "</tr>" +
                "</table>" +
                "</body>" +
                "</html>";

    }
}


