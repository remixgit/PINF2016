package toolbar.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

public class PreviousAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	private JDialog standardForm;

	public PreviousAction(JDialog standardForm) {
		this.standardForm=standardForm;

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}
