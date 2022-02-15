import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
	public static void main(String args[])
	{
		List<ComDemo> laps=new ArrayList<>();
		laps.add(new ComDemo("dell",16,800));
		laps.add(new ComDemo("apple",8,1200));
		laps.add(new ComDemo("acer",12,700));
		Collections.sort(laps);
		for(ComDemo l:laps)
		{
			System.out.println(l);
		}
	}

}
