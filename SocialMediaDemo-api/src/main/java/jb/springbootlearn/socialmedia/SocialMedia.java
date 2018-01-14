package jb.springbootlearn.socialmedia;

public class SocialMedia {
	
	private String appType;
	private String appName;
	private String appDesc;
	
	public SocialMedia() {
		
	}
	public SocialMedia(String appType, String appName, String appDesc) {
		super();
		this.appType = appType;
		this.appName = appName;
		this.appDesc = appDesc;
	}
	public String getAppType() {
		return appType;
	}
	public void setAppType(String appType) {
		this.appType = appType;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppDesc() {
		return appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	
	
}
