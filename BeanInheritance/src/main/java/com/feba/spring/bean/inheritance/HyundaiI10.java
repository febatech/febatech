package com.feba.spring.bean.inheritance;

import java.util.List;

public class HyundaiI10 {
	
	String makeBy ;
	String id ;
	String engineCC ;
	List<String> accessories;
	String varient;

	public void setMakeBy(String makeBy) {
		this.makeBy = makeBy;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}
	
	public void setAccessories(List<String> accessories) {
		this.accessories = accessories;
	}

	public String toString(){
		String accessoriesForDisplay="";
		for(String accessory : this.accessories){
			accessoriesForDisplay+=(accessory+"  ");
		}
		
		return "Hyundai I10 makeBy "+makeBy+" id "+id+" engineCC "+engineCC+" varient "+varient+" accessories "+accessoriesForDisplay;
		
	}
	

}
