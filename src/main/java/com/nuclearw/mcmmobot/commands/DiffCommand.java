package com.nuclearw.mcmmobot.commands;

import com.nuclearw.mcmmobot.Config;
import com.nuclearw.mcmmobot.Main;

@SuppressWarnings("unused")
public class DiffCommand extends Command {
	private String command = "diff";
	private String usage = "diff (sha)";

	@Override
	public boolean onCommand(String channel, String sender, String[] args) {
		Main.getBot().sendMessage(channel, Config.gitHubBase + "compare/mcMMO-dev:master^...mcMMO-Dev:master");
		return true;
	}
}
