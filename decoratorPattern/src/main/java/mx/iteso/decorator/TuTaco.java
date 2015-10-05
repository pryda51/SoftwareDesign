package mx.iteso.decorator;

import mx.iteso.decorator.condiments.*;
import mx.iteso.decorator.condiments.meat.*;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;

public class TuTaco {
    public static void main(String[] args) {
        Taco taco1 = new TacoNormal(Taco.REGULAR);

        System.out.println(taco1.getDescription());
        System.out.println("$" + taco1.cost() + " MXN");

        taco1 = new TortillaMaiz(taco1);
        taco1 = new Chorizo(taco1, Taco.REGULAR);
        taco1 = new Cebolla(taco1);
        taco1 = new Cilantro(taco1);

        System.out.println();
        System.out.println();
        System.out.println(taco1.getDescription());
        System.out.println("$" + taco1.cost() + " MXN");



        Taco taco2 = new TacoNormal(Taco.MINI);

        taco2 = new TortillaMaiz(taco2);
        taco2 = new Chorizo(taco2, Taco.MINI);
        taco2 = new Cebolla(taco2);
        taco2 = new Cilantro(taco2);

        System.out.println();
        System.out.println();
        System.out.println(taco2.getDescription());
        System.out.println("$" + taco2.cost() + " MXN");



        Taco taco3 = new TacoNormal(Taco.MEGA);

        taco3 = new TortillaMaiz(taco3);
        taco3 = new Chorizo(taco3, Taco.MEGA);
        taco3 = new Cebolla(taco3);
        taco3 = new Cilantro(taco3);

        System.out.println();
        System.out.println();
        System.out.println(taco3.getDescription());
        System.out.println("$" + taco3.cost() + " MXN");



        Taco taco4 = new TacoNormal(Taco.REGULAR);

        taco4 = new TortillaHarina(taco4);
        taco4 = new Lengua(taco4, Taco.REGULAR);
        taco4 = new Cilantro(taco4);

        System.out.println();
        System.out.println();
        System.out.println(taco4.getDescription());
        System.out.println("$" + taco4.cost() + " MXN");



        Taco taco5 = new TacoNormal(Taco.MEGA);

        taco5 = new TortillaMaiz(taco5);
        taco5 = new Pescado(taco5, Taco.MEGA);

        System.out.println();
        System.out.println();
        System.out.println(taco5.getDescription());
        System.out.println("$" + taco5.cost() + " MXN");



        Taco taco6 = new TacoNormal(Taco.REGULAR);

        taco6 = new TortillaMaiz(taco6);
        taco6 = new Camaron(taco6, Taco.REGULAR);

        System.out.println();
        System.out.println();
        System.out.println(taco5.getDescription());
        System.out.println("$" + taco6.cost() + " MXN");



        Taco quesadilla1 = new Quesadilla(Quesadilla.REGULAR);

        quesadilla1 = new TortillaHarina(quesadilla1);
        quesadilla1 = new Pastor(quesadilla1, Quesadilla.REGULAR);
        quesadilla1 = new Cebolla(quesadilla1);

        System.out.println();
        System.out.println();
        System.out.println(quesadilla1.getDescription());
        System.out.println("$" + quesadilla1.cost() + " MXN");



        Taco quesadilla2 = new Quesadilla(Quesadilla.MINI);

        quesadilla2 = new TortillaHarina(quesadilla2);
        quesadilla2 = new Pastor(quesadilla2, Quesadilla.MINI);
        quesadilla2 = new Cebolla(quesadilla2);

        System.out.println();
        System.out.println();
        System.out.println(quesadilla2.getDescription());
        System.out.println("$" + quesadilla2.cost() + " MXN");



        Taco quesadilla3 = new Quesadilla(Quesadilla.MEGA);

        quesadilla3 = new TortillaHarina(quesadilla3);
        quesadilla3 = new Pastor(quesadilla3, Quesadilla.MEGA);
        quesadilla3 = new Queso(quesadilla3, Quesadilla.MEGA);
        quesadilla3 = new Cebolla(quesadilla3);

        System.out.println();
        System.out.println();
        System.out.println(quesadilla3.getDescription());
        System.out.println("$" + quesadilla3.cost() + " MXN");



        Taco volcan1 = new Volcan();

        volcan1 = new TortillaMaiz(volcan1);
        volcan1 = new Lengua(volcan1);
        volcan1 = new Queso(volcan1);
        volcan1 = new Cilantro(volcan1);

        System.out.println();
        System.out.println();
        System.out.println(volcan1.getDescription());
        System.out.println("$" + volcan1.cost() + " MXN");
    }
}
