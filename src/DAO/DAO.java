package DAO;

import Entity.Entity;
import MrScanner.MrScanner;
import View.View;

import java.util.ArrayList;
import java.util.Scanner;

public class DAO {
    ArrayList<Entity> wiseList = new ArrayList<Entity>();
    View view = new View();
    MrScanner sc = new MrScanner();
    int id = 1;
    public void create() {
        String says;
        String author;
        view.println("명언 : ");
        says = sc.stringInput();
        view.println("작자 : ");
        author = sc.stringInput();
        view.println(id + "번 명언이 등록되었습니다.");
        Entity input = new Entity(id, says, author);

        wiseList.add(input);

        id++;
    }

    public void list() {
        view.println("번호          작자          명언");
        view.println("==============================");
        int i = 0;
        while (i < wiseList.size()) {
            view.println(wiseList.get(i).getList());
            i++;
        }
        view.println("==============================");
    }

    public void delete() {
        view.println("삭제할 정보 id를 입력해 주세요.");
        int number = sc.intInput();
        try {
            if(wiseList.get(number-1)!=null) {
                wiseList.remove(number - 1);
                view.println(number + "번 명언이 삭제되었습니다.");
            }
        } catch (IndexOutOfBoundsException e) {
            view.println(number + "번 명언은 존재하지 않습니다.");
        }
    }

    public void edit() {
        view.println("수정할 정보 id를 입력하세요.");
        int number = Integer.parseInt(sc.stringInput());
        view.println(wiseList.get(number -1).getList());
        view.println("명령을 입력하세요");
        while (true) {
            view.println("명령");
            view.println("작가 수정 / 명언 수정 / 취소");
            String editOrder = sc.stringInput();
            switch (editOrder) {
                case "작가 수정" :
                    System.out.println("작자(기존) : " + wiseList.get(number - 1).getAuthor());
                    System.out.println("작자");
                    String authorTemp = sc.stringInput();
                    String newSays = wiseList.get(number - 1).getSays();
                    Entity editAuthor = new Entity(number,newSays,authorTemp);
                    wiseList.set(number-1,editAuthor);
                    break;
                case "명언 수정" :
                    System.out.println("명언(기존) : " + wiseList.get(number - 1).getSays());
                    System.out.println("명언");
                    String sayTemp = sc.stringInput();
                    String author = wiseList.get(number - 1).getAuthor();
                    Entity editSays = new Entity(number,sayTemp,author);
                    wiseList.set(number-1,editSays);
                    break;
                case "취소" :
                    System.out.println("수정을 취소합니다");
                    return;
            }
        }
    }
}
