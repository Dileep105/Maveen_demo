package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTests {
	@ParameterizedTest
	@ValueSource(ints = {18,10,20,50,70,100})
	public void testArrays(int arg)
	{
		System.out.println("arg :"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	@ParameterizedTest
	@DisplayName("welcome to india")
	@ValueSource(strings = {"dileep","chandra","ashok"})
	public void testParam(String msg)
	{
		Assertions.assertNotNull(msg);
	}
	
	@RepeatedTest(3)
	public void  shouldRepeat()
	{
		int x=10,y=20;
		assertEquals(200,x*y);
	}
	
	//J unit Lambda
    @Test
    public void testLambda()
    {
    	Integer[] intArray= {2,3,4,5,7};
    	List<Integer> numbers = Arrays.asList(intArray);
    	Assertions.assertAll(
    			() -> assertEquals(2,numbers.get(0)),
    			() -> assertEquals(3,numbers.get(1)),
    			() -> assertEquals(4,numbers.get(2)),
    			() -> assertEquals(5,numbers.get(3)),
    			() -> assertEquals(7,numbers.get(4))
    			);
    	}
    @Test
    void testExceptions() 
    {
    	Assertions.assertThrows( NumberFormatException.class,() ->
    	{
    	  Integer.parseInt("One");
    	});
    
    }
}
