package 쓰레드게임만들기;

import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("강력한 체력과 물리공격력의 전사 이름을 정하세요 : ");
        String warriorName = sc.nextLine();
        System.out.print("궁극의 마법능력을 지닌 마법사 이름을 정하세요 : ");
        String wizardName = sc.nextLine();
        Character warrior = new Character(warriorName, 8, 2, 0.8, 0.5, 40, 500);
        Character wizard = new Character(wizardName, 2, 28, 0.5, 0.9, 180, 250);
        GameThA gamethA = new GameThA(warrior, wizard);
        GameThB gamethB = new GameThB(warrior, wizard);
        gamethA.start();
        gamethB.start();
    }
}
