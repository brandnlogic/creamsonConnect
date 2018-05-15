package com.bnl.application.common.util;

/*
 *  Written By : Kaushik Ghosh
 *  Date       : 05/05/2018
 *  Explanation: This is a generic class which will be can be used by any serviceImplementing class. This  takes in a List of generic Objects
 *  and then convert them all into a string using string builder. It is the responsibility of the calling class to set the particular generic type
 *  before utilizing this class.
 */
import java.util.List;
import com.google.gson.Gson;

public class GsonConverter<T> {
	
	public String ConvertJSONToString(List <T> entityObjectList)
	{
		Gson gson = new Gson();
		StringBuilder sb = new StringBuilder();
		for(T entity : entityObjectList)
		{
			sb.append(gson.toJson(entity));
		}
		return sb.toString();
	}
	
	public String ConvertJSONToString(T entityObject)
	{
		Gson gson = new Gson();
		StringBuilder sb = new StringBuilder();
		sb.append(gson.toJson(entityObject));
			
		return sb.toString();
	}
}
