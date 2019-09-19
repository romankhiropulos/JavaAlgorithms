package Algorithms.Search;

/*  Binary Search - Бинарный поиск

    Алгоритм бинарного поиска представлен методом binarySearch,
    которому в качестве параметров передаются searchKey - число, а
    также отсортировнный массив Long[] array. Метод возвращает
    порядковый номер числа searchKey, если такое содержится в массиве,
    а если не содержится, то -1. Переменные lower и higher такие,
    что если ключ присутствует в массиве, то он находится в
    интервале array[lower..higher], и цикла, который проверяет
    средний элемент этого интервала(индекс mid). Если ключ равен
    array[mid], возвращается значение mid, иначе метод делит интер-
    вал пополам и просматривает левую половину, если ключ меньше
    array[mid], и правую - если больше. Этот процесс прекращается
    тогда, когда ключ найден или интервал пуст. Эффективность
    бинарного поиска объясняется тем, что ему необходимо прове-
    рить лишь несколько элементов массива(по сравнению с размером
    всего массива), чтобы обнаружить ключ или его отсутствие.

    */
public class BinarySearch extends AbstractSearch {

    @Override
    int doSearch(Long searchKey, Long[] array) {
        int lower = 0;
        int higher = array.length - 1;

        // Key находится в array[lower .. higher] или отсутствует.
        while (lower <= higher) {
            int mid = lower + (higher - lower) / 2;
            if (searchKey < array[mid]) {
                higher = mid - 1;
            } else if (searchKey > array[mid]) {
                lower = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
