package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

import question3.payments.Payments;

public class SortService {
	
	public ArrayList<Payments> sort(Payments[] payments) {
		
		ArrayList<Payments> pays =  new ArrayList<>();
		for (Payments p : payments) {
			pays.add(p);
		}
		
		Comparator<Payments> cmp1 = new Comparator<Payments>() {
			
			public int compare(Payments p1, Payments p2) {
				Date d1 = p1.getDateTime();
				Date d2 = p2.getDateTime();
				return d1.compareTo(d2);
			}

		};
		
		Collections.sort(pays, cmp1);
		
		Comparator<Payments> cmp2 = new Comparator<Payments>() {
			
			public int compare(Payments p1, Payments p2) {
				Double a1 = p1.getAmount();
				Double a2 = p2.getAmount();
				if (a1.compareTo(a2) == -1) {
					return  1;
				} else if (a1.compareTo(a2) == 1) {
					return -1;
				} else {
					return 0;
				}
			}

		};
		
		
		Collections.sort(pays, cmp2);
		
		return pays;
		
	}

}
