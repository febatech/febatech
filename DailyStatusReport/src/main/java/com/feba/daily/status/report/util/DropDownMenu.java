package com.feba.daily.status.report.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class DropDownMenu
{
	public Map<String, String> trackWiseStausDropDownList()
	{
		Map<String, String> country = new LinkedHashMap<String, String>();
		country.put("AMBER", "Amber");
		country.put("RED", "Red");
		country.put("GREEN", "Green");
		return country;
	}
}
