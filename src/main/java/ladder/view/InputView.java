package ladder.view;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    public List<String> names() {
        Scanner sc = new Scanner(System.in);
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String nameList = sc.nextLine();
        List<String> arrayString = Arrays.asList(nameList.split(","));
        for (String str: arrayString) {
            if (str.length() > 5) // 이름 최대 5글자
                throw new IllegalArgumentException("자동차 이름은 5자 이하여야 합니다.");
        }
        return arrayString;
    }

    public int height() {
        Scanner sc = new Scanner(System.in);
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        int height = sc.nextInt();

        return height;
    }


}
