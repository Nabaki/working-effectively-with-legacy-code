package b.clean.code;

import java.security.cert.Certificate;

public class CreditValidator {

    /**
     * Instancier cette classe dans un test devient compliqué car les parametres risquent de demander également d'autres paramètres
     */
    public CreditValidator(IRGHConnection connection,
                           CreaditMaster master,
                           String validatorID) {
        //Blabla
    }

    Certificate validateCustomer(Customer customer) throws InvalidCredit {
        //Blabla
    }
}

/**
 * Code complexe
 * Constructeur complexe
 * On ne veut pas les seffets déclenchés lors de l'utilisation de cette classe (ici une connection)
 */
class RGHConnection implements IRGHConnection {
    //blabla
}

/**
 * En extrayant une interface on peut implémenter un FakeRGHConnection qui aura un comportement choisit lors des tests
 */
interface IRGHConnection {
    //blabla
}