package dami.Boj.Type.T1_그리디_알고리즘;

import java.io.*;

public class B1434_책_정리 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        String[] boxArr = br.readLine().split(" ");
        String[] bookArr = br.readLine().split(" ");

        int bookCount = 0;
        int boxCount = 0;

        for (String box : boxArr) {
            boxCount += Integer.parseInt(box);
        }

        for (String book : bookArr) {
            bookCount += Integer.parseInt(book);
        }

        bw.write(String.valueOf(boxCount - bookCount));
        bw.close();
    }*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        String[] boxArr = br.readLine().split(" ");
        String[] bookArr = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] boxes = new int[n];
        int[] books = new int[m];

        for (int i=0; i<n; i++) {
            boxes[i] = Integer.parseInt(boxArr[i]);
        }

        for (int i=0; i<m; i++) {
            books[i] = Integer.parseInt(bookArr[i]);
        }

        int result = 0;
        int i = 0, j = 0;   // i: 박스 번호, j: 책 번호
        while (true) {
            if (j == books.length) {
                break;
            }
            int value = boxes[i] - books[j];    // 현재 책이 현재 박스에 들어가는지 확인
            if (value >= 0) {   // box가 충분하면
                boxes[i] = value;
                j++;
            } else {    // 부족하면
                i++;
            }
        }

        for (int value : boxes) {
            result += value;
        }

        bw.write(String.valueOf(result));
        bw.close();
    }
}
