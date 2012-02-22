package com.nuclearw.mcmmobot;

import org.jibble.pircbot.PircBot;

import com.nuclearw.mcmmobot.commands.Command;

public class Bot extends PircBot {
	public Bot() {
		this.setName(Config.nick);
	}

	@Override
	protected void onMessage(String channel, String sender, String login, String hostname, String message) {
		if(!message.startsWith(Config.prefix)) return;

		String[] split = message.split(" ");
		if(split.length <= 0) return;
		if(split[0].length() == 1) return;

		String commandName = split[0].substring(1);

		if(!Main.isCommand(commandName)) {
			this.sendMessage(channel, commandName + " is not a valid command.");
			return;
		}

		String[] args = new String[split.length-1];

		for(int i = 1; i < split.length; i++) {
			args[i-1] = split[i]; 
		}

		Command command = Main.getCommand(commandName);
		if(command == null) return;

		boolean usedProperly = command.onCommand(channel, sender, args);

		if(!usedProperly) {
			this.sendMessage(channel, sender + ", correct usage is: " + command.getUsage());
		}
	}
}
