package telas;

import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormVeterinario extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormVeterinario.class.getName());
    ArrayList<Funcionario> listaFuncionarios;
    FormPrincipal principal;

    
    public FormVeterinario(java.awt.Frame parent, boolean modal, ArrayList<Funcionario> listaFuncionarios) {
        super(parent, modal);
        this.listaFuncionarios = listaFuncionarios;
        principal = (FormPrincipal) this.getParent();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertVets = new javax.swing.JButton();
        updateVets = new javax.swing.JButton();
        listVets = new javax.swing.JButton();
        removeVets = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        insertVets.setText("Inserir Veterinário");
        insertVets.addActionListener(this::insertVetsActionPerformed);

        updateVets.setText("Alterar Veterinário");
        updateVets.addActionListener(this::updateVetsActionPerformed);

        listVets.setText("Listar Veterinários");
        listVets.addActionListener(this::listVetsActionPerformed);

        removeVets.setText("Excluir Veterinário");
        removeVets.addActionListener(this::removeVetsActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeVets, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listVets, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateVets, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertVets, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(insertVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVets)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertVetsActionPerformed
        int codigo = listaFuncionarios.size() + 1;
        
        String nome = JOptionPane.showInputDialog("Nome Completo:");
        
        ArrayList<String> tels = new ArrayList(); // guarda os telefones
        Veterinario vetTemp = new Veterinario(codigo, nome, tels, "9999", ""); // objeto temporário

        while (true) {  // enquanto a resposta for sim o usuário vai adicionando + telefones
            
            String telefone = JOptionPane.showInputDialog("Telefone:");
            boolean telAux = vetTemp.telefoneValido(telefone);
            
            if (telAux) {
                vetTemp.adicionarTelefone(telefone);
            }
            
            if (!telAux) {
                JOptionPane.showMessageDialog(null, "Insira um telefone válido!\n[11 dígitos apenas numéricos]");
                return;
            }

            tels.add(telefone);
            int resposta = JOptionPane.showConfirmDialog(   // showConfirmDialog é um popup de sim/não
                    null,
                    "Deseja adicionar mais um telefone?",
                    "Telefone",
                    JOptionPane.YES_NO_OPTION   // botões de sim/não
            );
            // sim = 0, não = 1, close = -1. ConfirmDialog retorna um valor inteiro, por isso a tipagem deve ser int
            
            if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) break;
        }
        
        
        String crmv = JOptionPane.showInputDialog("CRMV:");
        vetTemp.setNumCRMV(crmv);
        
        String especialidade = JOptionPane.showInputDialog("Especialidade:");
        
        listaFuncionarios.add(new Veterinario(codigo, nome, tels, crmv, especialidade));
        taSaida.setText("Veterinário inserido com sucesso!");
    }//GEN-LAST:event_insertVetsActionPerformed

    private void listVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listVetsActionPerformed
        taSaida.setText("");
        for (Funcionario f : listaFuncionarios) {
            if (f instanceof Veterinario) {
                taSaida.append(f + "\n");
            }
        }
    }//GEN-LAST:event_listVetsActionPerformed

    private void updateVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateVetsActionPerformed
        int alteracao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja alterar?\n" +
                "1 - Nome\n" +
                "2 - Telefone\n" + 
                "3 - CRMV\n" + 
                "4 - Especialidade\n\n" +
                "Digite o número da opção:")); 
        
        
        if (alteracao != 1 && alteracao != 2 && alteracao != 3 && alteracao != 4) {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
            return;
        }
        
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do veterinário que deseja alterar:"));
        Funcionario funcAux = principal.buscarFuncionarioCodigo(codigo);
        
        // valida se o funcionário existe
        if (funcAux == null) {
            JOptionPane.showMessageDialog(null, "Funcionário inexistente!");
            return;
        }
        
        // valida se o funcionário é um veterináio
        if (!(funcAux instanceof Veterinario)) {
            JOptionPane.showMessageDialog(null, "Este funcionário não é um veterinário.");
            return;
        }
        
        if (alteracao == 1) { 
            for (Funcionario f : listaFuncionarios) {
                if (f.getCodFuncionario() == codigo) {
                    f.setNomeFuncionario(JOptionPane.showInputDialog("Novo nome:"));
                }
            }            
        }
        
        if (alteracao == 2) {
            for (Funcionario f : listaFuncionarios) {
                
                if ((f.getCodFuncionario() == codigo) && (f.getTelefones().size() > 1)) {
                    String telAlt = "Qual telefone deseja alterar?\n";
                    
                    for (int i = 0; i < f.getTelefones().size(); i++) { // fiz assim pra poder pegar o índice
                        telAlt = telAlt + (i + 1) + " - " + f.getTelefones().get(i) + "\n";
                    }
                    
                    int escolha = Integer.parseInt(JOptionPane.showInputDialog(telAlt));
                    
                    if (escolha < 1 || escolha > f.getTelefones().size()) {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        return;
                    }
                    
                    String novoTel = JOptionPane.showInputDialog("Novo telefone:");
                    f.telefoneValido(novoTel);
                    
                    if (!f.telefoneValido(novoTel)) {
                        JOptionPane.showMessageDialog(null, "Telefone inválido!");
                        return;
                    }
                    
                    f.getTelefones().set((escolha - 1), novoTel);
                }
            }        
        }
        
        if (alteracao == 3) {
            for (Funcionario f : listaFuncionarios) {
               if (f.getCodFuncionario() == codigo) {
                   Veterinario v = (Veterinario) f; // diz que f é um veterinário e nos concede acesso aos métodos de veterinário
                   v.setNumCRMV(JOptionPane.showInputDialog("Novo CRMV:"));
               }
           }
        }
        
        if (alteracao == 4) {
           for (Funcionario f : listaFuncionarios) {
               if (f.getCodFuncionario() == codigo) {
                   Veterinario v = (Veterinario) f;
                   v.setEspecialidade(JOptionPane.showInputDialog("Nova especialidade:"));
               }
           }
        }
        
    }//GEN-LAST:event_updateVetsActionPerformed

    private void removeVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVetsActionPerformed
        int codExcluir = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do veterinário que deseja excluir:"));
        Funcionario funcAux = principal.buscarFuncionarioCodigo(codExcluir);
        
        if (funcAux == null) {
            JOptionPane.showMessageDialog(null, "Funcionário inexistente!");
            return;
        }
        
        if (!(funcAux instanceof Veterinario)) {
            JOptionPane.showMessageDialog(null, "Este funcionário não é um veterinário.");
            return;
        }
        
        for (Funcionario f : listaFuncionarios) {
            if (f.getCodFuncionario() == codExcluir) {
                listaFuncionarios.remove(f);
                taSaida.setText("Veterinário removido com sucesso!");
            }
        }
    }//GEN-LAST:event_removeVetsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertVets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listVets;
    private javax.swing.JButton removeVets;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JButton updateVets;
    // End of variables declaration//GEN-END:variables

}
