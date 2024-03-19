WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package dungeonmania.response.models;

/**
 * DO NOT CHANGE THIS FILE
 */
public class RoundResponse {
    private double deltaPlayerHealth;
    private double deltaEnemyHealth;

    public RoundResponse(double deltaPlayerHealth, double deltaEnemyHealth) {
        this.deltaPlayerHealth = deltaPlayerHealth;
        this.deltaEnemyHealth = deltaEnemyHealth;
    }

    public double getDeltaCharacterHealth() {
        return deltaPlayerHealth;
    }

    public double getDeltaEnemyHealth() {
        return deltaEnemyHealth;
    }

}
