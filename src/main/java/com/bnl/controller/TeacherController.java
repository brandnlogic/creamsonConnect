package com.bnl.controller;


import com.bnl.common.to.TeacherTO;

import com.bnl.service.TeacherService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/teachers", method = RequestMethod.POST)
    public ResponseEntity<String> saveTeachersData(@RequestBody TeacherTO teacher)
    {
        JSONObject responseJson = new JSONObject();
        if(teacherService.saveTeacherData(teacher))
        {
            responseJson.put("STATUS", "SUCCESS");
            return new ResponseEntity(responseJson.toString(), HttpStatus.OK);
        }else{
        return new ResponseEntity(responseJson.toString(), HttpStatus.BAD_REQUEST);
        }

    }

    @RequestMapping(value = "/teachers", method = RequestMethod.PUT)
    public String updateTeachersData(@RequestBody TeacherTO teacher)
    {
        JSONObject responseJson = new JSONObject();
        return responseJson.toString();
    }

    @RequestMapping(value = "/teachers", method = RequestMethod.DELETE)
    public String deleteTeachersData(@RequestParam(value = "") TeacherTO teacher)
    {
        JSONObject responseJson = new JSONObject();
        return responseJson.toString();
    }
}
