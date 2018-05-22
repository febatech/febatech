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
		country.put("ONHOLD", "OnHold");
		return country;
	}
	
	public Map<String, String> raidLogStausDropDownList()
	{
		Map<String, String> raidLogStatus = new LinkedHashMap<String, String>();
		raidLogStatus.put("OPEN", "Open");
		raidLogStatus.put("INPROGRESS", "In Progress");
		raidLogStatus.put("FIXED", "Fixed");
		raidLogStatus.put("REJECTED", "Rejected");
		raidLogStatus.put("REOPEN", "Reopen");
		raidLogStatus.put("CLOSE", "Close");
		return raidLogStatus;
	}
}
