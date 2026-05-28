package telas;

import classes.*;
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

        updateVets.setText("Editar Veterinário");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listVets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeVets, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(updateVets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertVets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeVets)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertVetsActionPerformed
        int codigo = 2026 + (listaFuncionarios.size() + 1) * 10000; //também possui o erro

        String nome = principal.validarEntradaTexto("Nome Completo:");
        if (nome == null) {
            return;
        }
        
        ArrayList<String> tels = new ArrayList(); // guarda os telefones

        while (true) {  // enquanto a resposta for sim o usuário vai adicionando + telefones

            String telefone = JOptionPane.showInputDialog("Telefone:");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertVets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listVets;
    private javax.swing.JButton removeVets;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JButton updateVets;
    // End of variables declaration//GEN-END:variables

}
