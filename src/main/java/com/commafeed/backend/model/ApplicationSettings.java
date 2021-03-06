package com.commafeed.backend.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "APPLICATIONSETTINGS")
@SuppressWarnings("serial")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ApplicationSettings extends AbstractModel {

	private String publicUrl;

	/**
	 * Wether registrations are open
	 */
	private boolean allowRegistrations = false;

	private String googleAnalyticsTrackingCode;
	private String googleAnalyticsDomainName;

	private String googleClientId;
	private String googleClientSecret;
	private int backgroundThreads = 3;

	private String smtpHost;
	private int smtpPort;
	private boolean smtpTls;
	private String smtpUserName;
	private String smtpPassword;

	public String getPublicUrl() {
		return publicUrl;
	}

	public void setPublicUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}

	public boolean isAllowRegistrations() {
		return allowRegistrations;
	}

	public void setAllowRegistrations(boolean allowRegistrations) {
		this.allowRegistrations = allowRegistrations;
	}

	public String getGoogleClientId() {
		return googleClientId;
	}

	public void setGoogleClientId(String googleClientId) {
		this.googleClientId = googleClientId;
	}

	public String getGoogleClientSecret() {
		return googleClientSecret;
	}

	public void setGoogleClientSecret(String googleClientSecret) {
		this.googleClientSecret = googleClientSecret;
	}

	public int getBackgroundThreads() {
		return backgroundThreads;
	}

	public void setBackgroundThreads(int backgroundThreads) {
		this.backgroundThreads = backgroundThreads;
	}

	public String getSmtpHost() {
		return smtpHost;
	}

	public void setSmtpHost(String smtpHost) {
		this.smtpHost = smtpHost;
	}

	public int getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(int smtpPort) {
		this.smtpPort = smtpPort;
	}

	public boolean isSmtpTls() {
		return smtpTls;
	}

	public void setSmtpTls(boolean smtpTls) {
		this.smtpTls = smtpTls;
	}

	public String getSmtpUserName() {
		return smtpUserName;
	}

	public void setSmtpUserName(String smtpUserName) {
		this.smtpUserName = smtpUserName;
	}

	public String getSmtpPassword() {
		return smtpPassword;
	}

	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}

	public String getGoogleAnalyticsTrackingCode() {
		return googleAnalyticsTrackingCode;
	}

	public void setGoogleAnalyticsTrackingCode(
			String googleAnalyticsTrackingCode) {
		this.googleAnalyticsTrackingCode = googleAnalyticsTrackingCode;
	}

	public String getGoogleAnalyticsDomainName() {
		return googleAnalyticsDomainName;
	}

	public void setGoogleAnalyticsDomainName(String googleAnalyticsDomainName) {
		this.googleAnalyticsDomainName = googleAnalyticsDomainName;
	}

}
