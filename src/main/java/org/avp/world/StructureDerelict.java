package org.avp.world;

import org.avp.AliensVsPredator;

import com.arisux.mdxlib.lib.world.Pos;
import com.arisux.mdxlib.lib.world.Structure;

import net.minecraft.world.WorldServer;

public class StructureDerelict extends Structure
{
    @Override
    public String getName()
    {
        return "Derelict";
    }

    public StructureDerelict(WorldServer world, Pos data)
    {
        super(AliensVsPredator.schematics().derelict, world, data);
    }

    @Override
    public void onProcessing()
    {
        ;
    }

    @Override
    public void onProcessingComplete()
    {
        ;
    }
}
