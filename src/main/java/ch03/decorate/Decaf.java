package ch03.decorate;

public class Decaf extends Beverage{

    public Decaf() {
        description = "๋์นดํ์ธ";
    }

    @Override
    public double cost() {
        return .49;
    }
}

