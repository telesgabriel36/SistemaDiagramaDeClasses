package view;

import controller.Controlador;

import javax.swing.*;

public class AlunosCadastradosFrame {

    JMenuItem cadastrarMenuItem;
    JMenuItem editarMenuItem;
    JList alunosList;
    Controlador controlador;

    public JMenuItem getCadastrarMenuItem() {
        return cadastrarMenuItem;
    }

    public void setCadastrarMenuItem(JMenuItem cadastrarMenuItem) {
        this.cadastrarMenuItem = cadastrarMenuItem;
    }

    public JMenuItem getEditarMenuItem() {
        return editarMenuItem;
    }

    public void setEditarMenuItem(JMenuItem editarMenuItem) {
        this.editarMenuItem = editarMenuItem;
    }

    public JList getAlunosList() {
        return alunosList;
    }

    public void setAlunosList(JList alunosList) {
        this.alunosList = alunosList;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public void carregarDados() {

    }

    private void casdastrarMenuItemActionPerformed() {

    }

    private void editarMenuItemActionPerformed() {

    }

    public void atualizarDados() {

    }


}
