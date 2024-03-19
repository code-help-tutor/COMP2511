WeChat: cstutorcs
QQ: 749389476
Email: tutorcs@163.com
package dungeonmania.entities;

import dungeonmania.Game;


public interface Interactable {
    public void interact(Player player, Game game);
    public boolean isInteractable(Player player);
}
