package org.thoughts.on.java.model;

import javax.persistence.metamodel.Attribute;

public class Author_ {
	
	public static Attribute<Author, Long>  id;

    public static Attribute<Author, Integer> version;

    public static Attribute<Author,String> firstName;

    public static Attribute<Author, String> lastName;

	public static Attribute<Author, Book> books; 
	
	
}
