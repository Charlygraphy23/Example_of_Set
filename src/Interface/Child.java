package Interface;

public class Child  implements Father ,Mother{
    @Override
    public void tall() {
        System.out.println("The Baby is Tall like his Father");
    }

    @Override
    public void healthy() {
        System.out.println("Baby is healthy like his Father");
    }

    @Override
    public void nose() {
        System.out.println("The Baby gets his Nose like his Mother");
    }

    @Override
    public void eyes() {
        System.out.println("The Baby is gets his eyes like his Mother");
    }
}
