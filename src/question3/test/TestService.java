package question3.test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;

import org.junit.Test;

import question3.SortService;
import question3.payments.Payments;

public class TestService {
	
	@Test
	public void testSortService() throws ParseException {
		 Payments pays[] = new Payments[] {
                 new Payments("10/01/2011 20:15:10", "1002.01"),
                 new Payments("10/01/2011 20:15:00", "1001.00"),
                 new Payments("10/01/2011 20:15:00", "1002.00"),
                 };

		 ArrayList<Payments> exPays = new ArrayList<>();
		 exPays.add(new Payments("10/01/2011 20:15:10", "1002.01"));
		 exPays.add(new Payments("10/01/2011 20:15:00", "1002.00"));
		 exPays.add(new Payments("10/01/2011 20:15:00", "1001.00"));	 
		 SortService ss = new SortService();
		 ArrayList<Payments> actualResult = ss.sort(pays);	 
		 
		 assertEquals(exPays, actualResult); 
	}

}
