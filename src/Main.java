import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);

        Integer sum = list.stream().reduce(Integer::sum).get();
        System.out.println("\nsumma: " + sum);

        Integer arif = Math.toIntExact(list.stream().count());
        System.out.println("arithmetic mean: " + ((double)sum / arif) + "\n");

        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(x->x, x->1,Integer::sum));

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + ": " + m.getValue() + " time repeated");
        }
    }
}