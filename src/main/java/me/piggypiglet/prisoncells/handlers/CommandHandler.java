package me.piggypiglet.prisoncells.handlers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import static me.piggypiglet.prisoncells.handlers.CommandHandler.Strings.*;

// ------------------------------
// Copyright (c) PiggyPiglet 2017
// https://www.piggypiglet.me
// ------------------------------
public class CommandHandler implements CommandExecutor {
    private static CommandHandler instance;

    public static CommandHandler getInstance() {
        return instance;
    }

    enum Strings {
        SUB,
        ONE,
        TWO
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        switch (Strings) {
            case SUB:

        }
        return true;
    }
}
