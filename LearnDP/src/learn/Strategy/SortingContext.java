package learn.Strategy;

public class SortingContext {
    private SortingStrategy strategy;
    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int[] array) {
        strategy.sort(array);
    }
}
