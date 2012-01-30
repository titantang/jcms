package com.buaaer.jcms.domain;

import java.util.Date;

public class JobDefinition {
	private long id;
	private String name;
	private String command;
	private String parameter;
	private boolean runOnce;
	private String period;
	private Date firstTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public boolean isRunOnce() {
		return runOnce;
	}

	public void setRunOnce(boolean runOnce) {
		this.runOnce = runOnce;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public void setFirstTime(Date firstTime) {
		this.firstTime = firstTime;
	}

	public Date getFirstTime() {
		return firstTime;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

}
