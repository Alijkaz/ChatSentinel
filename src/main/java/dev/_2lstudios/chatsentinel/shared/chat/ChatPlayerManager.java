package dev._2lstudios.chatsentinel.shared.chat;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ChatPlayerManager {
    final private Map<UUID, ChatPlayer> chatPlayers = new HashMap<>();

    public ChatPlayer getPlayer(final UUID uuid) {
        ChatPlayer chatPlayer = chatPlayers.getOrDefault(uuid, null);

        if (chatPlayer == null) {
            chatPlayer = new ChatPlayer(uuid);
            chatPlayers.put(uuid, chatPlayer);
        }

        return chatPlayer;
    }
}