package telas;

import classes.Animal;
import classes.Tutor;
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarAnimal = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        btnListarAnimais = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCadastrarAnimal.setText("Inserir Animal");
        btnCadastrarAnimal.addActionListener(this::btnCadastrarAnimalActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        btnListarAnimais.setText("Listar Animais");
        btnListarAnimais.addActionListener(this::btnListarAnimaisActionPerformed);

        jButton1.setText("Excluir Animal");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Alterar Animal");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarAnimais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListarAnimais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarAnimalActionPerformed
        int codigo = 1 + listaAnimais.size();
        
        int codTutor = principal.validarEntradaInteiro("Insira o código do tutor: ");
        Tutor tutor = buscarTutor(codTutor);
        
        if (tutor == null) {
            JOptionPane.showMessageDialog(null, "Tutor inexistente!");
        
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
                    "Selecione o Sexo do animal",
                    "Sexo",
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int codExcluir = principal.validarEntradaInteiro("Digite o código do animal a ser excluido: ");
        
        Animal petAux = buscarAnimal(codExcluir);
        
        if(petAux == null){
            JOptionPane.showMessageDialog(null, "Animal inexistente!");
        }else{
            listaAnimais.remove(petAux);
            taSaida.setText("Animal removido com sucesso!");
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrarAnimal;
    private javax.swing.JButton btnListarAnimais;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
