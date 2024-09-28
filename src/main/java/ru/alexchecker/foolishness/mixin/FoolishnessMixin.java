package ru.alexchecker.foolishness.mixin;

import com.moulberry.axiom.ClientEvents;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = ClientEvents.class, remap = false)
public class FoolishnessMixin {
    @Redirect(method = "lambda$register$22" ,at= @At(value = "FIELD",target = "allowedOnServer:Z", opcode = Opcodes.GETSTATIC))
    private static boolean getallowedOnServer()
    {
        return true;
    }


    @Redirect(method = "lambda$register$22" ,at= @At(value = "FIELD",target = "remotelyDisabled:Z", opcode = Opcodes.GETSTATIC))
    private static boolean getmodDisabled()
    {
        return false;
    }

    @Redirect(method = "hasServerCommercialLicense", at = @At(value = "FIELD", target = "Lcom/moulberry/axiom/ClientEvents;serverCommercialLicense:Z", opcode = Opcodes.GETSTATIC))
    private static boolean getServerLicense()
    {
        return true;
    }
}
