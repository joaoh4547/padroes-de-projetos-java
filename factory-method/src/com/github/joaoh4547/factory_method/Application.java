package com.github.joaoh4547.factory_method;

import com.github.joaoh4547.factory_method.issuers.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    private static IssuerCreator issuerCreator;
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        selectMode();
        Issuer issuer = issuerCreator.create(selectType());
        System.out.print("Informe a mensagem ");
        String message = scanner.nextLine();
        issuer.send(message);

    }

    private static void selectMode() {
        System.out.println("Informe o modo de envio:");
        System.out.println("1 -> sincrono");
        System.out.println("2 -> assincrono");

        try {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    issuerCreator = new SyncIssuerCreator();
                    break;
                case 2:
                    issuerCreator = new AsyncIssuerCreator();
                    break;
                default:
                    invalidModeOption();
                    break;
            }

        } catch (InputMismatchException e) {
            invalidModeOption();
        }
        scanner.nextLine();
    }

    private static IssuerType selectType() {
        System.out.println("Informe o tipo de envio:");
        System.out.println("1 -> Email");
        System.out.println("2 -> SMS");
        System.out.println("3 -> JMS");
        IssuerType issuerType;
        try {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    issuerType = IssuerType.EMAIL;
                    break;

                case 2:
                    issuerType = IssuerType.SMS;
                    break;
                case 3:
                    issuerType = IssuerType.JMS;
                    break;
                default:
                    issuerType = invalidTypeOption();
                    break;
            }

        } catch (InputMismatchException e) {
            issuerType = invalidTypeOption();
        }
        scanner.nextLine();
        return issuerType;

    }

    private static IssuerType invalidTypeOption() {
        System.out.println("\nOpção invalida \n");
        scanner.nextLine();
        return selectType();
    }

    private static void invalidModeOption() {
        System.out.println("\nOpção invalida \n");
        scanner.nextLine();
        selectMode();
    }


}
