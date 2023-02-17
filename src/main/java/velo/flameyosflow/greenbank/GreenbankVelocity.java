package velo.flameyosflow.greenbank;

import com.google.inject.Inject;

import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.player.ServerConnectedEvent;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;



import lombok.Getter;

import java.io.File;
import java.nio.file.Path;

@Plugin(id = "GreenbankVelocity",
        name = "GreenbankVelocity",
        version = "1.0.0 build 1",
        description = "The newest and most optimized economy plugin for your server, made specifically for Velocity.",
        authors = {"FlameyosFlow"})
public class GreenbankVelocity {
    @Getter private static GreenbankVelocity instance;
    @NotNull @Getter private final Logger logger;
    @NotNull @Getter private final ProxyServer server;
    @Getter private final Path pathDataDirectory;
    @Getter private final File fileDataDirectory;

    @Inject
    public GreenbankVelocity(@NotNull Logger logger, @NotNull ProxyServer server, @DataDirectory Path dataDirectory) {
        this.logger = logger;
        this.server = server;
        this.pathDataDirectory = dataDirectory;
        this.fileDataDirectory = pathDataDirectory.toFile();
    }

    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        instance = this;
        // H
    }

    @Subscribe
    public void onPlayerJoinServer(ServerConnectedEvent event) {
        // TODO: check for player on join
        // H
    }
}
