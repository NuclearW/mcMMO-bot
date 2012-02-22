package com.nuclearw.mcmmobot.commands;

public abstract class Command {
	private String command;
	private String usage;

	/**
	 * @param channel Channel this command has come from
	 * @param sender Sender this command has come from
	 * @param args Arguments of command
	 * @return
	 */
	public boolean onCommand(String channel, String sender, String[] args) {
		return true;
	}

	public String getCommand() {
		return command;
	}

	public String getUsage() {
		return usage;
	}
}
