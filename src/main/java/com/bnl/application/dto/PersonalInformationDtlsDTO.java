package com.bnl.application.dto;

/*
 * Created By : Kaushik Ghosh
 * Date       : 05/07/2018
 * Description: This is the Entity class of the Personal_Information_Dtls table. Note that since the table consist of the composite Primary key we have
 * the @EmbeddedID field.
 */

import javax.persistence.*;
//import java.util.Date;

@Entity(name = "Personal_Information_Dtls")

public class PersonalInformationDtlsDTO {
	
	@EmbeddedId
	private PersonalInformationDtlsPrimaryKey personalInformationDtlsPrimaryKey;
	
	@Column(name = "First_Name")
	private String firstName;
	   
	@Column(name = "Middle_Name")
	private String middleName;
	    
	@Column(name = "Last_Name")
	private String lastName;

	@Column(name = "Date_of_Birth")
	private String dateOfBirth;

	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "Contact_Number")
	private String contactNumber;

	@Column(name = "Email_Id")
	private String emailId;

	@Column(name = "Street_Address")
	private String streetAddress;
	
	@Column(name = "State")
	private String state;

	@Column(name = "City")
	private String city;

	@Column(name = "Pincode")
	private String pincode;
	
	@Column(name = "Last_Update_Id")
	private String lastUpdateID;

	@Column(name = "Last_Update_Timestamp")
	private String lastUpdateTimeStamp;

}
