package dami.Step.Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S2_B10950_APlusB {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        ArrayList<List> arrList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());

            if (list.size() == 2) {
                arrList.add(list);
                list = new ArrayList<>();
            }
            if (arrList.size() == T) {
                break;
            }
        }

        for (List l : arrList) {
            System.out.println((int)l.get(0) + (int)l.get(1));
        }
    }
}
