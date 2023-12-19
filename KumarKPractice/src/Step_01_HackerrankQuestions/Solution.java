package Step_01_HackerrankQuestions;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'jimOrders' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY orders as parameter.
     */

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
     Scanner sc = new Scanner(System.in);
  

        Map<Integer, Integer> additionCusto = new HashMap<>();
        int [] s = new int[orders.size()];
        for(int i=0;i<orders.size();i++) {
            int sum =0;
            for(int j=0;j<2;j++) {
                if(j!=1) {
                sum = orders.get(i).get(j)+orders.get(i).get(j+1);
                }
            }
            s[i]=sum;
            additionCusto.put(sum, i+1);
            
        }
        System.out.println(additionCusto);
        List<Integer> values = new ArrayList<>(additionCusto.values());       
        return values;

    }

}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\SelfStudy\\Java\\Training\\Eclipse_practice\\KumarK\\DSA_Learning\\KumarKPractice\\src\\Step_01_HackerrankQuestions\\OUTPUT_PATH.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> orders = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                orders.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.jimOrders(orders);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
