package org.avp;

import org.avp.entities.mob.EntityAethon;
import org.avp.entities.mob.EntityAqua;
import org.avp.entities.mob.EntityChestburster;
import org.avp.entities.mob.EntityCombatSynthetic;
import org.avp.entities.mob.EntityCrusher;
import org.avp.entities.mob.EntityDeaconShark;
import org.avp.entities.mob.EntityDrone;
import org.avp.entities.mob.EntityEngineer;
import org.avp.entities.mob.EntityFacehugger;
import org.avp.entities.mob.EntityGooMutant;
import org.avp.entities.mob.EntityHammerpede;
import org.avp.entities.mob.EntityMarine;
import org.avp.entities.mob.EntityOvamorph;
import org.avp.entities.mob.EntityPraetorian;
import org.avp.entities.mob.EntityPredalien;
import org.avp.entities.mob.EntityProtomorph;
import org.avp.entities.mob.EntityQueen;
import org.avp.entities.mob.EntityRoyalFacehugger;
import org.avp.entities.mob.EntityRunnerDrone;
import org.avp.entities.mob.EntityRunnerWarrior;
import org.avp.entities.mob.EntitySpaceJockey;
import org.avp.entities.mob.EntitySpitter;
import org.avp.entities.mob.EntityTrilobite;
import org.avp.entities.mob.EntityUltramorph;
import org.avp.entities.mob.EntityWarrior;
import org.avp.entities.mob.EntityYautja;
import org.avp.entities.mob.EntityYautjaBerserker;
import org.avp.items.ItemAPC;
import org.avp.items.ItemArmorMarine;
import org.avp.items.ItemArmorPressureSuit;
import org.avp.items.ItemArmorTitanium;
import org.avp.items.ItemArmorXeno;
import org.avp.items.ItemDisc;
import org.avp.items.ItemEntitySummoner;
import org.avp.items.ItemFirearm;
import org.avp.items.ItemFirearm.ItemAmmo;
import org.avp.items.ItemGrenade;
import org.avp.items.ItemIngotLithium;
import org.avp.items.ItemLaserMine;
import org.avp.items.ItemM240IncineratorUnit;
import org.avp.items.ItemMaintenanceJack;
import org.avp.items.ItemNostromoFlamethrower;
import org.avp.items.ItemPlasmaCaster;
import org.avp.items.ItemShuriken;
import org.avp.items.ItemSpear;
import org.avp.items.ItemStorageDevice;
import org.avp.items.ItemSupplyChute;
import org.avp.items.ItemWristbracer;

import com.arisux.amdxlib.lib.game.Game;
import com.arisux.amdxlib.lib.game.IInitEvent;
import com.arisux.amdxlib.lib.world.item.HookedItem;
import com.arisux.amdxlib.lib.world.item.ItemToolMaterialAxe;
import com.arisux.amdxlib.lib.world.item.ItemToolMaterialPickaxe;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

public class ItemHandler implements IInitEvent
{
    public static final ItemHandler instance                    = new ItemHandler();

