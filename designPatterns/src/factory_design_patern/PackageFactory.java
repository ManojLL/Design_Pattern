package factory_design_patern;

import factory_design_patern.packages.BasicPackageDemo;
import factory_design_patern.packages.PackageDemo;
import factory_design_patern.packages.Premium;
import factory_design_patern.packages.Vip;

public class PackageFactory {

    public PackageDemo getPackage(Packages packages){
        switch (packages){
            case VIP:
                return new Vip();
            case PREMIUM:
                return new Premium();
            case BASIC_PACKAGE:
                return new BasicPackageDemo();
            default:
                return null;
        }
    }
}
