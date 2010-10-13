package com.rapidftr.services;

import com.rapidftr.utilities.SettingsStore;

public class Credential {

	private final String user;
	private final String pass;
	private final boolean offline;
	private final SettingsStore settingsStore;

	public Credential(String user, String pass, boolean offline, SettingsStore settingsStore) {
		this.user = user;
		// TODO Auto-generated constructor stub
		this.pass = pass;
		this.offline = offline;
		this.settingsStore = settingsStore;
	}

	public boolean isOffline() {
		return offline && settingsStore.isVerifiedUser();
	}

}
