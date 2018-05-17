package pac1;

import java.util.ArrayList;

//ArrayList is list of array objects having different datatype value 
//ex. arrlist[0]  can have integer value arrlist[1] can have string value 

public class ArrayList {

	public static void main(String[] args) 
	{
		 ArrayList arrlist = new ArrayList();
		 arrlist.add(1);
		 arrlist.add("test");
		 
		 for (int i=0;i<arrlist.size();i++)
		 { 
			 System.out.println(arrlist.get(i));
		 }
		// TODO Auto-generated method stub

	}

}
