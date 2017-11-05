// program to search an array

class Search 
{
	public static void main(String[] args) 
	{
		int num[] = {6,8,3,7,5,6,1,4};
		int val = 55;
		boolean found = false;

		for (int x: num)
		{
			if (x == val)
			{
				found = true;
				break;
			}
		}

		if (found)
		{
			System.out.println("Value found");
		}
		else
		{
			System.out.println("Value Not found");
		}


	}
}
