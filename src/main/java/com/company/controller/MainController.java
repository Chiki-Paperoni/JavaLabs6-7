package com.company.controller;

import com.company.Computer;
import com.company.Device;
import com.company.Handler;
import com.company.Laptop;
import com.company.Observer.MyObserver;
import com.company.servises.DevisesServise;
import com.company.views.View;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Scanner;

public class MainController implements AbstractController {
    private final Scanner scanner = new Scanner(System.in);
    private DevisesServise servise;
    private MyObserver observer = MyObserver.getInstance();
    private View view = new View();
    int id = 10;
    //PROXY
    public MainController(DevisesServise servise) {
        this.servise = servise;
        for(Device d : servise.getComputers()) {
//            Computer c1 = new Computer();
//            ClassLoader classLoader = c1.getClass().getClassLoader();
//            Class<?>[] interfaces = c1.getClass().getInterfaces();
//            Handler invocationHandler = new Handler(c1);
//            Device d = (Device) Proxy.newProxyInstance(c1.getClass().getClassLoader(), c1.getClass().getInterfaces(), new Handler(c1));
            observer.subscribe(d);
        }
    }
    public void menu() {
        int option;
        do {
            do {
                System.out.println("pick action:");
                System.out.println("1. See List of computers\n" +
                        "2. See list of Laptops\n" +
                        "3. add new computer\n" +
                        "4. add new laptop\n" +
                        "5. All computers off\n" +
                        "0. EXIT");
                option = getOption();
            } while (option > 5 || option < 0);
            if (option == 0) break;

            executeOption(option);
            //EXECUTE OPTION HERE
        } while (true);

    }
    public int getOption() {
        String str;
        do {
            str = scanner.nextLine().trim();
        } while (!str.matches("\\d"));
        return Integer.parseInt(str);
    }
    public int executeOption(int option) {
        switch (option) {
            case 1:
                return LaptopsList();
            case 2:
                return ComputersList();
            case 3:
                return addComputer();
            case 4:
                return addLaptop();
            case 5:
                observer.allDown();
                return -2;
            default:
                return -1;
        }
    }

    private int LaptopsList() {
        view.showComputers(servise.getComputers());
        return servise.getComputers().size();
    }
    private int ComputersList() {
        view.showLaptops(servise.getLaptops());
        return servise.getLaptops().size();
    }
    private int addComputer() {
        System.out.println("Computer added");
        return servise.saveComputer();
    }
    private int addLaptop() {
        System.out.println("Laptop added");
        return servise.saveLaptop();
    }
}
