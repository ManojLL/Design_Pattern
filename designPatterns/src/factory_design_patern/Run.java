package factory_design_patern;

import factory_design_patern.packages.PackageDemo;

public class Run {
    public static void main(String[] args) {
        PackageFactory packageFactory = new PackageFactory();
        PackageDemo packageDemo = packageFactory.getPackage(Packages.PREMIUM);
        System.out.println(packageDemo.toString());
    }
}
