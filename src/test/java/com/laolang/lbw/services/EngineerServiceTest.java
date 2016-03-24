package com.laolang.lbw.services;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.laolang.lbw.domain.Engineer;

public class EngineerServiceTest {

	@BeforeClass
	public static void beforClass(){
		engineerService = new EngineerService();
	}
	
	@Test
	public void testFindEngineerById(){
		Engineer engineer = engineerService.findEngineerById(1);
		assertNotNull("通过 id 工程师为空", engineer);
	}
	
	private static EngineerService engineerService;
}
