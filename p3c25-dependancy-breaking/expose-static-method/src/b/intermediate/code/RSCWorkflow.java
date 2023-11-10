package b.intermediate.code;

public class RSCWorkflow {

    /**
     * la méthode static peut être testée sans pour autant instancier sa classe.
     * Cette méthode devrait plutôt être déportée dans Packet mais si l'objectif est simplement de tester avant d'ajouter du comportement alors le moins risqué reste ça.
     */
    public void validate(Packet packet) throws InvalidWFlowException {
        validatePacket(packet);
    }

    public static void validatePacket(Packet packet) throws InvalidWFlowException {
        if (packet.getOriginator().equals("MIA")
                || packet.getLength > MAX_LENGTH
                || !packet.hasValidCheckSum()) {
            throw new InvalidWFlowException();
        }

        //blabla
    }
}
