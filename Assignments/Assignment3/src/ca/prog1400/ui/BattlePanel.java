package ca.prog1400.ui;

import ca.prog1400.common.FillTextArea;
import ca.prog1400.common.MakeRandomMonster;
import ca.prog1400.common.MakeRandomNumber;
import ca.prog1400.common.SelPlayerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattlePanel extends JPanel {
    private JLabel labelBattleTitle;
    private static JLabel labelBattlePlayerTitle;
    private static JLabel labelBattleMonsterTitle;
    private static JLabel labelBattlePlayerImage;
    private static JLabel labelBattleMonsterImage;

    private JButton btnPlayAgain;

    private static JTextArea textAreaBattleSummary;

    private int maxNum = 3;

    public BattlePanel() {
        MakeRandomMonster.MakeRandomMonster(MakeRandomNumber.MakeRandomNumber(maxNum));

        // battle panel title
        labelBattleTitle = new JLabel("Battle To The Death!", SwingConstants.CENTER);
        labelBattleTitle.setFont(new Font("Old English Text MT", Font.BOLD, 40));
        labelBattleTitle.setBounds(0, 20, 450, 45);
        add(labelBattleTitle);

        // player title
        labelBattlePlayerTitle = new JLabel("Player: " + SelPlayerClass.getSelCharacter().getCharName(), SwingConstants.CENTER);
        labelBattlePlayerTitle.setFont(new Font("Arial", Font.BOLD, 15));
        labelBattlePlayerTitle.setBounds(68, 75, 130, 20);
        add(labelBattlePlayerTitle);

        // player image
        labelBattlePlayerImage = new JLabel();
        labelBattlePlayerImage.setBounds(83, 105, 100, 90);
        add(labelBattlePlayerImage);

        // monster title
        labelBattleMonsterTitle = new JLabel("Monster: " + MakeRandomMonster.getRandomMonster().getCharName(), SwingConstants.CENTER);
        labelBattleMonsterTitle.setFont(new Font("Arial", Font.BOLD, 15));
        labelBattleMonsterTitle.setBounds(252, 75, 130, 20);
        add(labelBattleMonsterTitle);

        // player image
        labelBattleMonsterImage = new JLabel();
        labelBattleMonsterImage.setBounds(267, 105, 100, 90);
        add(labelBattleMonsterImage);

        // Add a text Area for battle summary
        textAreaBattleSummary = new JTextArea();
        textAreaBattleSummary.setFont(new Font("Courier New", Font.PLAIN, 12));
        textAreaBattleSummary.setLineWrap(true);
        textAreaBattleSummary.setBounds(0, 210, 450, 240);
        textAreaBattleSummary.setEditable(false);
        add(textAreaBattleSummary);

        // battle summary
        FillTextArea.FillTextArea("Battle");

        // Play Again
        btnPlayAgain = new JButton("Play Again");
        btnPlayAgain.setFont(new Font("Old English Text MT", Font.BOLD, 15));
        btnPlayAgain.setBounds(165, 470, 120, 25);
        btnPlayAgain.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // reset all input values
                FillTextArea.FillTextArea("reset");

                GameFrame.getPanelMain().setVisible(false);
                GameFrame.getPanelSelChar().setVisible(true);
                SelectPanel.getPanelBattle().setVisible(false);
            }
        });
        add(btnPlayAgain);
    }

    public static JLabel getLabelBattleMonsterTitle() {
        return labelBattleMonsterTitle;
    }

    public static JLabel getLabelBattlePlayerTitle() {
        return labelBattlePlayerTitle;
    }

    public static JLabel getLabelBattlePlayerImage() {
        return labelBattlePlayerImage;
    }

    public static JLabel getLabelBattleMonsterImage() {
        return labelBattleMonsterImage;
    }

    public static JTextArea getTextAreaBattleSummary() {
        return textAreaBattleSummary;
    }
}
