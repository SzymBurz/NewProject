package patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share(){
        System.out.println("Na rynku świń dalej tragiczna sytuacja");
        return "Na rynku świń dalej tragiczna sytuacja";
    }
}
