package ru.alexchecker.foolishness;

import com.moulberry.axiom.Axiom;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.impl.util.log.Log;
import net.fabricmc.loader.impl.util.log.LogCategory;

import java.util.logging.Logger;

public class Foolishness implements ModInitializer {

    @Override
    public void onInitialize() {
        Log.info(LogCategory.LOG," Now you cn use Axiom in multiplayer without license. MY ASS, MOULBERRIE'S FACE! AHAHAHAHHAHAHAHAHAHAHAHAHA!!!");
        //((FoolsAccessor) Axiom.getInstance()).setHasCommercialLicense(true);
    }
}
