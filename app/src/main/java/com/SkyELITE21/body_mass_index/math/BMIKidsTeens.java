package com.SkyELITE21.body_mass_index.math;

import android.app.*;

public class BMIKidsTeens
{
	public BMIKidsTeens(){}
	private double dresult,dleap = 0.25;
	private int result,age;
	private String type;
	public String TYPE_OVERWEIGHT_NAME = "Overweight",
	TYPE_OBESE_NAME = "Obese",
	TYPE_NORMAL_NAME = "Normal",
	TYPE_UNDERWEIGHT_NAME = "Underweight";
	public double TYPE_NORMAL_MIN,
	TYPE_NORMAL_MAX,
	TYPE_UNDERWEIGHT_MIN = 0.1,
	TYPE_UNDERWEIGHT_MAX,
	TYPE_OVERWEIGHT_MIN,
	TYPE_OVERWEIGHT_MAX,
	TYPE_OBESE;

	public int getBMI(double height, double weight)
	{
		if(height == 0.0 & weight == 0.0)
		{
			result = 0;
		}
		else
		{
			double height3 = height;
			double height2 = height * height3;
			double result2 = weight / height2;
			dresult = result2;
			result = (int) result2;
		}
		return result;
	}

	public int getBMI(int height, int weight)
	{
		int height2 = height ^ 2;
		result = weight / height2;
		return result;
	}

	public String getType(int ageInYears,String gender)
	{
		getOverweightMax(ageInYears,gender);
		getUnderweightMax(ageInYears,gender);
		getOverweightMin(ageInYears,gender);
		getObese(ageInYears,gender);
		getNormalMax(ageInYears,gender);
		getNormalMin(ageInYears,gender);
		if(dresult >= TYPE_OBESE)
		{
			type = TYPE_OBESE_NAME;
		}
		else if(dresult == TYPE_OVERWEIGHT_MAX)
		{
			type = TYPE_OVERWEIGHT_NAME;
		}
		else if(dresult >= TYPE_OVERWEIGHT_MIN)
		{
			type = TYPE_OVERWEIGHT_NAME;
		}
		else if(dresult == TYPE_NORMAL_MAX)
		{
			type = TYPE_NORMAL_NAME;
		}
		else if(dresult >= TYPE_NORMAL_MIN)
		{
			type = TYPE_NORMAL_NAME;
		}
		else if(dresult == TYPE_UNDERWEIGHT_MAX)
		{
			type = TYPE_UNDERWEIGHT_NAME;
		}
		else if(dresult >= TYPE_UNDERWEIGHT_MIN)
		{
			type = TYPE_UNDERWEIGHT_NAME;
		}
		else
		{
			Activity ctx = new Activity();
			type = ctx.getString(com.SkyELITE21.body_mass_index.R.string.no_bmi);
		}
		return type;
	}
	
	public int getageInDays(int ageInYears)
	{
		double leap = ageInYears * dleap;
		int leapyears = (int) leap;
		int year = ageInYears - leapyears;
		int years = year * 365;
		int leapyear = leapyears * 366;
		age = years + leapyear;
		return age;
	}
	
	public int getageInMonths(int ageInYears)
	{
		age = ageInYears * 12;
		return age;
	}
	
