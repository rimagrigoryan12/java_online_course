import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankArray {
    public static int[] arrayRankTransform(int[] arr) {
        // Шаг 1: Создаем копию массива и сортируем её
        int[] sortedArr = {40,10,20,30};
        Arrays.sort(sortedArr);

        // Шаг 2: Присваиваем ранги элементам
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank);
                rank++;
            }
        }

        // Шаг 3: Присваиваем ранги исходному массиву
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
