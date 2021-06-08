package factory_design_patern.packages;

import factory_design_patern.Decorations.Basic;

public class BasicPackageDemo extends PackageDemo {
    @Override
    void createPackage() {
        decorationList.add(new Basic());
    }
}
