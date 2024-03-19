WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package dungeonmania.battles;

public class BattleRound {
    private double deltaSelfHealth;
    private double deltaTargetHealth;

    public BattleRound(double deltaSelfHealth, double deltaTargetHealth) {
        this.deltaSelfHealth = deltaSelfHealth;
        this.deltaTargetHealth = deltaTargetHealth;
    }

    public double getDeltaSelfHealth() {
        return deltaSelfHealth;
    }

    public double getDeltaTargetHealth() {
        return deltaTargetHealth;
    }
}
