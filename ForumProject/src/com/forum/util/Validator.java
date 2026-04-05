
	package com.forum.util;

	public class Validator {

	    public static void validateTitle(String title){

	        if(title==null || title.trim().isEmpty()){
	            throw new IllegalArgumentException("Title cannot be empty");
	        }
	    }
	}


