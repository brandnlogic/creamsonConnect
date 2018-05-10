package com.bnl.application.common.util;

import java.util.Random;

public class GenerateRandomNum {
	
	public int randomNumberGenerator()
	{
		Random rand = new Random();
		return rand.nextInt(100000);
	}

}
