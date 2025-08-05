package NewJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CamparitableDemo {
	
	public int id;
	public String name;
	
	public CamparitableDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.id + " : "+this.name ;
	}

	public static void main(String[] args) {
		
		CamparitableDemo ctd = new CamparitableDemo(2,"Raman");
		CamparitableDemo ctd1 = new CamparitableDemo(3,"Raghav");
		CamparitableDemo ctd2 = new CamparitableDemo(22,"Aman");
		CamparitableDemo ctd3 = new CamparitableDemo(33,"Rajat");
		List<CamparitableDemo> li = new ArrayList<>();
		li.add(ctd);
		li.add(ctd1);
		li.add(ctd2);
		li.add(ctd3);
		Collections.sort(li,(a,b)->b.id - a.id);
		System.out.println(li);
	}

}
