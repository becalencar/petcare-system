package telas;

import classes.Animal;
import classes.Tutor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FormTutores extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormTutores.class.getName());
    ArrayList<Tutor> listaTutores;
    FormPrincipal principal;

    public FormTutores(java.awt.Frame parent, boolean modal, ArrayList<Animal> listaAnimais, ArrayList<Tutor> listaTutores) {
        super(parent, modal);
        this.listaTutores = listaTutores;
        principal = (FormPrincipal) this.getParent();
        initComponents();
        getContentPane().setBackground(new Color(193, 222, 221)); //define a cor de fundo do JForm
        taSaida.setBackground(new Color(242, 245, 245)); //define a cor do fundo do taSaida
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnCadastroDeTutores = new javax.swing.JButton();
        btnAlterarTutor = new javax.swing.JToggleButton();
        btnListarTutores = new javax.swing.JButton();
        btnRemoverTutor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Tutores");

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        btnCadastroDeTutores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCadastroDeTutores.setText("Cadastrar Tutor");
        btnCadastroDeTutores.addActionListener(this::btnCadastroDeTutoresActionPerformed);

        btnAlterarTutor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAlterarTutor.setText("Alterar Tutor");
        btnAlterarTutor.addActionListener(this::btnAlterarTutorActionPerformed);

        btnListarTutores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnListarTutores.setText("Listar Tutores");
        btnListarTutores.addActionListener(this::btnListarTutoresActionPerformed);

        btnRemoverTutor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnRemoverTutor.setText("Remover Tutor");
        btnRemoverTutor.addActionListener(this::btnRemoverTutorActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel3.setText("Gerenciar Tutores de Pet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btnCadastroDeTutores, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(btnAlterarTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarTutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(btnCadastroDeTutores, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarTutores, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroDeTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroDeTutoresActionPerformed
        int idTutor = principal.gerarIdTutor();

        String nome = principal.validarEntradaTexto("Insira o Nome do Tutor");
        if (nome == null) {
            return;
        }

        String telefone = principal.validarEntradaTexto("Insira o telefone");
        
        if (!principal.telefoneValido(telefone) || telefone == null) {
            JOptionPane.showMessageDialog(null, "Insira um telefone válido para continuar a operação");
        } else{

        ArrayList<Animal> listaAnimais = new ArrayList();

        while(true) { //enquanto a resposta for sim o usuário vai adicionando os animais
            int idAnimal = Integer.parseInt(JOptionPane.showInputDialog("Insira o Id do animal para ser vinculado a(o) " + nome));

            Animal animalAux = principal.buscarAnimalCodigo(idAnimal);

            if (animalAux == null) {
                JOptionPane.showMessageDialog(null, "Animal inexistente");
            } else {
                listaAnimais.add(animalAux);
            }

            int resposta = JOptionPane.showConfirmDialog( // showConfirmDialog é um popup de sim/não
                    null,
                    "Deseja adicionar mais um animal?",
                    "Animal",
                    JOptionPane.YES_NO_OPTION // botões de sim/não
            );
            // sim = 0, não = 1, close = -1. ConfirmDialog retorna um valor inteiro, por isso a tipagem deve ser int

            if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
                break;
            }
        }
        listaTutores.add(new Tutor(nome, idTutor, telefone, listaAnimais));
        }
    }//GEN-LAST:event_btnCadastroDeTutoresActionPerformed

    private void btnListarTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTutoresActionPerformed
        taSaida.setText("");
        for (Tutor t : listaTutores) {
            taSaida.append(t + "\n");
        }
    }//GEN-LAST:event_btnListarTutoresActionPerformed

    private void btnAlterarTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTutorActionPerformed
        Integer codTutor = principal.validarEntradaInteiro("Digite o código do tutor que deseja alterar");
        if (codTutor == null){
            return;
        }
        
        
        if (principal.buscarTutorCodigo(codTutor) == null) {
            JOptionPane.showMessageDialog(null, "Tutor não encontrado");
        } else {
            Tutor tutor = principal.buscarTutorCodigo(codTutor);
            int alteracao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja alterar?\n"
                    + "1 - Nome\n"
                    + "2 - Telefone\n"
                    + "Digite o número da opção:"));
            
            if(alteracao == 1){
                String nome = principal.validarEntradaTexto("Insira o novo nome do(a) tutor(a)");
                if (nome != null){
                    tutor.setNome(nome);
                    JOptionPane.showMessageDialog(null,"Nome alterado com sucesso");
                }
                
            } else if (alteracao == 2){
                String telefone = JOptionPane.showInputDialog("Insira o novo telefone");
                if(telefone != null && principal.telefoneValido(telefone)){
                    tutor.setTelefone(telefone);
                    JOptionPane.showMessageDialog(null,"Telefone alterado com sucesso");
                } 
            }
        }
    
    }//GEN-LAST:event_btnAlterarTutorActionPerformed

    private void btnRemoverTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverTutorActionPerformed
        Integer codTutor = principal.validarEntradaInteiro("Digite o código do tutor que deseja remover");
        if (codTutor == null){
            return;
        }
        
        Tutor tutor = principal.buscarTutorCodigo(codTutor);

        
        if (tutor == null) {
            JOptionPane.showMessageDialog(null, "Tutor não encontrado");
        } else {
            listaTutores.remove(tutor);
            JOptionPane.showMessageDialog(null, "Tutor removido com sucesso");
        }
            
    }//GEN-LAST:event_btnRemoverTutorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterarTutor;
    private javax.swing.JButton btnCadastroDeTutores;
    private javax.swing.JButton btnListarTutores;
    private javax.swing.JButton btnRemoverTutor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
