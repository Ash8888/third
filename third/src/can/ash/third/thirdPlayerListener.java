package com.bukkit.Arius_james.third;

import java.io.*;
import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.*;
import org.bukkit.material.MaterialData;
import org.bukkit.*;
import org.bukkit.ChatColor;





/**
* Handle events for all Player related events
* @author Arius_james
*/
public class thirdPlayerListener extends PlayerListener {
private final third plugin;

public thirdPlayerListener(third instance) {
plugin = instance;
}

public void onPlayerCommand(PlayerChatEvent event) {
Player players = event.getPlayer();
String[] message = event.getMessage().split("" "");
if(message[0].equalsIgnoreCase(""/clearinventory"")) {
players.getInventory().clear();
}
}



}
