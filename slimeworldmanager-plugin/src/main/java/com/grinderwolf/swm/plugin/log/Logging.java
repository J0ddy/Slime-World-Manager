package com.grinderwolf.swm.plugin.log;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Logging {

    public static final String COMMAND_PREFIX = ChatColor.AQUA + ChatColor.BOLD.toString() + "JOD.GG " + ChatColor.DARK_GRAY + "» ";
    private static final String CONSOLE_PREFIX = ChatColor.AQUA + "[SWM] ";

    public static void info(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.GRAY + message);
    }

    public static void warning(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.YELLOW + message);
    }

    public static void error(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.RED + message);
    }
}
