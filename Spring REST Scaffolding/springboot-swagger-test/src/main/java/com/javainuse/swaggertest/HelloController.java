package com.javainuse.swaggertest;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	 private static final String ID = "id";
	
	
	@ApiOperation(value = "getGreeting", nickname = "getGreeting")
	 @ApiResponses(value = {
		        @ApiResponse(code = 500, message = "Server error"),
		        @ApiResponse(code = 200, message = "Successful retrieval",
		            response = Hello.class, responseContainer = "List") })
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public List<Hello> sayHello(@ApiParam(value = "testId",
	        required = true, defaultValue = "111")  @PathVariable(ID) final int institutuionId) {
			ArrayList<Hello> arrayList= new ArrayList<>();
			arrayList.add(new Hello());
		return arrayList;
	}
}
