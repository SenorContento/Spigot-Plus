package io.github.robotman3000.bukkit.multiworld.world.command;

import io.github.robotman3000.bukkit.multiworld.world.WorldManagerHelper;
import io.github.robotman3000.bukkit.multiworld.world.WorldPropertyList;
import io.github.robotman3000.bukkit.spigotplus.api.JavaPluginCommand;
import io.github.robotman3000.bukkit.spigotplus.api.command.CommandParameter;
import io.github.robotman3000.bukkit.spigotplus.api.command.EnumParameter;
import io.github.robotman3000.bukkit.spigotplus.api.command.StringParameter;
import io.github.robotman3000.bukkit.spigotplus.api.command.WorldParameter;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class WorldPropertyCommand extends JavaPluginCommand {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	return WorldManagerHelper.getPropertyCommandResult(sender, command, label, args, "property", getParameters().get(1));
    }
    
    @Override
    protected void initializeParameters(
    		List<CommandParameter<?>> commandParameters2) {
    	commandParameters2.add(new WorldParameter("World"));
    	commandParameters2.add(new EnumParameter<>("World Property", WorldPropertyList.class));
    	commandParameters2.add(new StringParameter("New Value"));
    }

}
