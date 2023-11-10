package code.to.test;

import java.util.Iterator;

public class Employee {

    private final EmployeeFinder finder;

    public void payAll() {
        for (Iterator it = idList.iterator(); it.hasNext(); ) {
            EmployeeID id = (EmployeeID) it.next();
            Employee e = finder.getEmployeeForID(id);
            e.pay();
        }
    }
}

interface EmployeeFinder {

    Employee getEmployeeForID(EmployeeID id);
}

/**
 * Risque de NPE
 */
class EmployeeFinder1 implements EmployeeFinder {

    public Employee getEmployeeForID(EmployeeID id) {
        //blabla

        //Si pas d'pmloyé trouvé
        return null;
    }
}

/**
 * Les utilisateurs doivent désormais gérer la checkedException
 */
class EmployeeFinder2 implements EmployeeFinder {

    public Employee getEmployeeForID(EmployeeID id) throws NoEmployeeFoundException {
        //blabla
    }
}

/**
 * Attention aux régressions, il va peut-être devoir filtrer les NullEmployee lors de traitements comme le comptage :
 * employees.stream.count() //bug
 * employees.stream.filter(e -> !e.instanceOf(NullEmployee.class)).count()
 */
class EmployeeFinder3 implements EmployeeFinder {

    public Employee getEmployeeForID(EmployeeID id) {
        //blabla

        //Si pas d'pmloyé trouvé
        return new NullEmployee();
    }
}