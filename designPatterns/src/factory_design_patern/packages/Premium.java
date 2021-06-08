package factory_design_patern.packages;

import factory_design_patern.Decorations.Basic;
import factory_design_patern.Decorations.Gold;
import factory_design_patern.Decorations.Silver;

public class Premium extends PackageDemo {
    @Override
    void createPackage() {
        decorationList.add(new Gold());
        decorationList.add(new Silver());
        decorationList.add(new Basic());
    }
}
