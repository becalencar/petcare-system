package telas;

import classes.*;
import java.awt.Color;
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
        getContentPane().setBackground(new Color(232, 180, 184)); //define a cor de fundo do JDialog
        taSaida.setBackground(new Color(168, 187, 163)); //define a cor do fundo do taSaida
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Prontuários");
        setResizable(false);

        btnCadastroProntuario.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCadastroProntuario.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastroProntuario.setText("Cadastrar Prontuário");
        btnCadastroProntuario.addActionListener(this::btnCadastroProntuarioActionPerformed);

        btnListarProntuarios.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnListarProntuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnListarProntuarios.setText("Imprimir Prontuário");
        btnListarProntuarios.addActionListener(this::btnListarProntuariosActionPerformed);

        removePronts.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removePronts.setForeground(new java.awt.Color(0, 0, 0));
        removePronts.setText("Excluir Prontuário");
        removePronts.addActionListener(this::removeProntsActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        insertProceds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        insertProceds.setForeground(new java.awt.Color(0, 0, 0));
        insertProceds.setText("Inserir Procedimento");
        insertProceds.addActionListener(this::insertProcedsActionPerformed);

        printProceds.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        printProceds.setForeground(new java.awt.Color(0, 0, 0));
        printProceds.setText("Imprimir Procedimentos");
        printProceds.addActionListener(this::printProcedsActionPerformed);

        calcCusts.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        calcCusts.setForeground(new java.awt.Color(0, 0, 0));
        calcCusts.setText("Calcular Custo Total");
        calcCusts.addActionListener(this::calcCustsActionPerformed);

        btnQtdProced.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnQtdProced.setForeground(new java.awt.Color(0, 0, 0));
        btnQtdProced.setText("Qtd. Procedimentos");
        btnQtdProced.addActionListener(this::btnQtdProcedActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Sair");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        jLabel2.setText("Gerenciar Prontuarios e Procedimentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQtdProced, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(printProceds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertProceds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removePronts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcCusts, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnListarProntuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastroProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnCadastroProntuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarProntuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removePronts, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcCusts, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(insertProceds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printProceds, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQtdProced, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroProntuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProntuarioActionPerformed
        int codigo = principal.gerarIdProntuario();

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroProntuario;
    private javax.swing.JButton btnListarProntuarios;
    private javax.swing.JButton btnQtdProced;
    private javax.swing.JButton calcCusts;
    private javax.swing.JButton insertProceds;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printProceds;
    private javax.swing.JButton removePronts;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
