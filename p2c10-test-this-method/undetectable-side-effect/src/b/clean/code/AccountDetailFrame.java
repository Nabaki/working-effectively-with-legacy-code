package b.clean.code;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class AccountDetailFrame extends Frame implements ActionListener, WindowListener {
    private TextField display = new TextField(10);
    private Detailframe detailDisplay;

    public AccountDetailFrame(/*blabla*/) {
        //blabla
    }

    /**
     * La partie event.getActionCommand() a un effet de bord qu'on laisse en dehors de la méthode performCommand que l'on testera
     */
    public void actionPerformed(ActionEvent event) {
        String source = event.getActionCommand();
        performCommand(source);
    }

    /**
     * We make this method public to test it
     */
    public void performCommand(String source) {
        if (source.equals("project actvity")) {
            setDescription(getDetailText() + " " + getProjectionText());

            String accountDescription = getAccountSymbol();
            accountDescription += ": ";
            //blabla
            setDisplayText(accountDescription);
            //blabla
        }
    }

    /**
     * packae-protected pour être override dans un subclass and override method
     */
    void setDisplayText(String accountDescription) {
        display.setText(accountDescription);
    }

    /**
     * packae-protected pour être override dans un subclass and override method
     */
    String getAccountSymbol() {
        return detailDisplay.getAccountSymbol();
    }

    /**
     * packae-protected pour être override dans un subclass and override method
     */
    void setDescription(String description) {
        detailDisplay = new DetailFrame();
        detailDisplay.setDescription(description);
        detailDisplay.show();
    }
}
