package com.ideyatech.ut.StringCalcu;

public class StringCalculator {
	public long calculate (String input){
		String test = input.trim();
		if(test.equals(""))
			return 0;
		long sum=0;
		
		if(test.charAt(0)=='/'&&test.charAt(1)=='/')
		{
			String numbers2[]=test.split("//");
			System.out.println(numbers2[1]);
			String delim=numbers2[1].charAt(0)+"";
			System.out.println(delim);
			if(!delim.equals("[")&&!delim.equals("]")){
				String numbers3[]=numbers2[1].split(delim);
				System.out.println(numbers3[1]);
	
				for(int x=1;x<numbers3.length&&Integer.parseInt(numbers3[x])<1001;x++)
				{
					if(Integer.parseInt(numbers3[x])<0)
						 throw new IllegalArgumentException("must be positive");
					sum+=Integer.parseInt(numbers3[x]);
				}
			}
			else{
				String numbers3[]=numbers2[1].split("\\[");
				String numbers4[]=numbers3[1].split("]");
				String numbers5[]=numbers4[1].split(numbers4[0]);
				System.out.println(numbers4[0]);
				for(int x=0;x<numbers5.length&&Integer.parseInt(numbers5[x])<1001;x++)
				{
					if(Integer.parseInt(numbers5[x])<0)
						 throw new IllegalArgumentException("must be positive");
					sum+=Integer.parseInt(numbers5[x]);
				}
				
			}
			return sum;
		}
		String numbers[] =test.split(",");
		for(int x=0;x<numbers.length&&Integer.parseInt(numbers[x])<1001;x++)
		{
			if(Integer.parseInt(numbers[x])<0)
				 throw new IllegalArgumentException("must be positive");
			sum+=Integer.parseInt(numbers[x]);
		}
		
		return sum;
			
	}

}
