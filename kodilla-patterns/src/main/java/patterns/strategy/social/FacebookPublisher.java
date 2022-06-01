package patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share(){
        System.out.println(":D hejo");
        return ":D hejo";
    }
}
