package ca.prog1400.common;

import ca.prog1400.classes.Player;
import ca.prog1400.ui.BattlePanel;
import ca.prog1400.ui.SelectPanel;

import javax.swing.*;

import static ca.prog1400.ui.SelectPanel.*;
import static ca.prog1400.ui.BattlePanel.*;

public class FillTextArea {

    public static void FillTextArea(String inputClass) {
        switch (inputClass) {
            //case for character information in select panel
            case "Character":
                getTextAreaSelCharstats1().setText(Integer.toString(SelPlayerClass.getSelCharacter().getHitPoint()));
                getTextAreaSelCharstats2().setText(Integer.toString(SelPlayerClass.getSelCharacter().getDefensePoint()));
                getTextAreaSelCharstats3().setText(Integer.toString(SelPlayerClass.getSelCharacter().getAgilityPoint()));
                getTextAreaSelCharstats4().setText(Integer.toString(SelPlayerClass.getSelCharacter().getBaseAttackPoint()));
                getTextAreaCharType().setText(SelPlayerClass.getSelCharacter().getDesc());
                getLabelCharImage().setIcon(new ImageIcon(FillTextArea.class.getResource(SelPlayerClass.getSelCharacter().getImageAddr())));
                break;
            //case for weapon information in select panel
            case "Weapon":
                getTextAreaWeaponStats1().setText("+" + Player.getWeapon().getAttackModifier());
                getTextAreaWeaponStats2().setText(Integer.toString(Player.getWeapon().getWeight()));
                getTextAreaWeaponType().setText(Player.getWeapon().getDesc());
                getLabelWeaponImage().setIcon(new ImageIcon(FillTextArea.class.getResource(Player.getWeapon().getImageAddr())));
                break;
            //case for summary in battle panel
            case "Battle":
                getLabelBattlePlayerTitle().setText("Player: " + SelPlayerClass.getSelCharacter().getCharName());
                getLabelBattleMonsterTitle().setText("Monster: " + MakeRandomMonster.getRandomMonster().getCharName());
                getLabelBattlePlayerImage().setIcon(new ImageIcon(FillTextArea.class.getResource(SelPlayerClass.getSelCharacter().getImageAddr())));
                getLabelBattleMonsterImage().setIcon(new ImageIcon(FillTextArea.class.getResource(MakeRandomMonster.getRandomMonster().getImageAddr())));
                getTextAreaBattleSummary().append(SelPlayerClass.getSelCharacter().toString());
                getTextAreaBattleSummary().append(MakeRandomMonster.getRandomMonster().toString());
                break;
            //reset all previous value when user click play again button
            case "reset":
                SelectPanel.getTextFieldCharName().setText("");
                SelectPanel.getLabelCharImage().setIcon(null);
                SelectPanel.getLabelWeaponImage().setIcon(null);
                SelectPanel.getCharacterGroup().clearSelection();
                SelectPanel.getWeaponGroup().clearSelection();
                SelectPanel.getTextAreaSelCharstats1().setText("");
                SelectPanel.getTextAreaSelCharstats2().setText("");
                SelectPanel.getTextAreaSelCharstats3().setText("");
                SelectPanel.getTextAreaSelCharstats4().setText("");
                SelectPanel.getTextAreaCharType().setText("");
                SelectPanel.getTextAreaWeaponStats1().setText("");
                SelectPanel.getTextAreaWeaponStats2().setText("");
                SelectPanel.getTextAreaWeaponType().setText("");
                BattlePanel.getLabelBattlePlayerTitle().setText("");
                BattlePanel.getLabelBattleMonsterTitle().setText("");
                BattlePanel.getLabelBattlePlayerImage().setIcon(null);
                BattlePanel.getLabelBattleMonsterImage().setIcon(null);
                BattlePanel.getTextAreaBattleSummary().setText("");
                break;
        }
    }
}
