package com.feba.spring.bean.inheritance;

public class HyundaiI10 {
	
	String makeBy ;
	String id ;
	String engineCC ;
	
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
	
	public String toString(){
		return "Hyundai I10 makeBy "+makeBy+" id "+id+" engineCC "+engineCC+" varient "+varient;
	}
	

}
