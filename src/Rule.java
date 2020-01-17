import java.util.ArrayList;
import java.util.List;

public class Rule {
    List<Unit> units = new ArrayList<>();

    Rule(Element... elements) {
        for (Element element : elements) {
            units.add(new Unit(element));
        }
    }

    Element head() {
        return units.get(0).element;
    }

    void add(Element e, List<String> args, String code) {
        units.add(new Unit(e, code, args));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Unit unit : units) {
            sb.append(unit.element);
            sb.append(" ");
        }
        return sb.toString();
    }

    static class Unit {
        Element element;
        String code = "";
        List<String> args = new ArrayList<>();

        Unit(Element element) {
            this.element = element;
        }

        Unit(Element element, String code, List<String> args) {
            this.element = element;
            if (code != null)
                this.code = code;
            if (args != null)
                this.args = args;
        }
    }
}
