package com.massivecraft.factions.integration.herochat;

import com.dthielke.herochat.Channel;
import com.dthielke.herochat.SpamTracker;
import com.dthielke.herochat.TagFormatter;
import com.massivecraft.factions.Rel;
import com.massivecraft.factions.entity.MConf;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.*;

public class ChannelFactionsFaction extends ChannelFactionsAbstract
{
	public static final Set<Rel> targetRelations = EnumSet.of(Rel.MEMBER, Rel.RECRUIT);
	@Override public Set<Rel> getTargetRelations() { return targetRelations; }
	
	@Override public String getName() { return MConf.get().herochatFactionName; }
	
	@Override public String getNick() { return MConf.get().herochatFactionNick; }
	@Override public void setNick(String nick) { MConf.get().herochatFactionNick = nick; }
	
	@Override public String getFormat() { return MConf.get().herochatFactionFormat; }

	@Override
	public Set<UUID> getModeratorsUUID() {
		return Collections.emptySet();
	}

	@Override
	public Set<UUID> getMutesUUID() {
		return Collections.emptySet();
	}

	@Override public void setFormat(String format) { MConf.get().herochatFactionFormat = format; }

	@Override
	public void setModerator(UUID uuid, boolean b) {

	}

	@Override
	public void setModeratorsUUID(Set<UUID> set) {

	}

	@Override
	public void setMuted(UUID uuid, boolean b) {

	}

	@Override
	public void setMutesUUID(Set<UUID> set) {

	}

	@Override public ChatColor getColor() { return MConf.get().herochatFactionColor; }
	@Override public void setColor(ChatColor color) { MConf.get().herochatFactionColor = color; }
	
	@Override public int getDistance() { return MConf.get().herochatFactionDistance; }
	@Override public void setDistance(int distance) { MConf.get().herochatFactionDistance = distance; }
	
	@Override public void addWorld(String world) { MConf.get().herochatFactionWorlds.add(world); }

	@Override
	public Set<UUID> getBansUUID() {
		return Collections.emptySet();
	}

	@Override public Set<String> getWorlds() { return new HashSet<>(MConf.get().herochatFactionWorlds); }

	@Override
	public boolean isBanned(UUID uuid) {
		return false;
	}

	@Override public void setWorlds(Set<String> worlds) { MConf.get().herochatFactionWorlds = worlds; }
	
	@Override public boolean isShortcutAllowed() { return MConf.get().herochatFactionIsShortcutAllowed; }

	@Override
	public boolean isCrossServer() {
		return false;
	}

	@Override
	public SpamTracker getSpamTracker() {
		return null;
	}

	@Override
	public int getSpamMessageLimit() {
		return 0;
	}

	@Override
	public int getSpamMessageLimitBuildOff() {
		return 0;
	}

	@Override
	public void setSpamMessageLimit(int i) {

	}

	@Override
	public void setSpamMessageLimitBuildOff(int i) {

	}

	@Override
	public void setBanned(UUID uuid, boolean b) {

	}

	@Override
	public void setBansUUID(Set<UUID> set) {

	}

	@Override public void setShortcutAllowed(boolean shortcutAllowed) { MConf.get().herochatFactionIsShortcutAllowed = shortcutAllowed; }
	
	@Override public boolean isCrossWorld() { return MConf.get().herochatFactionCrossWorld; }

	@Override
	public boolean isModerator(UUID uuid) {
		return false;
	}

	@Override
	public boolean isMuted(UUID uuid) {
		return false;
	}

	@Override public void setCrossWorld(boolean crossWorld) { MConf.get().herochatFactionCrossWorld = crossWorld; }

	@Override
	public void setCrossServer(boolean b, boolean b1) {

	}

	@Override public boolean isMuted() { return MConf.get().herochatFactionMuted; }

	@Override
	public boolean addTag(String s, TagFormatter tagFormatter) {
		return false;
	}

	@Override public void setMuted(boolean value) { MConf.get().herochatFactionMuted = value; }

	@Override
	public String formatTag(String s, Player player, Channel channel) {
		return "";
	}
}
