package org.avp;

import org.avp.entities.living.EntityAethon;
import org.avp.entities.living.EntityAqua;
import org.avp.entities.living.EntityBabyhead;
import org.avp.entities.living.EntityBatXeno;
import org.avp.entities.living.EntityBelugaburster;
import org.avp.entities.living.EntityBelugamorph;
import org.avp.entities.living.EntityBoiler;
import org.avp.entities.living.EntityChestburster;
import org.avp.entities.living.EntityCombatSynthetic;
import org.avp.entities.living.EntityCrusher;
import org.avp.entities.living.EntityDeacon;
import org.avp.entities.living.EntityDeaconShark;
import org.avp.entities.living.EntityDracoEgg;
import org.avp.entities.living.EntityDracoburster;
import org.avp.entities.living.EntityDracomorph;
import org.avp.entities.living.EntityDrone;
import org.avp.entities.living.EntityEngineer;
import org.avp.entities.living.EntityFacehugger;
import org.avp.entities.living.EntityGooMutant;
import org.avp.entities.living.EntityHammerpede;
import org.avp.entities.living.EntityMarine;
import org.avp.entities.living.EntityMatriarch;
import org.avp.entities.living.EntityMyceliomorph;
import org.avp.entities.living.EntityOctohugger;
import org.avp.entities.living.EntityOvamorph;
import org.avp.entities.living.EntityPantheramorph;
import org.avp.entities.living.EntityPraetorian;
import org.avp.entities.living.EntityPredalien;
import org.avp.entities.living.EntityPredalienChestburster;
import org.avp.entities.living.EntityPredatorHound;
import org.avp.entities.living.EntityQueenChestburster;
import org.avp.entities.living.EntityRoyalFacehugger;
import org.avp.entities.living.EntityRunnerChestburster;
import org.avp.entities.living.EntityRunnerDrone;
import org.avp.entities.living.EntityRunnerWarrior;
import org.avp.entities.living.EntityScelemur;
import org.avp.entities.living.EntitySpaceJockey;
import org.avp.entities.living.EntitySpitter;
import org.avp.entities.living.EntityTrilobite;
import org.avp.entities.living.EntityUltramorph;
import org.avp.entities.living.EntityUrsuidae;
import org.avp.entities.living.EntityWarrior;
import org.avp.entities.living.EntityYautjaBerserker;
import org.avp.entities.living.EntityYautjaMutant;
import org.avp.entities.living.EntityYautjaWarrior;
import org.avp.item.ItemAPC;
import org.avp.item.ItemArmorMK50;
import org.avp.item.ItemArmorMarine;
import org.avp.item.ItemArmorPressureSuit;
import org.avp.item.ItemArmorTitanium;
import org.avp.item.ItemArmorXeno;
import org.avp.item.ItemDisc;
import org.avp.item.ItemEntitySummoner;
import org.avp.item.ItemFirearm;
import org.avp.item.ItemFirearm.Classification;
import org.avp.item.ItemFirearm.ItemAmmunition;
import org.avp.item.ItemGrenade;
import org.avp.item.ItemIngotLithium;
import org.avp.item.ItemLaserMine;
import org.avp.item.ItemM240IncineratorUnit;
import org.avp.item.ItemMaintenanceJack;
import org.avp.item.ItemPlasmaCannon;
import org.avp.item.ItemSevastopolFlamethrower;
import org.avp.item.ItemShuriken;
import org.avp.item.ItemSpear;
import org.avp.item.ItemStorageDevice;
import org.avp.item.ItemStunBaton;
import org.avp.item.ItemSupplyChute;
import org.avp.item.ItemSupplyChute.SupplyChuteType;
import org.avp.item.ItemWristbracer;
import org.avp.item.firearms.FirearmProfiles;

