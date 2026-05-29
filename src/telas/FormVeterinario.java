package telas;

import classes.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormVeterinario extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormVeterinario.class.getName());
    ArrayList<Funcionario> listaFuncionarios;
    FormPrincipal principal;

    private boolean validarCRMV(String crmv) {
        return crmv.matches("\\d{5}/[A-Za-z]{2}");        
    }

    public FormVeterinario(java.awt.Frame parent, boolean modal, ArrayList<Funcionario> listaFuncionarios) {
        super(parent, modal);
        this.listaFuncionarios = listaFuncionarios;
        principal = (FormPrincipal) this.getParent();
        initComponents();
        getContentPane().setBackground(new Color(232, 180, 184)); //define a cor de fundo do JDialog
        taSaida.setBackground(new Color(168, 187, 163)); //define a cor do fundo do taSaida
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Veterinários");
        setResizable(false);

        insertVets.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        insertVets.setForeground(new java.awt.Color(0, 0, 0));
        insertVets.setText("Inserir Veterinário");
        insertVets.addActionListener(this::insertVetsActionPerformed);

        updateVets.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateVets.setForeground(new java.awt.Color(0, 0, 0));
        updateVets.setText("Editar Veterinário");
        updateVets.addActionListener(this::updateVetsActionPerformed);

        listVets.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listVets.setForeground(new java.awt.Color(0, 0, 0));
        listVets.setText("Listar Veterinários");
        listVets.addActionListener(this::listVetsActionPerformed);

        removeVets.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removeVets.setForeground(new java.awt.Color(0, 0, 0));
        removeVets.setText("Excluir Veterinário");
        removeVets.addActionListener(this::removeVetsActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Sair");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        jLabel2.setText("Gerenciar Veterinários");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(updateVets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listVets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeVets, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertVets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(insertVets, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateVets, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listVets, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVets, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertVetsActionPerformed
        int codigo = principal.gerarIdFuncionario();

        String nome = principal.validarEntradaTexto("Nome Completo:");
        if (nome == null) {
            return;
        }
        
        ArrayList<String> tels = new ArrayList(); // guarda os telefones

        while (true) {  // enquanto a resposta for sim o usuário vai adicionando + telefones

            String telefone = JOptionPane.showInputDialog("Telefone:");
            if(telefone == null){
                return;
            }
            
            boolean telAux = principal.telefoneValido(telefone);
            
            if (telAux) {
                tels.add(telefone);
                int resposta = JOptionPane.showConfirmDialog( // showConfirmDialog é um popup de sim/não
                        null,
                        "Deseja adicionar mais um telefone?",
                        "Telefone",
                        JOptionPane.YES_NO_OPTION // botões de sim/não
                );
                // sim = 0, não = 1, close = -1. ConfirmDialog retorna um valor inteiro, por isso a tipagem deve ser int

                if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível completar a operação, tente novamente e insira um telefone válido!\n[11 dígitos apenas numéricos]");
            }
        }
        
        String crmv = JOptionPane.showInputDialog("CRMV:");
        while (true) {

            if (crmv == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada, não é possivel cadastrar um veterinário sem o CRMV");
                return;
            } else if (!validarCRMV(crmv)) {
                crmv = JOptionPane.showInputDialog("ERRO! Insira um CRMV válido para cadastrar o veterinário \n Exemplo: 12345/TO");
            } else {
                break;
            }
        }

        String especialidade = principal.validarEntradaTexto("Especialidade:");

        if (especialidade == null) {
            return;
        }
        
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
        Integer codFuncAux = principal.validarEntradaInteiro("Digite o código do veterinário que deseja alterar:");
        if (codFuncAux == null){
            return;
        }
        
        Funcionario funcTemp = principal.buscarFuncionarioCodigo(codFuncAux);
        
        if (funcTemp == null) {
            JOptionPane.showMessageDialog(null, "Funcionário inexistente!");
            return;
        }

        if (!(funcTemp instanceof Veterinario)) {
            JOptionPane.showMessageDialog(null, "Este funcionário não é um veterinário.");
            return;
        }
        
        Veterinario funcAux = (Veterinario) funcTemp;
        //após essas duas etapas, é garantido que: o funcionario existe e é um veterinário (ja pode entrar no switch case)

        int alteracao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja alterar?\n"
                + "1 - Alterar nome\n"
                + "2 - Alterar Telefone\n"
                + "3 - Adicionar Telefone\n"
                + "4 - Remover Telefone\n"
                + "5 - Alterar CRMV\n"
                + "6 - Alterar Especialidade\n\n"
                + "Digite o número da opção:"));

        switch (alteracao) {
            case 1: //Alterar Nome
                String nomeFuncionario = principal.validarEntradaTexto("Insira o novo nome:");
                if (nomeFuncionario != null){
                    funcAux.setNomeFuncionario(nomeFuncionario);
                }
                JOptionPane.showMessageDialog(null, "Nome Alterado com sucesso!"); //confirmação visual pro usuário
                break;

            case 2: //Alterar Telefone
                if (funcAux.getTelefones().size() >= 1) {
                    String telAlt = "Qual Telefone deseja alterar? \n";
                    for (int i = 0; i < funcAux.getTelefones().size(); i++) {
                        telAlt = telAlt + (i + 1) + "-" + funcAux.getTelefones().get(i) + "\n";
                    }
                    int escolha = Integer.parseInt(JOptionPane.showInputDialog(telAlt));

                    if (escolha < 1 || escolha > funcAux.getTelefones().size()) {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        return;
                    }
                    String novoTel = JOptionPane.showInputDialog("Insira o novo telefone:");

                    if (!principal.telefoneValido(novoTel)) {
                        JOptionPane.showMessageDialog(null, "Telefone inválido!");
                        return;
                    } else {
                        funcAux.getTelefones().set((escolha - 1), novoTel);
                        JOptionPane.showMessageDialog(null, "Telefone Alterado com sucesso!"); //confirmação visual pro usuário
                    }
                }
                break;

            case 3: //Adicionar Telefone
                while (true) {  // enquanto a resposta for sim o usuário vai adicionando + telefones

                    String telefone = principal.validarEntradaTexto("Insira o novo Telefone:");
                    if (telefone == null){
                        return;
                    }
                    boolean telAux = principal.telefoneValido(telefone);
                    
                    if (telAux) {
                        funcAux.adicionarTelefone(telefone);
                        int resposta = JOptionPane.showConfirmDialog( // showConfirmDialog é um popup de sim/não
                                null,
                                "Deseja adicionar mais um telefone?",
                                "Telefone",
                                JOptionPane.YES_NO_OPTION // botões de sim/não
                        );
                        // sim = 0, não = 1, close = -1. ConfirmDialog retorna um valor inteiro, por isso a tipagem deve ser int

                        if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
                            JOptionPane.showMessageDialog(null, "Telefone(s) Adicionado(s) com sucesso");
                            break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não foi possível completar a operação, tente novamente e insira um telefone válido!\n[11 dígitos apenas numéricos]");
                        break;
                    }
                }
                break;

            case 4: //Remover Telefone
                if (funcAux.getTelefones().size() >= 1) {
                    String telAlt = "Qual Telefone deseja remover? \n";
                    for (int i = 0; i < funcAux.getTelefones().size(); i++) {
                        telAlt = telAlt + (i + 1) + "-" + funcAux.getTelefones().get(i) + "\n";
                    }
                    int escolha = Integer.parseInt(JOptionPane.showInputDialog(telAlt));

                    if (escolha < 1 || escolha > funcAux.getTelefones().size()) {
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                        return;
                    }
                    funcAux.getTelefones().remove(escolha - 1);
                    JOptionPane.showMessageDialog(null, "Telefone Removido com sucesso!"); //confirmação visual pro usuário
                }
                break;

            case 5: // Alterar CRMV
                String novoCRMV = JOptionPane.showInputDialog("Insira o novo CRMV:");
                if (validarCRMV(novoCRMV)) {
                    funcAux.setNumCRMV(novoCRMV);
                    JOptionPane.showMessageDialog(null, "CRMV Alterado com sucesso!"); //confirmação visual pro usuário
                    break;
                }


            case 6: //Alterar Especialidade
                String novaEsp = principal.validarEntradaTexto("Insira a nova Especialidade: ");
                if (novaEsp != null){
                    funcAux.setEspecialidade(novaEsp);
                    JOptionPane.showMessageDialog(null, "Especialidade Alterada com sucesso!"); //confirmação visual pro usuário
                    break;
                }

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida! Nenhum caso correspondente.");
                break;
        }


    }//GEN-LAST:event_updateVetsActionPerformed

    private void removeVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVetsActionPerformed
        Integer codExcluir = principal.validarEntradaInteiro("Digite o código do veterinário que deseja excluir:");
        if (codExcluir == null){
            return;
        }
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertVets;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listVets;
    private javax.swing.JButton removeVets;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JButton updateVets;
    // End of variables declaration//GEN-END:variables

}
