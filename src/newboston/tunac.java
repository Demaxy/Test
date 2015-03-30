package newboston;
// Enumeration -44 ---
public enum tunac 
	{
		bucky("nice", "22"),
		kelsey("cutie", "23"),
		julia("mistake", "24");
			
		private final String desc;
		private final String year;
			
		// create enumeration constructor
		
		tunac(String description, String birthday)
		{
			desc = description;
			year = birthday;
		}
		
		public String getDesc()
		{
			return desc;
		}
		
		public String getYear()
		{
			return year;
		}
	
	}


// EnumSet range  - 45 
