package a.legacy.code;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class AccountDetailFrame extends Frame implements ActionListener, WindowListener {
    private TextField display = new TextField(10);

    public AccountDetailFrame(/*blabla*/) {
        //blabla
    }

    //FIXME difficile de tester une méthode sans retour et avec des effets de bord
    public void actionPerformed(ActionEvent event) {
        String source = event.getActionCommand();
        if (source.equals("project actvity")) {
            DetailFrame detailDisplay = new DetailFrame();
            detailDisplay.setDescription(getDetailText() + " " + getProjectionText());
            detailDisplay.show();

            String accountDescription = detailDisplay.getAccountSymbol();
            accountDescription += ": ";
            //blabla
            display.setText(accountDescription);
            //blabla
        }
    }
}
