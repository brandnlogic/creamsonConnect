package com.bnl.application.controller;

import com.bnl.application.common.to.TeacherTO;
import com.bnl.application.service.TeacherService;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    
    /*
     * Test GET service handler
     */
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello()
    {
    	return "hello kaushik";
    }
    
    /*
     * POST - Request Handler
     */
    @RequestMapping(value = "/teachers", method = RequestMethod.POST)
    public ResponseEntity<String> saveTeachersData(@RequestBody TeacherTO teacher)
    {
        JSONObject responseJson = new JSONObject();
        //TODO Fetch IbstitueID based on UserId
        
        if(teacherService.saveTeacherData(teacher))
        {
            try {
				responseJson.put("STATUS", "SUCCESS");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return new ResponseEntity(responseJson.toString(), HttpStatus.OK);
        }else{
        return new ResponseEntity(responseJson.toString(), HttpStatus.BAD_REQUEST);
        }
    }
    
    /*
     * PUT - Request Handler
     */

    @RequestMapping(value = "/teachers", method = RequestMethod.PUT)
    public ResponseEntity<String> updateTeachersData(@RequestBody TeacherTO teacher)
    {
        JSONObject responseJson = new JSONObject();
        if(teacherService.editTeacherData(teacher))
        {
        	try {
				responseJson.put("STATUS", "SUCCESS");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return new ResponseEntity(responseJson.toString(), HttpStatus.OK);
        }
        else
        	 return new ResponseEntity(responseJson.toString(), HttpStatus.BAD_REQUEST);
    }

    /*
     * Delete - Request Handler
     */
    @RequestMapping(value = "/teachers", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteTeachersData(@RequestParam(value = "") TeacherTO teacher)
    {
        JSONObject responseJson = new JSONObject();
        if(teacherService.deleteTeacherData(teacher))
        {
        	try {
				responseJson.put("STATUS", "SUCCESS");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	return new ResponseEntity(responseJson.toString(), HttpStatus.OK);
        }
        else
        {
        	 return new ResponseEntity(responseJson.toString(), HttpStatus.BAD_REQUEST);
        }
    }
    
    /*
     * GET - Request Handler
     */
    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public ResponseEntity<String> getAllTeachersData()
    {
     //   JSONObject responseJson = new JSONObject();
        String getAllTeacherResponse = teacherService.getAllTeacherData();
        if(!(getAllTeacherResponse.equals("X")))
        	return new ResponseEntity(getAllTeacherResponse, HttpStatus.OK);
        else
        	return new ResponseEntity("Failure", HttpStatus.BAD_REQUEST);
    }
    
}
