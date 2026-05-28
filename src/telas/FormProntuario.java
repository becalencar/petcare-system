package telas;

import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormProntuario extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormProntuario.class.getName());
    ArrayList<Prontuario> listaProntuarios;
    FormPrincipal principal;

    public FormProntuario(java.awt.Frame parent, boolean modal, ArrayList<Prontuario> listaProntuarios, ArrayList<Categoria> listaCategorias) {
        super(parent, modal);
        initComponents();
        this.listaProntuarios = listaProntuarios;
        principal = (FormPrincipal) this.getParent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastroProntuario = new javax.swing.JButton();
        btnListarProntuarios = new javax.swing.JButton();
        removePronts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        insertProceds = new javax.swing.JButton();
        printProceds = new javax.swing.JButton();
        calcCusts = new javax.swing.JButton();
        btnQtdProced = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCadastroProntuario.setText("Cadastrar Prontuário");
        btnCadastroProntuario.addActionListener(this::btnCadastroProntuarioActionPerformed);

        btnListarProntuarios.setText("Imprimir Prontuário");
        btnListarProntuarios.addActionListener(this::btnListarProntuariosActionPerformed);

        removePronts.setText("Excluir Prontuário");
        removePronts.addActionListener(this::removeProntsActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        insertProceds.setText("Inserir Procedimento");
        insertProceds.addActionListener(this::insertProcedsActionPerformed);

        printProceds.setText("Imprimir Procedimentos");
        printProceds.addActionListener(this::printProcedsActionPerformed);

        calcCusts.setText("Calcular Custo Total");
        calcCusts.addActionListener(this::calcCustsActionPerformed);

        btnQtdProced.setText("Qtd. Procedimentos");
        btnQtdProced.addActionListener(this::btnQtdProcedActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListarProntuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(calcCusts, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCadastroProntuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(printProceds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(insertProceds, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQtdProced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(removePronts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroProntuario)
                    .addComponent(insertProceds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnListarProntuarios)
                    .addComponent(printProceds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQtdProced)
                    .addComponent(calcCusts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removePronts, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProntuarioActionPerformed
        int codigo = 6202 + (listaProntuarios.size() + 1) * 10000;

        Integer idAnimal = principal.validarEntradaInteiro("Insira o código do animal: ");
        if (idAnimal == null) {//valida a entrada do código do animal
            return;
        }

        Animal animal = principal.buscarAnimalCodigo(idAnimal);

        if (animal == null) { //verifica se o animal existe
            JOptionPane.showMessageDialog(null, "Animal inexistente! A operação será cancelada.");
            return;
        }

        Prontuario prontAux = principal.buscarProntuarioAnimal(idAnimal); //verifica se o prontuário do animal ja existe

        if (prontAux != null) {
            JOptionPane.showMessageDialog(null, "Já existe um prontuário para este animal.\nProntuário: " + prontAux.getCodProntuario());
            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(
                null,
                "Deseja cadastrar um prontuário ao pet: " + animal.getNome() + " ?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            listaProntuarios.add((new Prontuario(codigo, animal)));
            taSaida.setText("");
            taSaida.append("Prontuário Cadastrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
        }
        
    }//GEN-LAST:event_btnCadastroProntuarioActionPerformed

    private void btnListarProntuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProntuariosActionPerformed
        taSaida.setText("");
        for (Prontuario p : listaProntuarios) {
            taSaida.append(p + "\n");
        }
    }//GEN-LAST:event_btnListarProntuariosActionPerformed

    private void removeProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeProntsActionPerformed
        Integer codigo = principal.validarEntradaInteiro("Digite o código do prontuário em que deseja imprimir os procedimentos:");
        if (codigo == null) { //validação
            return;
        }

        Prontuario prontAux = principal.buscarProntuarioCodigo(codigo);
        if (prontAux == null){
            JOptionPane.showMessageDialog(null,"Prontuário não encontrado");
            return;
        }
        
        principal.listaProntuarios.remove(prontAux);
        taSaida.setText("");
        taSaida.append("Prontuário removido com sucesso! ");
    }//GEN-LAST:event_removeProntsActionPerformed

    private void insertProcedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertProcedsActionPerformed
        Integer codigo = principal.validarEntradaInteiro("Digite o código do prontuário em que deseja adicionar um procedimento:");
        if (codigo == null) { //validação
            return;
        }

        Prontuario prontAux = principal.buscarProntuarioCodigo(codigo);

        if (prontAux == null) {
            JOptionPane.showMessageDialog(null, "Prontuário inexistente!");
            return;
        }

        int codProced = prontAux.getListaProcedimentos().size() + 1;
        Procedimento procedAux = principal.buscarProcedimentoCodigo(codProced);

        // caso algum procedimento seja excluído, e depois inserirmos um novo procedimento, o código ficaria repetido
        if (procedAux != null) {
            codProced = codProced + 1;
        }

        Integer codCategoria = principal.validarEntradaInteiro("Insira o código da categoria do procedimento \n "); //codigo 
        if (codCategoria == null) {
            return; //validação
        }
        String nomeCategoria; //nome
        Categoria catAux = principal.buscarCategoriaCodigo(codCategoria);
        if (catAux != null) {
            nomeCategoria = catAux.getNomeCategoria();
        } else {
            return;
        }

        String dataProced = principal.validarEntradaData("Insira a data do procedimento:  \n Ex: xx/xx/xxxx"); //data
        if (dataProced == null) {
            return;
        }

        String relato = principal.validarEntradaTexto("Insira o relato do procedimento: "); //relato
        if (relato == null) {
            return;
        }

        Double custoProced = principal.validarEntradaDouble("Insira o valor do custo do procedimento: "); //valor
        if (custoProced == null) {
            return;
        }

        Integer codFunc = principal.validarEntradaInteiro("Insira o código do funcionário responsável pelo procedimento: "); //profissional
        if (codFunc == null) {
            return;
        }
        Funcionario profissional = principal.buscarFuncionarioCodigo(codFunc);
        if (profissional == null){
            JOptionPane.showMessageDialog(null,"Erro, Insira o código de um profissional");
        }

        prontAux.inserirProcedimento(codProced, nomeCategoria, dataProced, custoProced, profissional, catAux, relato);
        taSaida.setText("");
        taSaida.append("Procedimento inserido com sucesso!");

    }//GEN-LAST:event_insertProcedsActionPerformed

    private void printProcedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printProcedsActionPerformed
        Integer codigo = principal.validarEntradaInteiro("Digite o código do prontuário em que deseja imprimir os procedimentos:");
        if (codigo == null) { //validação
            return;
        }

        Prontuario prontAux = principal.buscarProntuarioCodigo(codigo);
        if (prontAux == null){
            JOptionPane.showMessageDialog(null,"Prontuário não encontrado");
            return;
        }
        
        taSaida.setText("");
        taSaida.append(prontAux.retornarTodosProcedimentos());
    }//GEN-LAST:event_printProcedsActionPerformed

    private void calcCustsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcCustsActionPerformed
        Integer codigo = principal.validarEntradaInteiro("Digite o código do prontuário em que deseja imprimir os procedimentos:");
        if (codigo == null) { //validação
            return;
        }

        Prontuario prontAux = principal.buscarProntuarioCodigo(codigo);
        if (prontAux == null){
            JOptionPane.showMessageDialog(null,"Prontuário não encontrado");
            return;
        }
        
        double valor = prontAux.calcularCustoTotal();

        taSaida.setText("");
        taSaida.append(
                "O custo total de todos os procedimentos do prontuário "
                + prontAux.getCodProntuario()
                + " é de: \nR$ "
                + String.format("%.2f", valor)
        );

        
    }//GEN-LAST:event_calcCustsActionPerformed

    private void btnQtdProcedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdProcedActionPerformed
        Integer codigo = principal.validarEntradaInteiro("Digite o código do prontuário em que deseja imprimir os procedimentos:");
        if (codigo == null) { //validação
            return;
        }

        Prontuario prontAux = principal.buscarProntuarioCodigo(codigo);
        if (prontAux == null){
            JOptionPane.showMessageDialog(null,"Prontuário não encontrado");
            return;
        }
        
        int contador = 0;
        for(Procedimento p : prontAux.getListaProcedimentos()){
            contador += 1;
        }
        
        taSaida.setText("");
        taSaida.append("O prontuário " + prontAux.getCodProntuario() + " possui: " + contador + " procedimentos pendentes");
        
    }//GEN-LAST:event_btnQtdProcedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroProntuario;
    private javax.swing.JButton btnListarProntuarios;
    private javax.swing.JButton btnQtdProced;
    private javax.swing.JButton calcCusts;
    private javax.swing.JButton insertProceds;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printProceds;
    private javax.swing.JButton removePronts;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
