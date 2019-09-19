package Algorithms.Search;

public abstract class AbstractSearch {

    public static final int SIZE = 50_000_000;

    public Long[] array = new Long[SIZE];

    abstract int doSearch(Long searchKey, Long[] array);

    public int search(Long searchKey) {
        return doSearch(searchKey, this.getArray());
    }

    public Long[] getArray() {
        return array;
    }
}
