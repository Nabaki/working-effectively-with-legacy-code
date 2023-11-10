package a.legacy.code;

public class RSCWorkflow {

    //FIXME la classe ne peut pa sêtre instanciée
    public void validate(Packet packet) throws InvalidWFlowException {
        if (packet.getOriginator().equals("MIA")
                || packet.getLength > MAX_LENGTH
                || !packet.hasValidCheckSum()) {
            throw new InvalidWFlowException();
        }

        //blabla
    }
}
