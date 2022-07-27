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
        boolean thorHammer=RPG_Game.random.nextBoolean();
        if (thorHammer){
            boss.setDamage(0);
            System.out.println("Boss оглушён");
        }else{
            boss.setDamage(50);
        }


            }
        }

