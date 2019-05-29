package com.samples.others;

public class Version {
	private String fullVersion;
	private int majorVersion;
	private int minorVersion;
	private int patchVersion;
	
	public String getFullVersion() {
		return fullVersion;
	}
	public void setFullVersion(String fullVersion) {
		this.fullVersion = fullVersion;
	}
	public int getMajorVersion() {
		return majorVersion;
	}
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	public int getMinorVersion() {
		return minorVersion;
	}
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	public int getPatchVersion() {
		return patchVersion;
	}
	public void setPatchVersion(int patchVersion) {
		this.patchVersion = patchVersion;
	}
}
