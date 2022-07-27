package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
    private boolean deafening;

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.DEAFENING);
    }

    public boolean isDeafening() {
        return deafening;
    }

    public void setDeafening(boolean deafening) {
        this.deafening = deafening;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (deafening) System.out.println("Босс получил оглушение от Тора и не может ударить. ");
        else {
            if (getHealth() > 0) {
                setHealth() = getHealth() + boss.getDamage();
                setHealth() = getHealth() - (boss.getHealth() + (boss.getDamage() / 5) * heroes.length) - (boss.getDamage() / 5);


            }
        }}}

