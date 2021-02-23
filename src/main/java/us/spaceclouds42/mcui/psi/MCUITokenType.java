package us.spaceclouds42.mcui.psi;

import com.intellij.psi.tree.IElementType;
import us.spaceclouds42.mcui.MCUILanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MCUITokenType extends IElementType {

    public MCUITokenType(@NotNull @NonNls String debugName) {
        super(debugName, MCUILanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MCUITokenType." + super.toString();
    }

}
