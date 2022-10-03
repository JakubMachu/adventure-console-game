public class Enemie {
    private String nameOfEnemy;
    private int maxEnemyHealth;
    private int enemyAttackDamage;

    @Override
    public String toString() {
        return nameOfEnemy;
    }

    public String getNameOfEnemy() {
        return nameOfEnemy;
    }

    public int getMaxEnemyHealth() {
        return maxEnemyHealth;
    }

    public int getEnemyAttackDamage() {
        return enemyAttackDamage;
    }

    public void setNameOfEnemy(String nameOfEnemy) {
        this.nameOfEnemy = nameOfEnemy;
    }

    public void setMaxEnemyHealth(int maxEnemyHealth) {
        this.maxEnemyHealth = maxEnemyHealth;
    }

    public void setEnemyAttackDamage(int enemyAttackDamage) {
        this.enemyAttackDamage = enemyAttackDamage;
    }

    public Enemie(String nameOfEnemy, int maxEnemyHealth, int enemyAttackDamage) {
        this.nameOfEnemy = nameOfEnemy;
        this.maxEnemyHealth = maxEnemyHealth;
        this.enemyAttackDamage = enemyAttackDamage;

    }
}
class Warrior extends Enemie{
    public Warrior(String nameOfEnemy, int maxEnemyHealth, int enemyAttackDamage) {
        super(nameOfEnemy, maxEnemyHealth, enemyAttackDamage);
    }

}
class Skeleton extends Enemie{
    public Skeleton(String nameOfEnemy, int maxEnemyHealth, int enemyAttackDamage) {
        super(nameOfEnemy, maxEnemyHealth, enemyAttackDamage);
    }
}
class Wizard extends Enemie{
    public Wizard(String nameOfEnemy, int maxEnemyHealth, int enemyAttackDamage) {
        super(nameOfEnemy, maxEnemyHealth, enemyAttackDamage);
    }
}
class Zombie extends Enemie{
    public Zombie(String nameOfEnemy, int maxEnemyHealth, int enemyAttackDamage) {
        super(nameOfEnemy, maxEnemyHealth, enemyAttackDamage);
    }
}
class Assassin extends Enemie{
    public Assassin(String nameOfEnemy, int maxEnemyHealth, int enemyAttackDamage) {
        super(nameOfEnemy, maxEnemyHealth, enemyAttackDamage);
    }
}

