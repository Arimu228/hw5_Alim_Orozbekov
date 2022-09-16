public class Hero {

    private int heroDamage;

    public int getHeroDamage() {
        return heroDamage;
    }

    public void setHeroDamage(int heroDamage) {
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth) {
        this.heroHealth = heroHealth;
    }

    public String getHeroAbility() {
        return heroAbility;
    }

    public void setHeroAbility(String heroAbility) {
        this.heroAbility = heroAbility;
    }

    private int heroHealth;
    private String heroAbility;

    public Hero( int heroHealth, int heroDamage, String heroAbility){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroAbility = heroAbility;

    }

    public Hero (int heroHealth, int heroDamage){
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

}
