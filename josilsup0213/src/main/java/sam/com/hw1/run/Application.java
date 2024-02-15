package sam.com.hw1.run;

import sam.com.hw1.controller.LibraryManager;
import sam.com.hw1.model.dto.Member;
import sam.com.hw1.view.LibraryMenu;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        LibraryMenu lm  = new LibraryMenu();
        lm.mainMenu();
    }
}
