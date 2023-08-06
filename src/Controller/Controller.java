package Controller;

import DAO.DAO;
import MrScanner.MrScanner;
import View.View;

public class Controller {
    View view = new View();
    MrScanner sc = new MrScanner();
    DAO dao = new DAO();

    public void start() {
        view.println("== 명언 앱 ==");
        while (true) {
            view.println("종료 / 등록 / 목록 / 삭제 / 수정");
            view.println("명령 : ");
            switch (sc.stringInput()) {
                case "종료":
                    view.println("종료합니다");
                    return;
                case "등록":
                    dao.create();
                    break;
                case "목록":
                    dao.list();
                    break;
                case "삭제":
                    dao.delete();
                    break;
                case "수정":
                    dao.edit();
                    break;
            }
        }
    }
}
