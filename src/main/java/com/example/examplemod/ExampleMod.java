package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("examplemod")
public class ExampleMod {
    public ExampleMod() {
        if (testpkg.Test.class.getClassLoader() != getClass().getClassLoader()) {
            throw new RuntimeException("Expected classloader " + getClass().getClassLoader() + " but got " + testpkg.Test.class.getClassLoader());
        }
    }
}
