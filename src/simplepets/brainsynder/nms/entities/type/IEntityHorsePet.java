package simplepets.brainsynder.nms.entities.type;

import simplepets.brainsynder.nms.entities.type.main.IHorseAbstract;
import simplepets.brainsynder.wrapper.HorseArmorType;
import simplepets.brainsynder.wrapper.HorseColorType;
import simplepets.brainsynder.wrapper.HorseStyleType;

public interface IEntityHorsePet extends IHorseAbstract {
    @Deprecated
    default void setVariant(HorseColorType var1){}

    HorseArmorType getArmor();

    void setArmor(HorseArmorType var1);

    HorseStyleType getStyle();

    void setStyle(HorseStyleType var1);

    HorseColorType getColor();

    void setColor(HorseColorType var1);
}
