package io.github.emmathemartian.cosmicomputers;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class CosmicomputersMod implements ModInitializer {
    public static final String MOD_ID = "cosmicomputers";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Cosmicomputers Loaded!");
    }
}
