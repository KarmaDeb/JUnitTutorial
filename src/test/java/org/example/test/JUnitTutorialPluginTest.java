package org.example.test;

import be.seeseemelk.mockbukkit.Coordinate;
import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import be.seeseemelk.mockbukkit.WorldMock;
import be.seeseemelk.mockbukkit.block.BlockMock;
import be.seeseemelk.mockbukkit.entity.PlayerMock;
import org.bukkit.Material;
import org.example.JUnitTutorialPlugin;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitTutorialPluginTest {

    private ServerMock server;

    @BeforeEach
    public void setUp() {
        server = MockBukkit.mock();
        MockBukkit.load(JUnitTutorialPlugin.class);
    }

    @Test
    public void testSomeFeature() {
        WorldMock world = server.addSimpleWorld("world");
        BlockMock block = world.createBlock(
                new Coordinate(0, 0, 0)
        );
        block.setType(Material.BAMBOO_BLOCK);

        PlayerMock player = server.addPlayer();
        player.breakBlock(block);

        assertEquals(Material.DIRT, block.getType());
    }

    @AfterEach
    public void tearDown()
    {
        MockBukkit.unmock();
    }
}