import com.arisux.mdx.lib.game.IdentityRemapModule;
import com.arisux.mdx.lib.game.ItemRegistrationHandler;
import com.arisux.mdx.lib.world.item.HookedItem;
import com.arisux.mdx.lib.world.item.ItemToolMaterialAxe;
import com.arisux.mdx.lib.world.item.ItemToolMaterialPickaxe;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ItemHandler extends ItemRegistrationHandler<AliensVsPredator>
{
    public Item helmXeno                 = new ItemArmorXeno(0, EntityEquipmentSlot.HEAD);
    public Item plateXeno                = new ItemArmorXeno(0, EntityEquipmentSlot.CHEST);
    public Item legsXeno                 = new ItemArmorXeno(0, EntityEquipmentSlot.LEGS);
    public Item bootsXeno                = new ItemArmorXeno(0, EntityEquipmentSlot.FEET);
    public Item pressureMask             = new ItemArmorPressureSuit(0, EntityEquipmentSlot.HEAD);
    public Item pressureChest            = new ItemArmorPressureSuit(0, EntityEquipmentSlot.CHEST);
    public Item pressurePants            = new ItemArmorPressureSuit(0, EntityEquipmentSlot.LEGS);
    public Item pressureBoots            = new ItemArmorPressureSuit(0, EntityEquipmentSlot.FEET);
    public Item mk50helmet               = new ItemArmorMK50(0, EntityEquipmentSlot.HEAD);
    public Item mk50body                 = new ItemArmorMK50(0, EntityEquipmentSlot.CHEST);
    public Item mk50pants                = new ItemArmorMK50(0, EntityEquipmentSlot.LEGS);
    public Item mk50boots                = new ItemArmorMK50(0, EntityEquipmentSlot.FEET);
    public Item helmMarine               = new ItemArmorMarine(0, EntityEquipmentSlot.HEAD);
    public Item plateMarine              = new ItemArmorMarine(0, EntityEquipmentSlot.CHEST);
    public Item legsMarine               = new ItemArmorMarine(0, EntityEquipmentSlot.LEGS);
    public Item bootsMarine              = new ItemArmorMarine(0, EntityEquipmentSlot.FEET);
    public Item helmTitanium             = new ItemArmorTitanium(0, EntityEquipmentSlot.HEAD);
    public Item plateTitanium            = new ItemArmorTitanium(0, EntityEquipmentSlot.CHEST);
    public Item legsTitanium             = new ItemArmorTitanium(0, EntityEquipmentSlot.LEGS);
    public Item bootsTitanium            = new ItemArmorTitanium(0, EntityEquipmentSlot.FEET);
    public Item shovelTitanium           = new ItemSpade(AliensVsPredator.materials().tools().celtic);
    public Item pickaxeTitanium          = new ItemToolMaterialPickaxe(AliensVsPredator.materials().tools().celtic);
    public Item axeTitanium              = new ItemToolMaterialAxe(AliensVsPredator.materials().tools().celtic);
    public Item swordTitanium            = new ItemSword(AliensVsPredator.materials().tools().celtic);
    public Item hoeTitanium              = new ItemHoe(AliensVsPredator.materials().tools().celtic);
    public Item itemSpear                = new ItemSpear(AliensVsPredator.materials().tools().celtic);
    public Item itemWristbracer          = new ItemWristbracer().setMaxStackSize(1);
    public Item itemWristbracerBlades    = new HookedItem().setMaxStackSize(1).setMaxDamage(AliensVsPredator.materials().tools().celtic.getMaxUses());
    public Item itemStunBaton			 = new ItemStunBaton();
    public Item itemPlasmaCannon         = new ItemPlasmaCannon().setFull3D();
    public Item itemProximityMine        = new ItemLaserMine();
    public Item itemDisc                 = new ItemDisc();
    public Item itemShuriken             = new ItemShuriken();
    public Item itemGrenade              = new ItemGrenade(false);
    public Item itemIncendiaryGrenade    = new ItemGrenade(true);
    public Item itemPistolStock          = new HookedItem().setMaxStackSize(64);
    public Item itemPistolBarrel         = new HookedItem().setMaxStackSize(64);
    public Item itemPistolAction         = new HookedItem().setMaxStackSize(64);
    public Item itemAmmoPistol           = new ItemAmmunition(Classification.PISTOL);
    public Item itemAmmoAR               = new ItemAmmunition(Classification.ASSAULT_RIFLE);
    public Item itemAmmoSMG              = new ItemAmmunition(Classification.SUB_MACHINE_GUN);
    public Item itemAmmoSniper           = new ItemAmmunition(Classification.RIFLE);
    public Item itemPropaneTank          = new HookedItem().setMaxStackSize(1).setMaxDamage(64);
    public Item itemM240ICU              = new ItemM240IncineratorUnit(itemPropaneTank);
    public Item itemSevastopolFlamethrower = new ItemSevastopolFlamethrower(itemPropaneTank);
    public Item itemPistol               = new ItemFirearm(FirearmProfiles.PISTOL);
    public Item itemM4                   = new ItemFirearm(FirearmProfiles.M4).setFull3D();
    public Item itemSniper               = new ItemFirearm(FirearmProfiles.SNIPER).setFull3D();
    public Item itemM41A                 = new ItemFirearm(FirearmProfiles.M41A).setFull3D();
    public Item itemM56SG                = new ItemFirearm(FirearmProfiles.M56SG).setFull3D();
    public Item itemAK47                 = new ItemFirearm(FirearmProfiles.AK47).setFull3D();
    public Item itemM4Stock              = new HookedItem().setMaxStackSize(64);
    public Item itemM4Barrel             = new HookedItem().setMaxStackSize(64);
    public Item itemM4Action             = new HookedItem().setMaxStackSize(64);
    public Item itemSniperStock          = new HookedItem().setMaxStackSize(64);
    public Item itemSniperBarrel         = new HookedItem().setMaxStackSize(64);
    public Item itemSniperAction         = new HookedItem().setMaxStackSize(64);
    public Item itemSniperScope          = new HookedItem().setMaxStackSize(64);
    public Item itemSniperPeripherals    = new HookedItem().setMaxStackSize(64);
    public Item itemM41AStock            = new HookedItem().setMaxStackSize(64);
    public Item itemM41ABarrel           = new HookedItem().setMaxStackSize(64);
    public Item itemM41AAction           = new HookedItem().setMaxStackSize(64);
    public Item itemM41APeripherals      = new HookedItem().setMaxStackSize(64);
    public Item itemM56SGStock           = new HookedItem().setMaxStackSize(64);
    public Item itemM56SGBarrel          = new HookedItem().setMaxStackSize(64);
    public Item itemM56SGAction          = new HookedItem().setMaxStackSize(64);
    public Item itemM56SGSupportFrame    = new HookedItem().setMaxStackSize(64);
    public Item itemM56SGAimingModule    = new HookedItem().setMaxStackSize(64);
    public Item itemAK47Stock            = new HookedItem().setMaxStackSize(64);
    public Item itemAK47Barrel           = new HookedItem().setMaxStackSize(64);
    public Item itemAK47Action           = new HookedItem().setMaxStackSize(64);
    public Item itemDoritos              = new ItemFood(8, true).setAlwaysEdible();
    public Item itemDoritosCoolRanch     = new ItemFood(8, true).setAlwaysEdible();
    public Item itemCapacitor            = new HookedItem().setMaxStackSize(64);
    public Item itemTransistor           = new HookedItem().setMaxStackSize(64);
    public Item itemRAM                  = new HookedItem().setMaxStackSize(64);
    public Item itemResistor             = new HookedItem().setMaxStackSize(64);
    public Item itemArtifactTech         = new HookedItem().setMaxStackSize(64);
    public Item itemProcessor            = new HookedItem();
    public Item itemSolidStateDrive      = new HookedItem();
    public Item itemDiode                = new HookedItem().setMaxStackSize(64);
    public Item itemMotherboard          = new HookedItem();
    public Item itemPowerSupply          = new HookedItem();
    public Item itemSupplyChute          = new ItemSupplyChute(SupplyChuteType.UNBRANDED);
    public Item itemSupplyChuteMarines   = new ItemSupplyChute(SupplyChuteType.MARINES);
    public Item itemSupplyChuteSeegson   = new ItemSupplyChute(SupplyChuteType.SEEGSON);
    public Item itemFlashDrive           = new ItemStorageDevice().setMaxStackSize(64);
    public Item itemVoltageRegulator     = new HookedItem().setMaxStackSize(64);
    public Item itemLed                  = new HookedItem().setMaxStackSize(64);
    public Item itemLedDisplay           = new HookedItem();
    public Item itemCarbon               = new HookedItem().setMaxStackSize(64);
    public Item itemIntegratedCircuit    = new HookedItem();
    public Item itemAPC                  = new ItemAPC();
    public Item itemSilicon              = new HookedItem();
    public Item itemIngotAluminum        = new HookedItem();
    public Item itemIngotCopper          = new HookedItem();
    public Item itemIngotLithium         = new ItemIngotLithium();
    public Item itemMotionTracker        = new HookedItem();
    public Item itemPolycarbonate        = new HookedItem();
    public Item itemRoyalJelly           = new HookedItem().setMaxStackSize(64);
    public Item itemBlackGoo             = new HookedItem();
    public Item itemPhial                = new HookedItem();
    public Item itemPhialEmpty           = new HookedItem();
    public Item itemChargePack           = new HookedItem().setMaxDamage(64).setMaxStackSize(1);
    public Item itemMaintenanceJack      = new ItemMaintenanceJack();
    public Item blackGooBucket           = new ItemBucket(AliensVsPredator.blocks().blackgoo);
    public Item mistBucket               = new ItemBucket(AliensVsPredator.blocks().mist);
    public Item securityTuner            = new HookedItem().setMaxStackSize(1);

    public Item summonerDrone            = new ItemEntitySummoner(EntityDrone.class);
    public Item summonerAqua             = new ItemEntitySummoner(EntityAqua.class);
    public Item summonerWarrior          = new ItemEntitySummoner(EntityWarrior.class);
    public Item summonerCrusher          = new ItemEntitySummoner(EntityCrusher.class);
    public Item summonerSpitter          = new ItemEntitySummoner(EntitySpitter.class);
    public Item summonerPraetorian       = new ItemEntitySummoner(EntityPraetorian.class);
    public Item summonerQueen            = new ItemEntitySummoner(EntityMatriarch.class);
    public Item summonerChestburster     = new ItemEntitySummoner(EntityChestburster.class);
    public Item summonerFacehugger       = new ItemEntitySummoner(EntityFacehugger.class);
    public Item summonerMarine           = new ItemEntitySummoner(EntityMarine.class);
    public Item summonerOvamorph         = new ItemEntitySummoner(EntityOvamorph.class);
    public Item summonerRoyalFacehugger  = new ItemEntitySummoner(EntityRoyalFacehugger.class);
    public Item summonerYautjaWarrior    = new ItemEntitySummoner(EntityYautjaWarrior.class);
    public Item summonerPredalien        = new ItemEntitySummoner(EntityPredalien.class);
    public Item summonerCombatSynthetic  = new ItemEntitySummoner(EntityCombatSynthetic.class);
    public Item summonerDeacon           = new ItemEntitySummoner(EntityDeacon.class);
    public Item summonerHammerpede       = new ItemEntitySummoner(EntityHammerpede.class);
    public Item summonerTrilobite        = new ItemEntitySummoner(EntityTrilobite.class);
    public Item summonerYautjaBerserker  = new ItemEntitySummoner(EntityYautjaBerserker.class);
    public Item summonerSpaceJockey      = new ItemEntitySummoner(EntitySpaceJockey.class);
    public Item summonerEngineer         = new ItemEntitySummoner(EntityEngineer.class);
    public Item summonerDeaconShark      = new ItemEntitySummoner(EntityDeaconShark.class);
    public Item summonerRunnerDrone      = new ItemEntitySummoner(EntityRunnerDrone.class);
    public Item summonerRunnerWarrior    = new ItemEntitySummoner(EntityRunnerWarrior.class);
    public Item summonerUltramorph       = new ItemEntitySummoner(EntityUltramorph.class);
    public Item summonerGooMutant        = new ItemEntitySummoner(EntityGooMutant.class);
    public Item summonerAethon           = new ItemEntitySummoner(EntityAethon.class);
    public Item summonerOctohugger       = new ItemEntitySummoner(EntityOctohugger.class);
    public Item summonerBelugaburster    = new ItemEntitySummoner(EntityBelugaburster.class);
    public Item summonerBelugamorph      = new ItemEntitySummoner(EntityBelugamorph.class);
    public Item summonerPredalienBurster = new ItemEntitySummoner(EntityPredalienChestburster.class);
    public Item summonerQueenBurster     = new ItemEntitySummoner(EntityQueenChestburster.class);
    public Item summonerRunnerBurster    = new ItemEntitySummoner(EntityRunnerChestburster.class);
    public Item summonerBabyhead         = new ItemEntitySummoner(EntityBabyhead.class);
    public Item summonerBatXeno          = new ItemEntitySummoner(EntityBatXeno.class);
    public Item summonerBoiler           = new ItemEntitySummoner(EntityBoiler.class);
    public Item summonerDracoburster     = new ItemEntitySummoner(EntityDracoburster.class);
    public Item summonerDracoEgg         = new ItemEntitySummoner(EntityDracoEgg.class);
    public Item summonerDracomorph       = new ItemEntitySummoner(EntityDracomorph.class);
    public Item summonerMyceliomorph     = new ItemEntitySummoner(EntityMyceliomorph.class);
    public Item summonerPantheramorph    = new ItemEntitySummoner(EntityPantheramorph.class);
    public Item summonerPredatorHound    = new ItemEntitySummoner(EntityPredatorHound.class);
    public Item summonerUrsuidae         = new ItemEntitySummoner(EntityUrsuidae.class);
    public Item summonerVardaMonkey      = new ItemEntitySummoner(EntityScelemur.class);
    public Item summonerYautjaMutant     = new ItemEntitySummoner(EntityYautjaMutant.class);

    public ItemHandler()
    {
        super(AliensVsPredator.instance());
    }

    @Override
    public void pre(FMLPreInitializationEvent event)
    {
        IdentityRemapModule.registerMappingInfo("summon.protomorph", "summon.deacon", AliensVsPredator.Properties.ID);
        IdentityRemapModule.registerMappingInfo("summon.yautja", "summon.yautja.warrior", AliensVsPredator.Properties.ID);

        register("summon.drone", summonerDrone).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.warrior", summonerWarrior).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.runner.drone", summonerRunnerDrone).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.runner.warrior", summonerRunnerWarrior).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.crusher", summonerCrusher).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.spitter", summonerSpitter).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.praetorian", summonerPraetorian).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.queen", summonerQueen).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.predalien", summonerPredalien).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.deacon", summonerDeacon).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.deaconshark", summonerDeaconShark).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.hammerpede", summonerHammerpede).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.trilobite", summonerTrilobite).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.engineer", summonerEngineer).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.spacejockey", summonerSpaceJockey).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.ovamorph", summonerOvamorph).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.facehugger", summonerFacehugger).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.royalfacehugger", summonerRoyalFacehugger).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.chestburster", summonerChestburster).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.yautja.warrior", summonerYautjaWarrior).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.yautja.berserker", summonerYautjaBerserker).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.marine", summonerMarine).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.synthetic.combat", summonerCombatSynthetic).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.aqua", summonerAqua).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.ultramorph", summonerUltramorph).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.goomutant", summonerGooMutant).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.aethon", summonerAethon).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.octohugger", summonerOctohugger).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.belugaburster", summonerBelugaburster).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.belugamorph", summonerBelugamorph).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.chestburster.predalien", summonerPredalienBurster).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.chestburster.queen", summonerQueenBurster).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.chestburster.runner", summonerRunnerBurster).setCreativeTab(AliensVsPredator.tabEntities());
        register("summon.babyhead", summonerBabyhead).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.batxeno", summonerBatXeno).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.boiler", summonerBoiler).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.dracoburster", summonerDracoburster).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.dracoegg", summonerDracoEgg).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.dracomorph", summonerDracomorph).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.myceliomorph", summonerMyceliomorph).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.pantheramorph", summonerPantheramorph).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.predatorhound", summonerPredatorHound).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.ursuidae", summonerUrsuidae).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.vardamonkey", summonerVardaMonkey).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());
        register("summon.yautjamutant", summonerYautjaMutant).setCreativeTab(AliensVsPredator.tabEntitiesIncomplete());

        register("helm.pressure", pressureMask).setCreativeTab(AliensVsPredator.tabMain());
        register("body.pressure", pressureChest).setCreativeTab(AliensVsPredator.tabMain());
        register("legwear.pressure", pressurePants).setCreativeTab(AliensVsPredator.tabMain());
        register("boots.pressure", pressureBoots).setCreativeTab(AliensVsPredator.tabMain());
        register("helm.mk50", mk50helmet).setCreativeTab(AliensVsPredator.tabMain());
        register("body.mk50", mk50body).setCreativeTab(AliensVsPredator.tabMain());
        register("legwear.mk50", mk50pants).setCreativeTab(AliensVsPredator.tabMain());
        register("boots.mk50", mk50boots).setCreativeTab(AliensVsPredator.tabMain());
        register("helm.tactical", helmMarine).setCreativeTab(AliensVsPredator.tabMain());
        register("body.tactical", plateMarine).setCreativeTab(AliensVsPredator.tabMain());
        register("legwear.tactical", legsMarine).setCreativeTab(AliensVsPredator.tabMain());
        register("boots.tactical", bootsMarine).setCreativeTab(AliensVsPredator.tabMain());
        register("helm.xeno", helmXeno).setCreativeTab(AliensVsPredator.tabMain());
        register("body.xeno", plateXeno).setCreativeTab(AliensVsPredator.tabMain());
        register("legwear.xeno", legsXeno).setCreativeTab(AliensVsPredator.tabMain());
        register("boots.xeno", bootsXeno).setCreativeTab(AliensVsPredator.tabMain());
        register("helm.celtic", helmTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("body.celtic", plateTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("legwear.celtic", legsTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("boots.celtic", bootsTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.m240icu", itemM240ICU).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.flamethrower.nostromo", itemSevastopolFlamethrower).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.pistol", itemPistol).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.m4", itemM4).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.sniper", itemSniper).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.m41a", itemM41A).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.m56sg", itemM56SG).setCreativeTab(AliensVsPredator.tabMain());
        register("gun.ak47", itemAK47).setCreativeTab(AliensVsPredator.tabMain());
        register("bucket.blackgoo", blackGooBucket).setCreativeTab(AliensVsPredator.tabMain());
        register("bucket.mist", mistBucket).setCreativeTab(AliensVsPredator.tabMain());
        register("ammo.ar", itemAmmoAR).setCreativeTab(AliensVsPredator.tabMain());
        register("ammo.pistol", itemAmmoPistol).setCreativeTab(AliensVsPredator.tabMain());
        register("ammo.smg", itemAmmoSMG).setCreativeTab(AliensVsPredator.tabMain());
        register("ammo.sniper", itemAmmoSniper).setCreativeTab(AliensVsPredator.tabMain());
        register("ammo.flamethrower", itemPropaneTank).setCreativeTab(AliensVsPredator.tabMain());
        register("grenade.m40", itemGrenade).setCreativeTab(AliensVsPredator.tabMain());
        register("grenade.incindiary", itemIncendiaryGrenade).setCreativeTab(AliensVsPredator.tabMain());
        register("wristblade", itemWristbracer).setCreativeTab(AliensVsPredator.tabMain());
        register("plasmacannon", itemPlasmaCannon).setCreativeTab(AliensVsPredator.tabMain());
        register("mine.laser", itemProximityMine).setCreativeTab(AliensVsPredator.tabMain());
        register("smartdisc", itemDisc).setCreativeTab(AliensVsPredator.tabMain());
        register("shuriken", itemShuriken).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.celtic.spear", itemSpear).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.celtic.shovel", shovelTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.celtic.sword", swordTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.celtic.hoe", hoeTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.celtic.axe", axeTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.celtic.pick", pickaxeTitanium).setCreativeTab(AliensVsPredator.tabMain());
        register("artifact.tech", itemArtifactTech).setCreativeTab(AliensVsPredator.tabMain());
        register("food.doritos", itemDoritos).setCreativeTab(AliensVsPredator.tabMain());
        register("food.doritos.coolranch", itemDoritosCoolRanch).setCreativeTab(AliensVsPredator.tabMain());
        register("device.nbtdrive", itemFlashDrive).setCreativeTab(AliensVsPredator.tabMain());
        register("device.supplychute", itemSupplyChute).setCreativeTab(AliensVsPredator.tabMain());
        register("device.supplychute.marines", itemSupplyChuteMarines).setCreativeTab(AliensVsPredator.tabMain());
        register("device.supplychute.seegson", itemSupplyChuteSeegson).setCreativeTab(AliensVsPredator.tabMain());

        register("part.pistol.stock", itemPistolStock).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.pistol.barrel", itemPistolBarrel).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.pistol.action", itemPistolAction).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.sniper.stock", itemSniperStock).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.sniper.barrel", itemSniperBarrel).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.sniper.action", itemSniperAction).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.sniper.scope", itemSniperScope).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.sniper.peripherals", itemSniperPeripherals).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m41a.stock", itemM41AStock).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m41a.action", itemM41AAction).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m41a.barrel", itemM41ABarrel).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m41a.peripherals", itemM41APeripherals).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m56sg.stock", itemM56SGStock).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m56sg.action", itemM56SGAction).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m56sg.barrel", itemM56SGBarrel).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m56sg.supportframe", itemM56SGSupportFrame).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m56sg.aimingmodule", itemM56SGAimingModule).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m4.stock", itemM4Stock).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m4.action", itemM4Action).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.m4.barrel", itemM4Barrel).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.ak47.action", itemAK47Action).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.ak47.stock", itemAK47Stock).setCreativeTab(AliensVsPredator.tabGunComponents());
        register("part.ak47.barrel", itemAK47Barrel).setCreativeTab(AliensVsPredator.tabGunComponents());

        register("part.processor", itemProcessor).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.solidstatedrive", itemSolidStateDrive).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.regulator", itemVoltageRegulator).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.capacitor", itemCapacitor).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.transistor", itemTransistor).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.motherboard", itemMotherboard).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.ram", itemRAM).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.resistor", itemResistor).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.led", itemLed).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.diode", itemDiode).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.ic", itemIntegratedCircuit).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.powersupply", itemPowerSupply).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("part.led.display", itemLedDisplay).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("ingot.copper", itemIngotCopper).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("ingot.lithium", itemIngotLithium).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("ingot.aluminum", itemIngotAluminum).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("silicon", itemSilicon).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("carbon", itemCarbon).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("apc", itemAPC).setCreativeTab(AliensVsPredator.tabMain());
        register("motiontracker", itemMotionTracker).setCreativeTab(AliensVsPredator.tabMain());
        register("wristbracer.blades", itemWristbracerBlades).setCreativeTab(AliensVsPredator.tabMain());
        register("stun.baton", itemStunBaton).setCreativeTab(AliensVsPredator.tabMain());
        register("polycarbonate", itemPolycarbonate).setCreativeTab(AliensVsPredator.tabRecipeItems());
        register("royaljelly", itemRoyalJelly).setCreativeTab(AliensVsPredator.tabMain());
        register("blackgoo.item", itemBlackGoo).setCreativeTab(AliensVsPredator.tabMain());
        register("phial.goo", itemPhial).setCreativeTab(AliensVsPredator.tabMain());
        register("phial.empty", itemPhialEmpty).setCreativeTab(AliensVsPredator.tabMain());
        register("chargepack", itemChargePack).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.maintenancejack", itemMaintenanceJack).setCreativeTab(AliensVsPredator.tabMain());
        register("tool.securitytuner", securityTuner).setCreativeTab(AliensVsPredator.tabMain());
    }
}
