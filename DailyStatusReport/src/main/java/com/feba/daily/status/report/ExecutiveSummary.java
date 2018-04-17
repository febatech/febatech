package com.feba.daily.status.report;

public class ExecutiveSummary {
	private String highLevelStatus;
	private String keyReasonsForNonGreen;
	private String backtoGreenPlan;
	private String owner;
	public String getHighLevelStatus() {
		return highLevelStatus;
	}
	public void setHighLevelStatus(String highLevelStatus) {
		this.highLevelStatus = highLevelStatus;
	}
	public String getKeyReasonsForNonGreen() {
		return keyReasonsForNonGreen;
	}
	public void setKeyReasonsForNonGreen(String keyReasonsForNonGreen) {
		this.keyReasonsForNonGreen = keyReasonsForNonGreen;
	}
	public String getBacktoGreenPlan() {
		return backtoGreenPlan;
	}
	public void setBacktoGreenPlan(String backtoGreenPlan) {
		this.backtoGreenPlan = backtoGreenPlan;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
}
