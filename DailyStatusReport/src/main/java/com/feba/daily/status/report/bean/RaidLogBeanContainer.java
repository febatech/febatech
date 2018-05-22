package com.feba.daily.status.report.bean;

import java.util.LinkedList;
import java.util.List;

public class RaidLogBeanContainer
{
	 private List<RaidLogBean> raidLogBeans = new LinkedList<RaidLogBean>();
	 
    public RaidLogBeanContainer() {
    }
 
    public RaidLogBeanContainer(List<RaidLogBean> raidLogBeans) {
        this.raidLogBeans = raidLogBeans;
    }
 
    public List<RaidLogBean> getPersonList() {
        return raidLogBeans;
    }
 
    public void setPersonList(List<RaidLogBean> raidLogBeans) {
        this.raidLogBeans = raidLogBeans;
    }
}
