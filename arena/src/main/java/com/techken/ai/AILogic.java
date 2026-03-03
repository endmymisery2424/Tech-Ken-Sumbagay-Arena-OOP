package com.techken.ai;

import com.techken.model.BaseCharacter;
import com.techken.skills.BaseSkill;
import com.techken.skills.actions.GuardAction;
import com.techken.skills.actions.HealthStealDamageAction;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AILogic {

    private final Random random = new Random();

    /**
     
     * 1. If its health is below 30%, it will look for a defensive or health-stealing skill.
     * 2. If no such skill is available or health is not low, it will choose a random skill.
     *
     * @param cpuCharacter The character controlled by the AI.
     * @param opponentCharacter The opponent character (currently unused, but available for more complex AI).
     * @return The {@link BaseSkill} the AI has decided to use. Returns {@code null} if the character has no skills.
     */
    public BaseSkill selectAction(BaseCharacter cpuCharacter, BaseCharacter opponentCharacter) {
        // Note: This implementation assumes the BaseCharacter class has public methods
        // like `getSkills()`, `getHealth()`, and `getMaxHealth()`.
        BaseSkill[] availableSkills = cpuCharacter.getSkills();

        if (availableSkills == null || availableSkills.length == 0) {
            return null; // No skills to choose from
        }

        // If health is low, try to find a defensive or healing move.
        if (cpuCharacter.getHealth() <= cpuCharacter.getMaxHealth() * 0.3) {
            List<BaseSkill> defensiveSkills = new ArrayList<>();
            for (BaseSkill skill : availableSkills) {
          //     if (skill instanceof HealthStealDamageAction || skill instanceof GuardAction) {
                    defensiveSkills.add(skill);
                }
            }
        //    if (!defensiveSkills.isEmpty()) {
          //      return defensiveSkills.get(random.nextInt(defensiveSkills.size()));
         //   }
      //  }

        // Otherwise, pick a random skill.
        return availableSkills[random.nextInt(availableSkills.length)];
    }
}
