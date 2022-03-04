//This builds the parent class.
public class StageBuilder {
    public Stage prepareHardStage (){
        Stage stage = new Stage();
        stage.addEnemy(new Strong_Knight());
        stage.addEnemy(new Adult_Dragon());
        return stage;
    }

    public Stage prepareEasyStage (){
        Stage stage = new Stage();
        stage.addEnemy(new Weak_Knight());
        stage.addEnemy(new Young_Dragon());
        return stage;
    }
}
