import java.util.Collections;
import java.util.List;

public class Compartor {
	public static void main(String args[])
	{
		List<ComDemo>laps=new ArrayList<>();
		laps.add(new ComDemo("dell",16,800));
		laps.add(new ComDemo("apple",8,1200));
		laps.add(new ComDemo("acer",12,700));
	
		Comparator<comDemo>com=new Comparator<ComDemo>();
		{
			public int compare(ComDemo l1,ComDemo l2)
			{
				if(l1.getPrice()>l2.getPrice())
					return 1;
					else
					
						return -1;
				
			}
	};

		 	Collections.sort(laps,Com);
		 	
			for(ComDemo l:laps)
			{
				System.out.println(l);
			}
	
	}//main close
}// class close
