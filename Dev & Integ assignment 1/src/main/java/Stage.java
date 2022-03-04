//This is the parent class.
import java.util.ArrayList;
import java.util.List;

public class Stage {
    private List<Enemy> enemies = new ArrayList<Enemy>();

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Enemy enemy : enemies) {
            cost += enemy.challenge();
        }
        return cost;
    }

    public void showEnemy(){

        for (Enemy enemy : enemies) {
            System.out.print("Item : " + enemy.name());
            System.out.print(", Weapon : " + enemy.weapon().weapon());
            System.out.println(", Price : " + enemy.challenge());
        }
    }
}
