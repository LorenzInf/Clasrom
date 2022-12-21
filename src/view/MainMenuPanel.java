package view;

import controller.ProgramController;
import controller.ViewController;

import javax.swing.*;

public class MainMenuPanel {
    private final ProgramController pc;
    private JPanel panel1;
    private JButton logOutButton;
    private JLabel loggedInAsLabel;
    private JPanel scrollPanel;

    public MainMenuPanel(ViewController vc, ProgramController pc) {
        this.pc = pc;

        logOutButton.addActionListener(e -> {
            pc.resetSchueler();
            vc.setLoginPanel();
        });
    }

    public void updateLabel() {
        loggedInAsLabel.setText("  Angemeldet als " + pc.getSchueler().getFirstName() + " " + pc.getSchueler().getLastName() + " (" + pc.getSchueler().getSid() + ")");
    }

    public JPanel getPanel() {
        return panel1;
    }

    public void insertYearInfo(YearInfoPanel[] yearPanels) {
        scrollPanel.setLayout(new BoxLayout(scrollPanel,BoxLayout.PAGE_AXIS));
        for (YearInfoPanel panel : yearPanels) {
            scrollPanel.add(panel.getPanel());
        }
    }
}
