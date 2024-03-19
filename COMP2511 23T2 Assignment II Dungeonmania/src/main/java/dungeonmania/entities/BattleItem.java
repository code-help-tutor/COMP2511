WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package dungeonmania.entities;

import dungeonmania.Game;
import dungeonmania.battles.BattleStatistics;

/**
 * Item has buff in battles
 */
public interface BattleItem {
    public BattleStatistics applyBuff(BattleStatistics origin);
    public void use(Game game);
    public int getDurability();
}
