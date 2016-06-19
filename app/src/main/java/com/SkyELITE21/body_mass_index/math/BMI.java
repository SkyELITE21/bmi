package com.SkyELITE21.body_mass_index.math;
import java.sql.*;
import android.util.*;
import android.content.*;
import android.app.*;

public class BMI
{
	public BMI(){}
	public String TYPE_OVERWEIGHT_NAME = "Overweight",
	TYPE_VERY_SEVERELY_UNDERWEIGHT_NAME = "Very Severely Underweight",
	TYPE_MODERATELY_OBESE_NAME = "Moderately Obese",
	TYPE_VERY_SEVERELY_OBESE_NAME = "Very Severely Obese",
	TYPE_NORMAL_NAME = "Normal",
	TYPE_UNDERWEIGHT_NAME = "Underweight",
	TYPE_SEVERELY_OBESE_NAME = "Severely Obese",
	TYPE_SEVERELY_UNDERWEIGHT_NAME = "Severely Underweight";
	public double TYPE_NORMAL_MIN = 18.5,
	TYPE_NORMAL_MAX = 25.0,
	TYPE_UNDERWEIGHT_MIN = 16.1,
	TYPE_UNDERWEIGHT_MAX = 18.4,
	TYPE_SEVERELY_UNDERWEIGHT_MIN = 15.1,
	TYPE_SEVERELY_UNDERWEIGHT_MAX = 16.0,
	TYPE_VERY_SEVERELY_UNDERWEIGHT_MIN = 0.1,
	TYPE_VERY_SEVERELY_UNDERWEIGHT_MAX = 15.0,
	TYPE_OVERWEIGHT_MIN = 25.1,
	TYPE_OVERWEIGHT_MAX = 30.0,
	TYPE_MODERATELY_OBESE_MIN = 30.1,
	TYPE_MODERATELY_OBESE_MAX = 35.0,
	TYPE_SEVERELY_OBESE_MIN = 35.1,
	TYPE_SEVERELY_OBESE_MAX = 40.0,
	TYPE_VERY_SEVERELY_OBESE = 40.1;
	private int result;
	private double dresult;
	private String type;
	
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
	
	public String getType()
	{
		if(dresult >= TYPE_VERY_SEVERELY_OBESE)
		{
			type = TYPE_VERY_SEVERELY_OBESE_NAME;
		}
		else if(dresult == TYPE_SEVERELY_OBESE_MAX)
		{
			type = TYPE_SEVERELY_OBESE_NAME;
		}
		else if(dresult >= TYPE_SEVERELY_OBESE_MIN)
		{
			type = TYPE_SEVERELY_OBESE_NAME;
		}
		else if(dresult == TYPE_MODERATELY_OBESE_MAX)
		{
			type = TYPE_MODERATELY_OBESE_NAME;
		}
		else if(dresult >= TYPE_MODERATELY_OBESE_MIN)
		{
			type = TYPE_MODERATELY_OBESE_NAME;
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
		else if(dresult == TYPE_SEVERELY_UNDERWEIGHT_MAX)
		{
			type = TYPE_SEVERELY_UNDERWEIGHT_NAME;
		}
		else if(dresult >= TYPE_SEVERELY_UNDERWEIGHT_MIN)
		{
			type = TYPE_SEVERELY_UNDERWEIGHT_NAME;
		}
		else if(dresult == TYPE_VERY_SEVERELY_UNDERWEIGHT_MAX)
		{
			type = TYPE_VERY_SEVERELY_UNDERWEIGHT_NAME;
		}
		else if(dresult >= TYPE_VERY_SEVERELY_UNDERWEIGHT_MIN)
		{
			type = TYPE_VERY_SEVERELY_UNDERWEIGHT_NAME;
		}
		else
		{
			Activity ctx = new Activity();
			type = ctx.getString(com.SkyELITE21.body_mass_index.R.string.no_bmi);
		}
		return type;
	}
}
