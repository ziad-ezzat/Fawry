package learn.Strategy;

public class StrategyMain {
    public static void main(String[] args)
    {
        int[] array = { 5, 2, 9, 1, 5, 6 };

        SortingContext sortingContext = new SortingContext();

        sortingContext.setStrategy(new BubbleSort());
        sortingContext.sort(array);

        sortingContext.setStrategy(new QuickSort());
        sortingContext.sort(array);

        sortingContext.setStrategy(new MergeSort());
        sortingContext.sort(array);
    }
}
