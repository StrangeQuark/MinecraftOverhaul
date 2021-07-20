package com.strangequark.quarkoverhaul;

import com.strangequark.quarkoverhaul.registry.ModTools;
import net.fabricmc.api.ModInitializer;

public class QuarkOverhaul implements ModInitializer
{
    public static final String MOD_ID = "qo";

    @Override
    public void onInitialize()
    {
        ModTools.registerTools();
    }
}