	public int getageInYears(int ageInMonths)
	{
		age = ageInMonths / 12;
		return age;
	}
	
	
	public double getOverweightMax(int ageInYears, String gender)
	{
		if(gender == "male")
		{
			if(ageInYears == 20)
			{
				TYPE_OVERWEIGHT_MAX =30.8;
			}
			else if(ageInYears == 19)
			{
				TYPE_OVERWEIGHT_MAX = 30.0;
			}
			else if(ageInYears == 18)
			{
				TYPE_OVERWEIGHT_MAX = 29.0;
			}
			else if(ageInYears == 17)
			{
				TYPE_OVERWEIGHT_MAX = 28.0;
			}
			else if(ageInYears == 16)
			{
				TYPE_OVERWEIGHT_MAX = 27.6;
			}
			else if(ageInYears == 15)
			{
				TYPE_OVERWEIGHT_MAX = 27.0;
			}
			else if(ageInYears == 14)
			{
				TYPE_OVERWEIGHT_MAX = 26.0;
			}
			else if(ageInYears == 13)
			{
				TYPE_OVERWEIGHT_MAX = 25.0;
			}
			else if(ageInYears == 12)
			{
				TYPE_OVERWEIGHT_MAX = 24.0;
			}
			else if(ageInYears == 11)
			{
				TYPE_OVERWEIGHT_MAX = 23.0;
			}
			else if(ageInYears == 10)
			{
				TYPE_OVERWEIGHT_MAX = 22.0;
			}
			else if(ageInYears == 9)
			{
				TYPE_OVERWEIGHT_MAX = 21.0;
			}
			else if(ageInYears == 8)
			{
				TYPE_OVERWEIGHT_MAX = 20.0;
			}
			else if(ageInYears == 7)
			{
				TYPE_OVERWEIGHT_MAX = 19.0;
			}
			else if(ageInYears == 6)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 5)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 4)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 3)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 2)
			{
				TYPE_OVERWEIGHT_MAX = 19.0;
			}
			else{}
		}
		else if(gender == "female")
		{
			if(ageInYears == 20)
			{
				TYPE_OVERWEIGHT_MAX = 32.0;
			}
			else if(ageInYears == 19)
			{
				TYPE_OVERWEIGHT_MAX = 31.0;
			}
			else if(ageInYears == 18)
			{
				TYPE_OVERWEIGHT_MAX = 30.0;
			}
			else if(ageInYears == 17)
			{
				TYPE_OVERWEIGHT_MAX = 30.0;
			}
			else if(ageInYears == 16)
			{
				TYPE_OVERWEIGHT_MAX = 29.0;
			}
			else if(ageInYears == 15)
			{
				TYPE_OVERWEIGHT_MAX = 28.0;
			}
			else if(ageInYears == 14)
			{
				TYPE_OVERWEIGHT_MAX = 27.0;
			}
			else if(ageInYears == 13)
			{
				TYPE_OVERWEIGHT_MAX = 26.0;
			}
			else if(ageInYears == 12)
			{
				TYPE_OVERWEIGHT_MAX = 25.0;
			}
			else if(ageInYears == 11)
			{
				TYPE_OVERWEIGHT_MAX = 24.0;
			}
			else if(ageInYears == 10)
			{
				TYPE_OVERWEIGHT_MAX = 23.0;
			}
			else if(ageInYears == 9)
			{
				TYPE_OVERWEIGHT_MAX = 22.0;
			}
			else if(ageInYears == 8)
			{
				TYPE_OVERWEIGHT_MAX = 21.0;
			}
			else if(ageInYears == 7)
			{
				TYPE_OVERWEIGHT_MAX = 20.0;
			}
			else if(ageInYears == 6)
			{
				TYPE_OVERWEIGHT_MAX = 19.0;
			}
			else if(ageInYears == 5)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 4)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 3)
			{
				TYPE_OVERWEIGHT_MAX = 18.0;
			}
			else if(ageInYears == 2)
			{
				TYPE_OVERWEIGHT_MAX = 19.0;
			}
			else{}
		}
		else {}
		return TYPE_OVERWEIGHT_MAX;
	}
	
	public double getNormalMax(int ageInYears, String gender)
	{
		if(gender == "male")
		{
			if(ageInYears == 20)
			{
				TYPE_NORMAL_MAX = 27.0;
			}
			else if(ageInYears == 19)
			{
				TYPE_NORMAL_MAX = 26.0;
			}
			else if(ageInYears == 18)
			{
				TYPE_NORMAL_MAX = 25.5;
			}
			else if(ageInYears == 17)
			{
				TYPE_NORMAL_MAX = 25.0;
			}
			else if(ageInYears == 16)
			{
				TYPE_NORMAL_MAX = 24.0;
			}
			else if(ageInYears == 15)
			{
				TYPE_NORMAL_MAX = 23.0;
			}
			else if(ageInYears == 14)
			{
				TYPE_NORMAL_MAX = 23.0;
			}
			else if(ageInYears == 13)
			{
				TYPE_NORMAL_MAX = 22.0;
			}
			else if(ageInYears == 12)
			{
				TYPE_NORMAL_MAX = 21.0;
			}
			else if(ageInYears == 11)
			{
				TYPE_NORMAL_MAX = 20.0;
			}
			else if(ageInYears == 10)
			{
				TYPE_NORMAL_MAX = 19.5;
			}
			else if(ageInYears == 9)
			{
				TYPE_NORMAL_MAX = 19.0;
			}
			else if(ageInYears == 8)
			{
				TYPE_NORMAL_MAX = 18.0;
			}
			else if(ageInYears == 7)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 6)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 5)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 4)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 3)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 2)
			{
				TYPE_NORMAL_MAX = 18.0;
			}
			else{}
		}
		else if(gender == "female")
		{
			if(ageInYears == 20)
			{
				TYPE_NORMAL_MAX = 26.5;
			}
			else if(ageInYears == 19)
			{
				TYPE_NORMAL_MAX = 26.0;
			}
			else if(ageInYears == 18)
			{
				TYPE_NORMAL_MAX = 26.0;
			}
			else if(ageInYears == 17)
			{
				TYPE_NORMAL_MAX = 25.0;
			}
			else if(ageInYears == 16)
			{
				TYPE_NORMAL_MAX = 25.0;
			}
			else if(ageInYears == 15)
			{
				TYPE_NORMAL_MAX = 24.0;
			}
			else if(ageInYears == 14)
			{
				TYPE_NORMAL_MAX = 23.0;
			}
			else if(ageInYears == 13)
			{
				TYPE_NORMAL_MAX = 22.7;
			}
			else if(ageInYears == 12)
			{
				TYPE_NORMAL_MAX = 22.0;
			}
			else if(ageInYears == 11)
			{
				TYPE_NORMAL_MAX = 21.0;
			}
			else if(ageInYears == 10)
			{
				TYPE_NORMAL_MAX = 20.0;
			}
			else if(ageInYears == 9)
			{
				TYPE_NORMAL_MAX = 19.0;
			}
			else if(ageInYears == 8)
			{
				TYPE_NORMAL_MAX = 18.0;
			}
			else if(ageInYears == 7)
			{
				TYPE_NORMAL_MAX = 17.5;
			}
			else if(ageInYears == 6)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 5)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 4)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 3)
			{
				TYPE_NORMAL_MAX = 17.0;
			}
			else if(ageInYears == 2)
			{
				TYPE_NORMAL_MAX = 18.0;
			}
			else{}
		}
		else {}
		return TYPE_NORMAL_MAX;
	}
	
	public double getUnderweightMax(int ageInYears, String gender)
	{
		if(gender == "male")
		{
			if(ageInYears == 20)
			{
				TYPE_UNDERWEIGHT_MAX = 19.9;
			}
			else if(ageInYears == 19)
			{
				TYPE_UNDERWEIGHT_MAX = 18.9;
			}
			else if(ageInYears == 18)
			{
				TYPE_UNDERWEIGHT_MAX = 17.9;
			}
			else if(ageInYears == 17)
			{
				TYPE_UNDERWEIGHT_MAX = 17.4;
			}
			else if(ageInYears == 16)
			{
				TYPE_UNDERWEIGHT_MAX = 16.9;
			}
			else if(ageInYears == 15)
			{
				TYPE_UNDERWEIGHT_MAX = 16.4;
			}
			else if(ageInYears == 14)
			{
				TYPE_UNDERWEIGHT_MAX = 15.9;
			}
			else if(ageInYears == 13)
			{
				TYPE_UNDERWEIGHT_MAX = 15.4;
			}
			else if(ageInYears == 12)
			{
				TYPE_UNDERWEIGHT_MAX = 14.9;
			}
			else if(ageInYears == 11)
			{
				TYPE_UNDERWEIGHT_MAX = 14.4;
			}
			else if(ageInYears == 10)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 9)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 8)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 7)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 6)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 5)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 4)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 3)
			{
				TYPE_UNDERWEIGHT_MAX = 14.4;
			}
			else if(ageInYears == 2)
			{
				TYPE_UNDERWEIGHT_MAX = 14.9;
			}
			else{}
		}
		else if(gender == "female")
		{
			if(ageInYears == 20)
			{
				TYPE_UNDERWEIGHT_MAX = 17.9;
			}
			else if(ageInYears == 19)
			{
				TYPE_UNDERWEIGHT_MAX = 17.9;
			}
			else if(ageInYears == 18)
			{
				TYPE_UNDERWEIGHT_MAX = 17.4;
			}
			else if(ageInYears == 17)
			{
				TYPE_UNDERWEIGHT_MAX = 16.9;
			}
			else if(ageInYears == 16)
			{
				TYPE_UNDERWEIGHT_MAX = 16.9;
			}
			else if(ageInYears == 15)
			{
				TYPE_UNDERWEIGHT_MAX = 16.4;
			}
			else if(ageInYears == 14)
			{
				TYPE_UNDERWEIGHT_MAX = 15.7;
			}
			else if(ageInYears == 13)
			{
				TYPE_UNDERWEIGHT_MAX = 14.9;
			}
			else if(ageInYears == 12)
			{
				TYPE_UNDERWEIGHT_MAX = 14.9;
			}
			else if(ageInYears == 11)
			{
				TYPE_UNDERWEIGHT_MAX = 14.4;
			}
			else if(ageInYears == 10)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 9)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 8)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 7)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 6)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 5)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 4)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 3)
			{
				TYPE_UNDERWEIGHT_MAX = 13.9;
			}
			else if(ageInYears == 2)
			{
				TYPE_UNDERWEIGHT_MAX = 14.4;
			}
			else{}
		}
		else {}
		return TYPE_UNDERWEIGHT_MAX;
	}
	
	public double getObese(int ageInYears, String gender)
	{
		if(gender == "male")
		{
			if(ageInYears == 20)
			{
				TYPE_OBESE =30.9;
			}
			else if(ageInYears == 19)
			{
				TYPE_OBESE = 30.1;
			}
			else if(ageInYears == 18)
			{
				TYPE_OBESE = 29.1;
			}
			else if(ageInYears == 17)
			{
				TYPE_OBESE = 28.1;
			}
			else if(ageInYears == 16)
			{
				TYPE_OBESE = 27.7;
			}
			else if(ageInYears == 15)
			{
				TYPE_OBESE = 27.1;
			}
			else if(ageInYears == 14)
			{
				TYPE_OBESE = 26.1;
			}
			else if(ageInYears == 13)
			{
				TYPE_OBESE = 25.1;
			}
			else if(ageInYears == 12)
			{
				TYPE_OBESE = 24.1;
			}
			else if(ageInYears == 11)
			{
				TYPE_OBESE = 23.1;
			}
			else if(ageInYears == 10)
			{
				TYPE_OBESE = 22.1;
			}
			else if(ageInYears == 9)
			{
				TYPE_OBESE = 21.1;
			}
			else if(ageInYears == 8)
			{
				TYPE_OBESE = 20.1;
			}
			else if(ageInYears == 7)
			{
				TYPE_OBESE = 19.1;
			}
			else if(ageInYears == 6)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 5)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 4)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 3)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 2)
			{
				TYPE_OBESE = 19.1;
			}
			else{}
		}
		else if(gender == "female")
		{
			if(ageInYears == 20)
			{
				TYPE_OBESE = 32.1;
			}
			else if(ageInYears == 19)
			{
				TYPE_OBESE = 31.1;
			}
			else if(ageInYears == 18)
			{
				TYPE_OBESE = 30.1;
			}
			else if(ageInYears == 17)
			{
				TYPE_OBESE = 30.1;
			}
			else if(ageInYears == 16)
			{
				TYPE_OBESE = 29.1;
			}
			else if(ageInYears == 15)
			{
				TYPE_OBESE = 28.1;
			}
			else if(ageInYears == 14)
			{
				TYPE_OBESE = 27.1;
			}
			else if(ageInYears == 13)
			{
				TYPE_OBESE = 26.1;
			}
			else if(ageInYears == 12)
			{
				TYPE_OBESE = 25.1;
			}
			else if(ageInYears == 11)
			{
				TYPE_OBESE = 24.1;
			}
			else if(ageInYears == 10)
			{
				TYPE_OBESE = 23.1;
			}
			else if(ageInYears == 9)
			{
				TYPE_OBESE = 22.1;
			}
			else if(ageInYears == 8)
			{
				TYPE_OBESE = 21.1;
			}
			else if(ageInYears == 7)
			{
				TYPE_OBESE = 20.1;
			}
			else if(ageInYears == 6)
			{
				TYPE_OBESE = 19.1;
			}
			else if(ageInYears == 5)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 4)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 3)
			{
				TYPE_OBESE = 18.1;
			}
			else if(ageInYears == 2)
			{
				TYPE_OBESE = 19.1;
			}
			else{}
		}
		else {}
		return TYPE_OBESE;
	}
	
	public double getOverweightMin(int ageInYears, String gender)
	{
		if(gender == "male")
		{
			if(ageInYears == 20)
			{
				TYPE_OVERWEIGHT_MIN = 27.1;
			}
			else if(ageInYears == 19)
			{
				TYPE_OVERWEIGHT_MIN = 26.1;
			}
			else if(ageInYears == 18)
			{
				TYPE_OVERWEIGHT_MIN = 25.6;
			}
			else if(ageInYears == 17)
			{
				TYPE_OVERWEIGHT_MIN = 25.1;
			}
			else if(ageInYears == 16)
			{
				TYPE_OVERWEIGHT_MIN = 24.1;
			}
			else if(ageInYears == 15)
			{
				TYPE_OVERWEIGHT_MIN = 23.1;
			}
			else if(ageInYears == 14)
			{
				TYPE_OVERWEIGHT_MIN = 23.1;
			}
			else if(ageInYears == 13)
			{
				TYPE_OVERWEIGHT_MIN = 22.1;
			}
			else if(ageInYears == 12)
			{
				TYPE_OVERWEIGHT_MIN = 21.1;
			}
			else if(ageInYears == 11)
			{
				TYPE_OVERWEIGHT_MIN = 20.1;
			}
			else if(ageInYears == 10)
			{
				TYPE_OVERWEIGHT_MIN = 19.6;
			}
			else if(ageInYears == 9)
			{
				TYPE_OVERWEIGHT_MIN = 19.1;
			}
			else if(ageInYears == 8)
			{
				TYPE_OVERWEIGHT_MIN = 18.1;
			}
			else if(ageInYears == 7)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 6)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 5)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 4)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 3)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 2)
			{
				TYPE_OVERWEIGHT_MIN = 18.1;
			}
			else{}
		}
		else if(gender == "female")
		{
			if(ageInYears == 20)
			{
				TYPE_OVERWEIGHT_MIN = 26.6;
			}
			else if(ageInYears == 19)
			{
				TYPE_OVERWEIGHT_MIN = 26.1;
			}
			else if(ageInYears == 18)
			{
				TYPE_OVERWEIGHT_MIN = 26.1;
			}
			else if(ageInYears == 17)
			{
				TYPE_OVERWEIGHT_MIN = 25.1;
			}
			else if(ageInYears == 16)
			{
				TYPE_OVERWEIGHT_MIN = 25.1;
			}
			else if(ageInYears == 15)
			{
				TYPE_OVERWEIGHT_MIN = 24.1;
			}
			else if(ageInYears == 14)
			{
				TYPE_OVERWEIGHT_MIN = 23.1;
			}
			else if(ageInYears == 13)
			{
				TYPE_OVERWEIGHT_MIN = 22.8;
			}
			else if(ageInYears == 12)
			{
				TYPE_OVERWEIGHT_MIN = 22.1;
			}
			else if(ageInYears == 11)
			{
				TYPE_OVERWEIGHT_MIN = 21.1;
			}
			else if(ageInYears == 10)
			{
				TYPE_OVERWEIGHT_MIN = 20.1;
			}
			else if(ageInYears == 9)
			{
				TYPE_OVERWEIGHT_MIN = 19.1;
			}
			else if(ageInYears == 8)
			{
				TYPE_OVERWEIGHT_MIN = 18.1;
			}
			else if(ageInYears == 7)
			{
				TYPE_OVERWEIGHT_MIN = 17.6;
			}
			else if(ageInYears == 6)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 5)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 4)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 3)
			{
				TYPE_OVERWEIGHT_MIN = 17.1;
			}
			else if(ageInYears == 2)
			{
				TYPE_OVERWEIGHT_MIN = 18.1;
			}
			else{}
		}
		else {}
		return TYPE_OVERWEIGHT_MIN;
	}
	
	public double getNormalMin(int ageInYears, String gender)
	{
		if(gender == "male")
		{
			if(ageInYears == 20)
			{
				TYPE_NORMAL_MIN = 20.0;
			}
			else if(ageInYears == 19)
			{
				TYPE_NORMAL_MIN = 19.0;
			}
			else if(ageInYears == 18)
			{
				TYPE_NORMAL_MIN = 18.0;
			}
			else if(ageInYears == 17)
			{
				TYPE_NORMAL_MIN = 17.5;
			}
			else if(ageInYears == 16)
			{
				TYPE_NORMAL_MIN = 17.0;
			}
			else if(ageInYears == 15)
			{
				TYPE_NORMAL_MIN = 16.5;
			}
			else if(ageInYears == 14)
			{
				TYPE_NORMAL_MIN = 16.0;
			}
			else if(ageInYears == 13)
			{
				TYPE_NORMAL_MIN = 15.5;
			}
			else if(ageInYears == 12)
			{
				TYPE_NORMAL_MIN = 15.0;
			}
			else if(ageInYears == 11)
			{
				TYPE_NORMAL_MIN = 14.5;
			}
			else if(ageInYears == 10)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 9)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 8)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 7)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 6)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 5)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 4)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 3)
			{
				TYPE_NORMAL_MIN = 14.5;
			}
			else if(ageInYears == 2)
			{
				TYPE_NORMAL_MIN = 15.0;
			}
			else{}
		}
		else if(gender == "female")
		{
			if(ageInYears == 20)
			{
				TYPE_NORMAL_MIN = 18.0;
			}
			else if(ageInYears == 19)
			{
				TYPE_NORMAL_MIN = 18.0;
			}
			else if(ageInYears == 18)
			{
				TYPE_NORMAL_MIN = 17.5;
			}
			else if(ageInYears == 17)
			{
				TYPE_NORMAL_MIN = 17.0;
			}
			else if(ageInYears == 16)
			{
				TYPE_NORMAL_MIN = 17.0;
			}
			else if(ageInYears == 15)
			{
				TYPE_NORMAL_MIN = 16.5;
			}
			else if(ageInYears == 14)
			{
				TYPE_NORMAL_MIN = 15.8;
			}
			else if(ageInYears == 13)
			{
				TYPE_NORMAL_MIN = 15.0;
			}
			else if(ageInYears == 12)
			{
				TYPE_NORMAL_MIN = 15.0;
			}
			else if(ageInYears == 11)
			{
				TYPE_NORMAL_MIN = 14.5;
			}
			else if(ageInYears == 10)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 9)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 8)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 7)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 6)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 5)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 4)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 3)
			{
				TYPE_NORMAL_MIN = 14.0;
			}
			else if(ageInYears == 2)
			{
				TYPE_NORMAL_MIN = 14.5;
			}
			else{}
		}
		else {}
		return TYPE_NORMAL_MIN;
	}
}
