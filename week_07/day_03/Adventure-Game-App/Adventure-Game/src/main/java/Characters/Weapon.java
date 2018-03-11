package Characters;

public enum Weapon {

    SWORD(100, true, 10, true ),
    STAFF(10, true, 5, true),
    BLESSED_SCEPTER(-200, true, 100, true),
    CLAWS(2500, false, 30, true),
    DEFAULT(0, false, 0, false);

    int weaponDamage;
    boolean parryable;
    Integer threatIncrease;
    boolean canParry;


    Weapon(int weaponDamage, boolean parryable, Integer threatIncrease, boolean canParry) {
        this.weaponDamage = weaponDamage;
        this.parryable = parryable;
        this.threatIncrease = threatIncrease;
        this.canParry = canParry;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public boolean isParryable() {
        return parryable;
    }

    public Integer getThreatIncrease() {
        return threatIncrease;
    }

    public boolean isCanParry() {
        return canParry;
    }
}
