class BinarySearch{
	public static void main(String[] args){
		//int[] arrayn = {1,2,3,5,6,7,9,19,20,31,32};
		int[] arrayn = {45,43,23,12,4,3,2,1};
		int i = 0;
		int j = arrayn.length;
        int m;
		int x = 12;
		int location;

		while(i < j)
		{
			m = (i + j)/2;
			if(x < arrayn[m])
				i = m + 1;
			else
				j = m;
		}
		if(x == arrayn[i])
			location = i;
		else
			location = -1;

		System.out.println("X is located at position " + location);
	}
}

