package com.nuclearw.mcmmobot;

import java.util.ArrayList;
import java.util.List;

public class Config {
	public static String prefix;

	public static String nick, host, password, gitHubOwner, gitHubProject, gitHubBase;

	public static List<String> channels;

	public static int port;

	public static boolean ssl, diffEnabled;

	public static void load() {
		// TODO: Load
		gitHubBase = "https://github.com/" + gitHubOwner + "/" + gitHubProject + "/";
	}
}
