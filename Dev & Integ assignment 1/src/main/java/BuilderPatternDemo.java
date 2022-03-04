//This is the main method.
public class BuilderPatternDemo {
    public static void main(String[] args) {

        StageBuilder mealBuilder = new StageBuilder();

        Stage hardStage = mealBuilder.prepareHardStage();
        System.out.println("Hard Stage");
        hardStage.showEnemy();
        System.out.println("Total Challenge: " + hardStage.getCost());

        Stage easyStage = mealBuilder.prepareEasyStage();
        System.out.println("\n\nEasy Stage");
        easyStage.showEnemy();
        System.out.println("Total Challenge: " + easyStage.getCost());
    }
}
