package org.thoughts.on.java.model;

import java.util.Date;
import javax.persistence.metamodel.Attribute;

public class Book_ {

		public static Attribute<Book, Long> id;
	    
	    public static Attribute<Book, Integer> version;

	    public static Attribute<Book, String> title;

	    public static Attribute<Book,Date>  publishingDate;

	    public static Attribute<Book, Author> authors; 

	    public static Attribute<Book, Review> reviews; 
}