    public Item                     helmXeno                    = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 0));
    public Item                     plateXeno                   = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 1));
    public Item                     legsXeno                    = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 2));
    public Item                     bootsXeno                   = (new ItemArmorXeno(AliensVsPredator.materials().armors().chitin, 4, 3));
    public Item                     pressureMask                = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 0);
    public Item                     pressureChest               = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 1);
    public Item                     pressurePants               = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 2);
    public Item                     pressureBoots               = new ItemArmorPressureSuit(AliensVsPredator.materials().armors().pressuresuit, 4, 3);
    public Item                     helmMarine                  = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 0));
    public Item                     plateMarine                 = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 1));
    public Item                     legsMarine                  = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 2));
    public Item                     bootsMarine                 = (new ItemArmorMarine(AliensVsPredator.materials().armors().kevlar, 4, 3));
    public Item                     helmTitanium                = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 0));
    public Item                     legsTitanium                = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 2));
    public Item                     plateTitanium               = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 1));
    public Item                     bootsTitanium               = (new ItemArmorTitanium(AliensVsPredator.materials().armors().celtic, 4, 3));
    public Item                     shovelTitanium              = (new ItemSpade(AliensVsPredator.materials().tools().celtic));
    public Item                     pickaxeTitanium             = (new ItemToolMaterialPickaxe(AliensVsPredator.materials().tools().celtic));
    public Item                     axeTitanium                 = (new ItemToolMaterialAxe(AliensVsPredator.materials().tools().celtic));
    public Item                     swordTitanium               = (new ItemSword(AliensVsPredator.materials().tools().celtic));
    public Item                     hoeTitanium                 = (new ItemHoe(AliensVsPredator.materials().tools().celtic));
    public Item                     itemSpear                   = (new ItemSpear(AliensVsPredator.materials().tools().celtic));
    public Item                     itemWristBlade              = (new ItemWristbracer()).setDescription("Applies " + ItemWristbracer.getDamageToApply() + " damage to any entity, regardless of their armor, while blades are inserted.").setMaxStackSize(1);
    public Item                     itemWristbracerBlades       = (new HookedItem()).disableIcon().setDescription("Place these in the first slot of your wristbracer").setMaxStackSize(1).setMaxDurability(AliensVsPredator.materials().tools().celtic.getMaxUses());
    public Item                     itemPlasmaCaster            = (new ItemPlasmaCaster()).setFull3D();
    public Item                     itemProximityMine           = (new ItemLaserMine());
    public Item                     itemDisc                    = (new ItemDisc());
    public Item                     itemShuriken                = (new ItemShuriken());
    public Item                     itemGrenade                 = (new ItemGrenade(false));
    public Item                     itemIncendiaryGrenade       = (new ItemGrenade(true));
    public Item                     itemAmmoPistol              = ((HookedItem) (new ItemAmmo(1.0F))).setDescription("A magazine classified for use with pistols.");
    public Item                     itemPistolStock             = (new HookedItem()).disableIcon().setDescription("A Pistol stock for use in assembling pistols.").setMaxStackSize(64);
    public Item                     itemPistolBarrel            = (new HookedItem()).disableIcon().setDescription("A Pistol barrel for use in assembling pistols.").setMaxStackSize(64);
    public Item                     itemPistolAction            = (new HookedItem()).disableIcon().setDescription("A Pistol action for use in assembling pistols.").setMaxStackSize(64);
    public Item                     itemAmmoAR                  = ((HookedItem) (new ItemAmmo(2.0F))).setDescription("A magazine classified for use with assault rifles.");
    public Item                     itemAmmoAC                  = ((HookedItem) (new ItemAmmo(2.5F))).setDescription("A magazine classified for use with assault carbines.");
    public Item                     itemAmmoSMG                 = ((HookedItem) (new ItemAmmo(4.5F))).setDescription("A magazine classified for use with sub machine-guns.");
    public Item                     itemAmmoSniper              = ((HookedItem) (new ItemAmmo(18.0F))).setDescription("A magazine classified for use with sniper rifles.");
    public Item                     itemFuelTank                = (new HookedItem()).setDescription("Pressurized fuel tank.").setMaxStackSize(1).setMaxDurability(64);
    public Item                     itemM240ICU                 = (new ItemM240IncineratorUnit(itemFuelTank)).disableIcon().setDescription("M240 Incinerator Unit");
    public Item                     itemNostromoFlamethrower    = (new ItemNostromoFlamethrower(itemFuelTank)).disableIcon().setDescription("Flame Thrower (Nostromo)");
    public Item                     itemPistol                  = (new ItemFirearm(12, 2.0F, 15, 120, (ItemAmmo) itemAmmoPistol, Sounds.SOUND_WEAPON_GUNSHOT));
    public Item                     itemM4                      = (new ItemFirearm(24, 0.5F, 3, 120, (ItemAmmo) itemAmmoAR, Sounds.SOUND_WEAPON_GUNSHOT).setSoundLength(0.75D).disableIcon()).setFull3D();
    public Item                     itemM4Stock                 = (new HookedItem()).disableIcon().setDescription("An M4 stock for use in assembling M4's.").setMaxStackSize(64);
    public Item                     itemM4Barrel                = (new HookedItem()).disableIcon().setDescription("An M4 barrel for use in assembling M4's.").setMaxStackSize(64);
    public Item                     itemM4Action                = (new HookedItem()).disableIcon().setDescription("An M4 action for use in assembling M4's.").setMaxStackSize(64);
    public Item                     itemSniper                  = (new ItemFirearm(6, 1.8F, 40, 150, (ItemAmmo) itemAmmoSniper, Sounds.SOUND_WEAPON_SNIPER).disableIcon()).setFull3D();
    public Item                     itemSniperStock             = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle stock for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item                     itemSniperBarrel            = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle barrel for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item                     itemSniperAction            = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle action for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item                     itemSniperScope             = (new HookedItem()).disableIcon().setDescription("A Sniper Rifle scope for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item                     itemSniperPeripherals       = (new HookedItem()).disableIcon().setDescription("Sniper Rifle peripherals for use in assembling Sniper Rifle's.").setMaxStackSize(64);
    public Item                     itemM41A                    = (new ItemFirearm(99, 0.5F, 2, 120, (ItemAmmo) itemAmmoAC, Sounds.SOUND_WEAPON_PULSERIFLE).setSoundLength(1.25D).disableIcon()).setFull3D();
    public Item                     itemM41AStock               = (new HookedItem()).disableIcon().setDescription("An M41A stock for use in assembling M41A's.").setMaxStackSize(64);
    public Item                     itemM41ABarrel              = (new HookedItem()).disableIcon().setDescription("An M41A barrel for use in assembling M41A's.").setMaxStackSize(64);
    public Item                     itemM41AAction              = (new HookedItem()).disableIcon().setDescription("An M41A action for use in assembling M41A's.").setMaxStackSize(64);
    public Item                     itemM41APeripherals         = (new HookedItem()).disableIcon().setDescription("M41A peripherals for use in assembling M41A's.").setMaxStackSize(64);
    public Item                     itemM56SG                   = (new ItemFirearm(128, 0.2F, 2, 120, (ItemAmmo) itemAmmoSMG, Sounds.SOUND_WEAPON_M56SG).disableIcon()).setFull3D();
    public Item                     itemM56SGStock              = (new HookedItem()).disableIcon().setDescription("An M56SG stock for use in assembling M56SG's.").setMaxStackSize(64);
    public Item                     itemM56SGBarrel             = (new HookedItem()).disableIcon().setDescription("An M56SG barrel for use in assembling M56SG's.").setMaxStackSize(64);
    public Item                     itemM56SGAction             = (new HookedItem()).disableIcon().setDescription("An M56SG action for use in assembling M56SG's.").setMaxStackSize(64);
    public Item                     itemM56SGSupportFrame       = (new HookedItem()).disableIcon().setDescription("An M56SG support frame for use in assembling M56SG's.").setMaxStackSize(64);
    public Item                     itemM56SGAimingModule       = (new HookedItem()).disableIcon().setDescription("An M56SG aiming module for use in assembling M56SG's.").setMaxStackSize(64);
    public Item                     itemAK47                    = (new ItemFirearm(32, 0.6F, 3, 110, (ItemAmmo) itemAmmoAR, Sounds.SOUND_WEAPON_GUNSHOT).disableIcon()).setFull3D();
    public Item                     itemAK47Stock               = (new HookedItem()).disableIcon().setDescription("An AK47 stock for use in assembling AK-47's").setMaxStackSize(64);
    public Item                     itemAK47Barrel              = (new HookedItem()).disableIcon().setDescription("An AK47 barrel for use in assembling AK-47's.").setMaxStackSize(64);
    public Item                     itemAK47Action              = (new HookedItem()).disableIcon().setDescription("An AK47 action for use in assembling AK-47's.").setMaxStackSize(64);
    public Item                     itemDoritos                 = (new ItemFood(8, true)).setAlwaysEdible();
    public Item                     itemDoritosCoolRanch        = (new ItemFood(8, true)).setAlwaysEdible();
    public Item                     itemCapacitor               = (new HookedItem()).setDescription("An electrical component used to store energy temporarily.").setMaxStackSize(64);
    public Item                     itemTransistor              = (new HookedItem()).setDescription("A semiconductor used to amplify or switch signals and power.").setMaxStackSize(64);
    public Item                     itemRAM                     = (new HookedItem()).setMaxStackSize(64);
    public Item                     itemResistor                = (new HookedItem()).setDescription("An electrical component that reduces current flow.").setMaxStackSize(64);
    public Item                     itemArtifactTech            = (new HookedItem()).setDescription("An unknown piece of technology acquired from the Yautja species.").setMaxStackSize(64);
    public Item                     itemProcessor               = (new HookedItem()).setDescription("CPU");
    public Item                     itemSolidStateDrive         = (new HookedItem());
    public Item                     itemDiode                   = (new HookedItem()).setDescription("An electrical component that conducts in one direction.").setMaxStackSize(64);
    public Item                     itemMotherboard             = (new HookedItem());
    public Item                     itemPowerSupply             = (new HookedItem());
    public Item                     itemSupplyChute             = new ItemSupplyChute().disableIcon();
    public Item                     itemFlashDrive              = (new ItemStorageDevice()).setDescription("Strange Engineer technology, found at snowy elevations.").setMaxStackSize(64);
    public Item                     itemVoltageRegulator        = (new HookedItem()).setDescription("An electrical component that maintains a constant voltage level.").setMaxStackSize(64);
    public Item                     itemLed                     = (new HookedItem()).setMaxStackSize(64);
    public Item                     itemLedDisplay              = (new HookedItem());
    public Item                     itemCarbon                  = (new HookedItem()).setDescription("Used in the crafting of several electrical components.").setMaxStackSize(64);
    public Item                     itemIntegratedCircuit       = (new HookedItem());
    public Item                     itemAPC                     = new ItemAPC().disableIcon();
    public Item                     itemSilicon                 = new HookedItem().setDescription("A few chunks of silicon, for use with electronics.");
    public Item                     itemIngotAluminum           = new HookedItem().setDescription("An ingot melted down from bauxite ore, for use with guns.");
    public Item                     itemIngotCopper             = new HookedItem().setDescription("An ingot melted down from copper ore, for use with electronics.");
    public Item                     itemIngotLithium            = ((HookedItem) new ItemIngotLithium()).setDescription("An ingot of lithium. Depletes quickly after processing.");
    public Item                     itemMotionTracker           = ((HookedItem) (new HookedItem()).disableIcon()).setDescription("Tracks movement by detecting changes in air density.");
    public Item                     itemPolycarbonate           = (new HookedItem()).setDescription("Polycarbonate (A hard plastic used in the crafting of many items/blocks)");
    public Item                     itemRoyalJelly              = (new HookedItem()).setDescription("Royal Jelly (A potent, transformative substance produced by a Xenomorph Queen)").setMaxStackSize(64);
    public Item                     itemBlackGoo                = (new HookedItem()).setDescription("Black Goo (A0-3959X.91 ? 15)");
    public Item                     itemPhial                   = (new HookedItem()).setDescription("A mysterious substance fills this phial");
    public Item                     itemPhialEmpty              = (new HookedItem()).setDescription("An empty glass container of unknown origin");
    public Item                     itemMaintenanceJack         = (new ItemMaintenanceJack()).setDescription("Used to manually pry open blast doors.");
    public Item                     blackGooBucket              = (new ItemBucket(AliensVsPredator.blocks().blockBlackGoo));
    public Item                     mistBucket                  = (new ItemBucket(AliensVsPredator.blocks().blockMist));
    public ItemEntitySummoner       itemSummonerDrone           = (new ItemEntitySummoner(EntityDrone.class));
    public ItemEntitySummoner       itemSummonerAqua            = (new ItemEntitySummoner(EntityAqua.class));
    public ItemEntitySummoner       itemSummonerWarrior         = (new ItemEntitySummoner(EntityWarrior.class));
    public ItemEntitySummoner       itemSummonerCrusher         = (new ItemEntitySummoner(EntityCrusher.class));
    public ItemEntitySummoner       itemSummonerSpitter         = (new ItemEntitySummoner(EntitySpitter.class));
    public ItemEntitySummoner       itemSummonerPraetorian      = (new ItemEntitySummoner(EntityPraetorian.class));
    public ItemEntitySummoner       itemSummonerQueen           = (new ItemEntitySummoner(EntityQueen.class));
    public ItemEntitySummoner       itemSummonerChestburster    = (new ItemEntitySummoner(EntityChestburster.class));
    public ItemEntitySummoner       itemSummonerFacehugger      = (new ItemEntitySummoner(EntityFacehugger.class));
    public ItemEntitySummoner       itemSummonerMarine          = (new ItemEntitySummoner(EntityMarine.class));
    public ItemEntitySummoner       itemSummonerOvamorph        = (new ItemEntitySummoner(EntityOvamorph.class));
    public ItemEntitySummoner       itemSummonerRoyalFacehugger = (new ItemEntitySummoner(EntityRoyalFacehugger.class));
    public ItemEntitySummoner       itemSummonerYautja          = (new ItemEntitySummoner(EntityYautja.class));
    public ItemEntitySummoner       itemSummonerPredalien       = (new ItemEntitySummoner(EntityPredalien.class));
    public ItemEntitySummoner       itemSummonerCombatSynthetic = (new ItemEntitySummoner(EntityCombatSynthetic.class));
    public ItemEntitySummoner       itemSummonerProtomorph      = (new ItemEntitySummoner(EntityProtomorph.class));
    public ItemEntitySummoner       itemSummonerHammerpede      = (new ItemEntitySummoner(EntityHammerpede.class));
    public ItemEntitySummoner       itemSummonerTrilobite       = (new ItemEntitySummoner(EntityTrilobite.class));
    public ItemEntitySummoner       itemSummonerYautjaBerserker = (new ItemEntitySummoner(EntityYautjaBerserker.class));
    public ItemEntitySummoner       itemSummonerSpaceJockey     = (new ItemEntitySummoner(EntitySpaceJockey.class));
    public ItemEntitySummoner       itemSummonerEngineer        = (new ItemEntitySummoner(EntityEngineer.class));
    public ItemEntitySummoner       itemSummonerDeaconShark     = (new ItemEntitySummoner(EntityDeaconShark.class));
    public ItemEntitySummoner       itemSummonerRunnerDrone     = (new ItemEntitySummoner(EntityRunnerDrone.class));
    public ItemEntitySummoner       itemSummonerRunnerWarrior   = (new ItemEntitySummoner(EntityRunnerWarrior.class));
    public ItemEntitySummoner       itemSummonerUltramorph      = (new ItemEntitySummoner(EntityUltramorph.class));
    public ItemEntitySummoner       itemSummonerGooMutant       = (new ItemEntitySummoner(EntityGooMutant.class));
    public ItemEntitySummoner       itemSummonerAethon          = (new ItemEntitySummoner(EntityAethon.class));

    @Override
    public void init(FMLInitializationEvent event)
    {
        Game.register(AliensVsPredator.ID, itemSummonerDrone, "summon.drone").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerWarrior, "summon.warrior").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerRunnerDrone, "summon.runner.drone").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerRunnerWarrior, "summon.runner.warrior").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerCrusher, "summon.crusher").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerSpitter, "summon.spitter").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerPraetorian, "summon.praetorian").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerQueen, "summon.queen").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerPredalien, "summon.predalien").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerProtomorph, "summon.protomorph").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerDeaconShark, "summon.deaconshark").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerHammerpede, "summon.hammerpede").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerTrilobite, "summon.trilobite").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerEngineer, "summon.engineer").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerSpaceJockey, "summon.spacejockey").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerOvamorph, "summon.ovamorph").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerFacehugger, "summon.facehugger").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerRoyalFacehugger, "summon.royalfacehugger").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerChestburster, "summon.chestburster").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerYautja, "summon.yautja").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerYautjaBerserker, "summon.yautja.berserker").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerMarine, "summon.marine").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerCombatSynthetic, "summon.synthetic.combat").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerAqua, "summon.aqua").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerUltramorph, "summon.ultramorph").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerGooMutant, "summon.goomutant").setCreativeTab(AliensVsPredator.tabEntities());
        Game.register(AliensVsPredator.ID, itemSummonerAethon, "summon.aethon").setCreativeTab(AliensVsPredator.tabEntities());

        Game.register(AliensVsPredator.ID, pressureMask, "helm.pressure").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, pressureChest, "body.pressure").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, pressurePants, "legwear.pressure").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, pressureBoots, "boots.pressure").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, helmMarine, "helm.tactical").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, plateMarine, "body.tactical").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, legsMarine, "legwear.tactical").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, bootsMarine, "boots.tactical").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, helmXeno, "helm.xeno").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, plateXeno, "body.xeno").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, legsXeno, "legwear.xeno").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, bootsXeno, "boots.xeno").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, helmTitanium, "helm.celtic").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, plateTitanium, "body.celtic").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, legsTitanium, "legwear.celtic").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, bootsTitanium, "boots.celtic").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemM240ICU, "gun.m240icu").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemNostromoFlamethrower, "gun.flamethrower.nostromo").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemPistol, "gun.pistol").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemM4, "gun.m4").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemSniper, "gun.sniper").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemM41A, "gun.m41a").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemM56SG, "gun.m56sg").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemAK47, "gun.ak47").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, blackGooBucket, "bucket.blackgoo").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, mistBucket, "bucket.mist").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemAmmoAR, "ammo.ar").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemAmmoAC, "ammo.ac").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemAmmoPistol, "ammo.pistol").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemAmmoSMG, "ammo.smg").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemAmmoSniper, "ammo.sniper").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemFuelTank, "ammo.flamethrower").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemGrenade, "grenade.m40").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemIncendiaryGrenade, "grenade.incindiary").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemWristBlade, "wristblade").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemPlasmaCaster, "plasmacaster").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemProximityMine, "mine.laser").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemDisc, "smartdisc").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemShuriken, "shuriken").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemSpear, "tool.celtic.spear").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, shovelTitanium, "tool.celtic.shovel").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, swordTitanium, "tool.celtic.sword").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, hoeTitanium, "tool.celtic.hoe").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, axeTitanium, "tool.celtic.axe").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, pickaxeTitanium, "tool.celtic.pick").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemArtifactTech, "artifact.tech").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemDoritos, "food.doritos").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemDoritosCoolRanch, "food.doritos.coolranch").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemFlashDrive, "device.nbtdrive").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemSupplyChute, "device.supplychute").setCreativeTab(AliensVsPredator.tabMain());

        Game.register(AliensVsPredator.ID, itemPistolStock, "part.pistol.stock").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemPistolBarrel, "part.pistol.barrel").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemPistolAction, "part.pistol.action").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemSniperStock, "part.sniper.stock").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemSniperBarrel, "part.sniper.barrel").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemSniperAction, "part.sniper.action").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemSniperScope, "part.sniper.scope").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemSniperPeripherals, "part.sniper.peripherals").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM41AStock, "part.m41a.stock").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM41AAction, "part.m41a.action").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM41ABarrel, "part.m41a.barrel").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM41APeripherals, "part.m41a.peripherals").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM56SGStock, "part.m56sg.stock").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM56SGAction, "part.m56sg.action").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM56SGBarrel, "part.m56sg.barrel").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM56SGSupportFrame, "part.m56sg.supportframe").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM56SGAimingModule, "part.m56sg.aimingmodule").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM4Stock, "part.m4.stock").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM4Action, "part.m4.action").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemM4Barrel, "part.m4.barrel").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemAK47Action, "part.ak47.action").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemAK47Stock, "part.ak47.stock").setCreativeTab(AliensVsPredator.tabGunComponents());
        Game.register(AliensVsPredator.ID, itemAK47Barrel, "part.ak47.barrel").setCreativeTab(AliensVsPredator.tabGunComponents());

        Game.register(AliensVsPredator.ID, itemProcessor, "part.processor").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemSolidStateDrive, "part.solidstatedrive").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemVoltageRegulator, "part.regulator").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemCapacitor, "part.capacitor").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemTransistor, "part.transistor").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemMotherboard, "part.motherboard").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemRAM, "part.ram").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemResistor, "part.resistor").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemLed, "part.led").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemDiode, "part.diode").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemIntegratedCircuit, "part.ic").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemPowerSupply, "part.powersupply").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemLedDisplay, "part.led.display").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemIngotCopper, "ingot.copper").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemIngotLithium, "ingot.lithium").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemIngotAluminum, "ingot.aluminum").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemSilicon, "silicon").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemCarbon, "carbon").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemAPC, "apc").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemMotionTracker, "motiontracker").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemWristbracerBlades, "wristbracer.blades").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemPolycarbonate, "polycarbonate").setCreativeTab(AliensVsPredator.tabRecipeItems());
        Game.register(AliensVsPredator.ID, itemRoyalJelly, "royaljelly").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemBlackGoo, "blackgoo.item").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemPhial, "phial.goo").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemPhialEmpty, "phial.empty").setCreativeTab(AliensVsPredator.tabMain());
        Game.register(AliensVsPredator.ID, itemMaintenanceJack, "tool.maintenancejack").setCreativeTab(AliensVsPredator.tabMain());
    }
}
