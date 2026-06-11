package telas;

import classes.Animal;
import classes.Tutor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormAnimais extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAnimais.class.getName());
    ArrayList<Animal> listaAnimais;
    ArrayList<Tutor> listaTutores; 
    FormPrincipal principal;
    
    private Tutor buscarTutor(int codTutor){
        for(Tutor t : listaTutores){
            if (t.getIdTutor() == codTutor){
                return t;
            }
        }
        return null;
    }
    
    private Animal buscarAnimal(int codPet) {
        for (Animal a : listaAnimais) {
            if (a.getIdAnimal() == codPet) {
                return a;
            }
        }
        return null;
    }
    
    public FormAnimais(java.awt.Frame parent, boolean modal, ArrayList<Animal> listaAnimais, ArrayList<Tutor> listaTutores) {
        super(parent, modal);
        this.listaAnimais = listaAnimais;
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
        btnCadastrarAnimal = new javax.swing.JToggleButton();
        btnListarAnimais = new javax.swing.JButton();
        btnExcluirAnimais = new javax.swing.JButton();
        btnAlterarAnimais = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciar Animais");
        setResizable(false);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        btnCadastrarAnimal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCadastrarAnimal.setText("Inserir Animal");
        btnCadastrarAnimal.addActionListener(this::btnCadastrarAnimalActionPerformed);

        btnListarAnimais.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnListarAnimais.setText("Listar Animais");
        btnListarAnimais.addActionListener(this::btnListarAnimaisActionPerformed);

        btnExcluirAnimais.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExcluirAnimais.setText("Excluir Animal");
        btnExcluirAnimais.addActionListener(this::btnExcluirAnimaisActionPerformed);

        btnAlterarAnimais.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAlterarAnimais.setText("Alterar Animal");
        btnAlterarAnimais.addActionListener(this::btnAlterarAnimaisActionPerformed);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jToggleButton1.setText("Sair");
        jToggleButton1.addActionListener(this::jToggleButton1ActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        jLabel2.setText("Gerenciar Animais");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluirAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnListarAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 1033, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(btnCadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAnimalActionPerformed
        int codigo = principal.gerarIdAnimal(); //possui o erro 
        
        Integer codTutor = principal.validarEntradaInteiro("Insira o código do tutor: ");
        if(codTutor == null){
            return;
        }
        
        Tutor tutor = buscarTutor(codTutor);
        
        if (tutor == null) {
            JOptionPane.showMessageDialog(null, "Tutor inexistente!");
            
            int resposta = JOptionPane.showConfirmDialog( // showConfirmDialog é um popup de sim/não
                        null,
                        "Deseja cadastrar o tutor?",
                        "",
                        JOptionPane.YES_NO_OPTION // botões de sim/não
                );
        
            if (resposta == JOptionPane.YES_OPTION) {
                FormTutores telaTutores = new FormTutores(principal, true, listaAnimais, listaTutores);
                this.dispose();
                telaTutores.setVisible(true);
            }
            
            if (resposta == JOptionPane.NO_OPTION || resposta == JOptionPane.CLOSED_OPTION) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }
            
            //colocar o destino da outra página para cadastrar o Tutor aqui
            /*this.setVisible(false);
            
            this.dispose();
            FormPrincipal form = new FormPrincipal();
            form.setVisible(true);
            */
            
        } else {
            Object[] opcoes = {"Macho", "Fêmea"};
            
            String nome = principal.validarEntradaTexto("Insira o Nome do Pet: "); 
            if (nome == null){ //para execução caso o nome seja null
                return;
            }
            
            int intSexo = JOptionPane.showOptionDialog(
                    null,
                    "Selecione o Sexo do animal", //Mensagem de pergunta 
                    "", //Título da Janela
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);
            
            String sexo = "";
            
            switch(intSexo){
                case 0 -> sexo = "Macho";
                case 1 -> sexo = "Fêmea";
                case -1 -> sexo = "Não informado";
            }
            
            String especie = principal.validarEntradaTexto("Insira a espécie do animal");
            if (especie == null){
                return;
            }
            
            String raca = principal.validarEntradaTexto("Insira a raça do animal");
            if(raca == null){
                return;
            }
            
            String dataNascimento = principal.validarEntradaData("Insira a data de nascimento do animal \n Ex: xx/xx/xxxx");
            if(dataNascimento == null){
                return;
            }
            
            Double peso = principal.validarEntradaDouble("Insira o peso do animal");
            if (peso == null){
                return;
            }
            
            listaAnimais.add(new Animal(codigo, nome, especie, raca, sexo, dataNascimento, peso, tutor));
            taSaida.setText("Animal inserido com sucesso");
            
        }
        
    }//GEN-LAST:event_btnCadastrarAnimalActionPerformed

    private void btnListarAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnimaisActionPerformed
       taSaida.setText("");
        for (Animal a : listaAnimais) {
            if (a instanceof Animal) {
                taSaida.append(a + "\n");
            }
        }
    }//GEN-LAST:event_btnListarAnimaisActionPerformed

    private void btnExcluirAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAnimaisActionPerformed
        int codExcluir = principal.validarEntradaInteiro("Digite o código do animal a ser excluido: ");
        
        Animal petAux = buscarAnimal(codExcluir);
        
        if(petAux == null){
            JOptionPane.showMessageDialog(null, "Animal inexistente!");
        }else{
            listaAnimais.remove(petAux);
            taSaida.setText("Animal removido com sucesso!");
        } 
        
    }//GEN-LAST:event_btnExcluirAnimaisActionPerformed

    private void btnAlterarAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAnimaisActionPerformed
        int alteracao = Integer.parseInt(JOptionPane.showInputDialog("O que deseja alterar?" +
                "\n1 - Nome\n" + 
                "2 - Especie\n" + 
                "3 - Raça\n" + 
                "4 - sexo\n" + 
                "5 - Data de Nascimento\n" + 
                "6 - Peso\n" + 
                "7 - Dono\n\n" + 
                "Digite o número da opção:"
                ));
        
        if(alteracao >= 1 && alteracao <= 7){
            int codPet = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do animal a ser alterado: "));
            Animal petAlterar = buscarAnimal(codPet);
            
            switch (alteracao){
                case 1:
                    String novoNome = principal.validarEntradaTexto("Insira o novo nome");
                    if (novoNome != null){
                        petAlterar.setNome(novoNome);
                    }
                    break;
                case 2: 
                    String novaEspecie = principal.validarEntradaTexto("Insira a nova espécie");
                    if (novaEspecie != null){
                        petAlterar.setEspecie(novaEspecie);
                    }
                    break;
                case 3: 
                    String novaRaca = principal.validarEntradaTexto("Insira a nova raça");
                    if(novaRaca != null){
                        petAlterar.setRaca(novaRaca);
                    }
                    break;
                case 4: 
                    String novoSexo = principal.validarEntradaTexto("Insira o Sexo do animal");
                    if(novoSexo != null){
                        petAlterar.setSexo(novoSexo);
                    }
                    break;
                case 5: 
                    String novaData = principal.validarEntradaData("Insira a data de nascimento ");
                    if(novaData != null){
                        petAlterar.setDataNascimento(novaData);
                    }
                    break;
                case 6:
                    //ATENÇÂO IMPORTANTE = o valor double recebido dessa validação abaixo TEM que ser com letra D >Maiúscula< pois double não aceita um valor null na verificação
                    Double novoPeso = principal.validarEntradaDouble("Insira o novo peso do animal");
                    if (novoPeso != null){
                        petAlterar.setPeso(novoPeso);
                    }
                    break;
                case 7:
                    int tutor = principal.validarEntradaInteiro("Insira o Id do novo tutor do animal");
                    Tutor novoTutor = buscarTutor(tutor);
                    if(novoTutor != null){
                        petAlterar.setDono(novoTutor);
                    }
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Opção inválida");
        }
    }//GEN-LAST:event_btnAlterarAnimaisActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAnimais;
    private javax.swing.JToggleButton btnCadastrarAnimal;
    private javax.swing.JButton btnExcluirAnimais;
    private javax.swing.JButton btnListarAnimais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
