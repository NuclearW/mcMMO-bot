package com.nuclearw.mcmmobot;

import java.util.HashMap;

import com.nuclearw.mcmmobot.commands.*;

public class Main {
	private static HashMap<String, Command> commands = new HashMap<String, Command>();

	private static Bot bot;

	public static void main(String[] args) throws Exception {
		Config.load();

		bot = new Bot();
		bot.connect(Config.host, Config.port, Config.password);
		for(String channel : Config.channels) {
			bot.joinChannel(channel);
		}

		if(Config.diffEnabled)
			commands.put("diff", new DiffCommand());
	}

	public static boolean isCommand(String command) {
		return commands.containsKey(command);
	}

	public static Command getCommand(String command) {
		return commands.get(command);
	}

	public static Bot getBot() {
		return bot;
	}
}
