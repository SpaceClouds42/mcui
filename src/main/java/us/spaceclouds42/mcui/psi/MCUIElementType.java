package us.spaceclouds42.mcui.psi;

import com.intellij.psi.tree.IElementType;
import us.spaceclouds42.mcui.MCUILanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MCUIElementType extends IElementType {

    public MCUIElementType(@NotNull @NonNls String debugName) {
        super(debugName, MCUILanguage.INSTANCE);
    }

}
