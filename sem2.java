import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class sem2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String text = iScanner.nextLine();
        iScanner.close();
        text = text.replaceAll("\\p{P}", "").replaceAll("\\s", " ");
        String[] textArr = text.split(" ");
        StringBuilder stringB = new StringBuilder();
        stringB.append("{'").append(textArr[0]).append("':'").append(textArr[1]).append("', '").append(textArr[2]).append("':'").append(textArr[3]).append("', '").append(textArr[4]).append("':'").append(textArr[5]).append("', '").append(textArr[6]).append("':'").append(textArr[7]).append("'}");
        System.out.println(stringB);
    }
}
