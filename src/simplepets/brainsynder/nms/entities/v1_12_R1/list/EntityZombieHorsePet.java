package simplepets.brainsynder.nms.entities.v1_12_R1.list;

import net.minecraft.server.v1_12_R1.World;
import simplepets.brainsynder.nms.entities.type.IEntityZombieHorsePet;
import simplepets.brainsynder.nms.entities.v1_12_R1.branch.EntityHorseChestedAbstractPet;
import simplepets.brainsynder.pet.IPet;
import simplepets.brainsynder.utils.Size;
import simplepets.brainsynder.wrapper.EntityWrapper;

@Size(width = 1.4F, length = 1.6F)
public class EntityZombieHorsePet extends EntityHorseChestedAbstractPet implements IEntityZombieHorsePet {
    public EntityZombieHorsePet(World world) {
        super(world);
    }
    public EntityZombieHorsePet(World world, IPet pet) {
        super(world, pet);
    }

    @Override
    public EntityWrapper getEntityType() {
        return EntityWrapper.ZOMBIE_HORSE;
    }
}
