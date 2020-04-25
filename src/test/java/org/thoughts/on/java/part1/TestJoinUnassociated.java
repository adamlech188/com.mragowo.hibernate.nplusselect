package org.thoughts.on.java.part1;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.junit.Test;
import org.thoughts.on.java.model.Author;
import org.thoughts.on.java.model.Author_;
import org.thoughts.on.java.model.Person;
import org.thoughts.on.java.model.Person_;

public class TestJoinUnassociated extends TestConnection {

	@Test
	public void test() {
		List<Object> results = em.createQuery("Select a, p FROM Person p join Author a ON p.lastName=a.lastName").getResultList();
		results.forEach( i -> {
			System.out.print(i);
		});
	}
	
	@Test
	public void testCriteriaBuilder() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Tuple> query = builder.createTupleQuery();
		Root<Author> authorFrom = query.from(Author.class);
		Root<Person> personFrom = query.from(Person.class);
		query.where(builder.equal(authorFrom.get(Author_.lastName),personFrom.get(Person_.lastName)));
		query.multiselect(personFrom.get(Person_.firstName), authorFrom.get(Author_.lastName));
		
		List<Tuple> results = em.createQuery(query).getResultList();
		results.get(0).get(authorFrom.get(Author_.lastName));
		results.forEach( t -> {
			System.out.println(t.get(authorFrom.get(Author_.lastName)));
		});
	
		
	}
}
