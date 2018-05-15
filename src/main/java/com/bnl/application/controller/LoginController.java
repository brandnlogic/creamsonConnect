package com.bnl.application.controller;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is RestController class for the loging Module. As of now only POST and the GetByUsername method is implemented. Note that this
 * will result into the CRUD operation of the Creamson_Institution_Admin_Dtls table
 */

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bnl.application.common.to.InstitutionAdminDtlsTO;
import com.bnl.application.service.InstitutionAdminDtlsService;

@RestController
public class LoginController {
	
	@Autowired
	InstitutionAdminDtlsService institutionAdminDtlsService;
	
	/*
     * POST - Request Handler
     */
    @RequestMapping(value = "/adminlogin", method = RequestMethod.POST)
    public ResponseEntity<String> saveInstitutionAdminDtls(@RequestBody InstitutionAdminDtlsTO institutionAdminDtlsTO)
    {
        JSONObject responseJson = new JSONObject();
        //TODO Fetch IbstitueID based on UserId
        
        if(institutionAdminDtlsService.saveInstitutionAdminDtls(institutionAdminDtlsTO))
        {
            try {
				responseJson.put("STATUS", "SUCCESS");
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            return new ResponseEntity<String>(responseJson.toString(), HttpStatus.OK);
        }else{
        return new ResponseEntity<String>(responseJson.toString(), HttpStatus.BAD_REQUEST);
        }
    }
    
    /*
     * GET - Request Handler. This will fetch all the rows from the table
     */
    @RequestMapping(value = "/adminlogin", method = RequestMethod.GET)
    public ResponseEntity<String> getAllInstitutionAdminDtls()
    {
     //   JSONObject responseJson = new JSONObject();
        String getAllInstitutionDtlsResponse = institutionAdminDtlsService.getAllInstitutionAdminDtls();
        if(!(getAllInstitutionDtlsResponse.equals("X")))
        	return new ResponseEntity<String>(getAllInstitutionDtlsResponse, HttpStatus.OK);
        else
        	return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
    }
    
    /*
     * GET - Request Handler. This will fetch a particular row from the table based on the User-Name.
     */
    @RequestMapping(value = "/adminlogin/{username}", method = RequestMethod.GET)
    public ResponseEntity<String> getInstitutionAdminDtlsByinstitutionAdminUsername(@PathVariable(value="username") String userName )
    {
     //   JSONObject responseJson = new JSONObject();
        String getAllInstitutionDtlsResponseByUserName = institutionAdminDtlsService.getInstitutionAdminDtlsByinstitutionAdminUsername(userName);
        if(!(getAllInstitutionDtlsResponseByUserName.equals("X")))
        	return new ResponseEntity<String>(getAllInstitutionDtlsResponseByUserName, HttpStatus.OK);
        else
        	return new ResponseEntity<String>("Failure", HttpStatus.BAD_REQUEST);
    }

}