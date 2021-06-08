package factory_design_patern.packages;

import factory_design_patern.Decorations.Decoration;

import java.util.ArrayList;
import java.util.List;

public abstract class PackageDemo {
    public List<Decoration> decorationList = new ArrayList<>();

    PackageDemo() {
        createPackage();
    }

    abstract void createPackage();

    @Override
    public String toString() {
        return "PackageDemo{" +
                "decorationList=" + decorationList +
                '}';
    }
}
