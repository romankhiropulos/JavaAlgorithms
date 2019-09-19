package Algorithms.Search;

/*  Linear Search - Линейный поиск

    Не подходит для поиска среди большого количества
    информации (массив с миллионом чисел), так как требуется
    слишком много времени на выполнение поиска

    */
public class LinearSearch extends AbstractSearch {

    @Override
    int doSearch(Long searchKey, Long[] array) {
        for (int i = 0; i < array.length; i++) {
            if (searchKey.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }
}
