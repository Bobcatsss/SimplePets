package simplepets.brainsynder.nms.entities.v1_12_R1.list;

import net.minecraft.server.v1_12_R1.World;
import simplepets.brainsynder.nms.entities.type.IEntityIllusionerPet;
import simplepets.brainsynder.nms.entities.v1_12_R1.branch.EntityIllagerWizardPet;
import simplepets.brainsynder.pet.IPet;
import simplepets.brainsynder.utils.Size;

@Size(width = 0.6F, length = 1.95F)
public class EntityIllusionerPet extends EntityIllagerWizardPet implements IEntityIllusionerPet {
    public EntityIllusionerPet(World world) {
        super(world);
    }
    public EntityIllusionerPet(World world, IPet pet) {
        super(world, pet);
    }
}
