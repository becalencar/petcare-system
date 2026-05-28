package telas;

// import das classes
import classes.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FormPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPrincipal.class.getName());
    final ArrayList<Animal> listaAnimais = new ArrayList();
    final ArrayList<Tutor> listaTutores = new ArrayList();
    final ArrayList<Funcionario> listaFuncionarios = new ArrayList();
    final ArrayList<Prontuario> listaProntuarios = new ArrayList();
    final ArrayList<Categoria> listaCategorias = new ArrayList();

    public FormPrincipal() {
        initComponents();
        inserirDireto();
    }

    public String validarEntradaTexto(String mensagem) { //validação geral para a entrada de >>>STRING<<<
        String texto = JOptionPane.showInputDialog(mensagem);

        if (texto == null || texto.isBlank()) {
            JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
            return null;
        }
        return texto;
    }

    public Integer validarEntradaInteiro(String mensagem) { //validação geral para a entrada de números >>>INTEIROS<<<

        String texto = JOptionPane.showInputDialog(mensagem);

        if (texto == null || texto.isBlank()) {
            JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
            return null;
        }

        try {
            return Integer.parseInt(texto);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
            return null;
        }
    }
    
    
    public Double validarEntradaDouble(String mensagem){ //validação geral para a entrada de números >>>DOUBLE<<<

    String texto = JOptionPane.showInputDialog(mensagem);

    if (texto == null || texto.isBlank()){
        JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
        return null;
    }

    texto = texto.replace(",", "."); //troca a virgula por um ponto, caso o usuário insira 10,5 o valor é convertido para 10.5 

    try{
        return Double.parseDouble(texto);

    } catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
        return null;
    }
}

    public Animal buscarAnimalCodigo(int idAnimal) {

        for (Animal a : listaAnimais) {
            if (a.getIdAnimal() == idAnimal) {
                return a;
            }
        }

        return null;
    }

    public boolean telefoneValido(String num) {
        return (num.length() == 11); //retorna True caso o telefone seja válido (11 dígitos)
    }

    public Tutor buscarTutorCodigo(int idTutor) {

        for (Tutor t : listaTutores) {
            if (t.getIdTutor() == idTutor) {
                return t;
            }
        }

        return null;
    }

    public Funcionario buscarFuncionarioCodigo(int codFuncionario) {

        for (Funcionario f : listaFuncionarios) {
            if (f.getCodFuncionario() == codFuncionario) {
                return f;
            }
        }

        return null;
    }

    public Prontuario buscarProntuarioCodigo(int codProntuario) {    // busca o prontuário pelo cod dos prontuários existentes

        for (Prontuario p : listaProntuarios) {
            if (p.getCodProntuario() == codProntuario) {
                return p;
            }
        }

        return null;
    }

    public Prontuario buscarProntuarioAnimal(int idAnimal) {    // busca pelo id do animal

        for (Prontuario p : listaProntuarios) {
            if (p.getAnimal().getIdAnimal() == idAnimal) {
                return p;
            }
        }

        return null;
    }

    public Categoria buscarCategoriaCodigo(int codCategoria) {

        for (Categoria c : listaCategorias) {
            if (c.getCodCategoria() == codCategoria) {
                return c;
            }
        }

        return null;
    }

    // verifica a cada prontuário cada procedimento registrado
    public Procedimento buscarProcedimentoCodigo(int codProcedimento) {

        for (Prontuario p : listaProntuarios) {
            for (Procedimento p2 : p.getListaProcedimentos()) {
                if (p2.getCodProcedimento() == codProcedimento) {
                    return p2;
                }
            }
        }

        return null;
    }

    public void inserirDireto() {
        // funcionarios
        ArrayList<String> tels1 = new ArrayList();
        tels1.add("99123465783");
        tels1.add("63912678490");

        Recepcionista func1 = new Recepcionista(12026, "Ana Banana", tels1);
        listaFuncionarios.add(func1);

        ArrayList<String> tels2 = new ArrayList();
        tels2.add("63923409648");

        Veterinario func2 = new Veterinario(22026, "Rone Marrone", tels2, "263463", "Dermatologista");
        listaFuncionarios.add(func2);

        ArrayList<String> tels3 = new ArrayList();
        tels3.add("62394710264");
        tels3.add("48210275942");
        tels3.add("63251983745");

        Recepcionista func3 = new Recepcionista(32026, "Elis Feliz", tels3);
        listaFuncionarios.add(func3);

        // tutores
        Tutor tutor1 = new Tutor("Maria Catita", 1, "99991449730");

        listaTutores.add(tutor1);
        Animal cachorro = new Animal(1, "Amora", "Chachorro", "Vira-Lata", "Fêmea", "04/02/2026", 12.3, tutor1);
        Tutor tutor2 = new Tutor("Louro José", 2, "98263789176");
        tutor2.setAnimal(cachorro);
        listaTutores.add(tutor2);

        // animais
        Animal animal1 = new Animal(1, "Amora", "Cachorro", "Vira-Lata", "Fêmea", "04/02/2026", 12.3, tutor1);
        Animal animal2 = new Animal(2, "Regina", "Gato", "Siamês", "Fêmea", "10/12/2025", 1.23, tutor2);
        Animal animal3 = new Animal(3, "Gisele Pinscher", "Cachorro", "Pinscher(Satanás)", "Fêmea", "05/01/2024", 1.48, tutor2);

        listaAnimais.add(animal1);
        listaAnimais.add(animal2);
        listaAnimais.add(animal3);

        // categorias
        Categoria cat1 = new Categoria(1, "Tosa");
        Categoria cat2 = new Categoria(2, "Banho");

        // prontuários
        Prontuario pront1 = new Prontuario(1, animal1);
        Prontuario pront2 = new Prontuario(2, animal2);

        listaProntuarios.add(pront1);
        listaProntuarios.add(pront2);

        pront1.inserirProcedimento(1, "Tosa", "04/05/2026", 90.5, func2, cat1, "Teste");
        pront1.inserirProcedimento(2, "Banho", "24/04/2026", 50, func2, cat2, "");
        pront2.inserirProcedimento(1, "Banho", "03/03/2026", 50, func2, cat2, ""); // código repetido, animal diferente
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gerenciarVets = new javax.swing.JButton();
        gerenciarAnms = new javax.swing.JButton();
        btnGerenciarTutores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        printObjs = new javax.swing.JButton();
        gerenciarPronts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gerenciarVets.setText("Gerenciar Veterinário");
        gerenciarVets.addActionListener(this::gerenciarVetsActionPerformed);

        gerenciarAnms.setText("Gerenciar Animal");
        gerenciarAnms.addActionListener(this::gerenciarAnmsActionPerformed);

        btnGerenciarTutores.setText("Gerenciar Tutores");
        btnGerenciarTutores.addActionListener(this::btnGerenciarTutoresActionPerformed);

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        printObjs.setText("Imprimir Objetos");
        printObjs.addActionListener(this::printObjsActionPerformed);

        gerenciarPronts.setText("Gerenciar Prontuário");
        gerenciarPronts.addActionListener(this::gerenciarProntsActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(printObjs, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnGerenciarTutores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gerenciarAnms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gerenciarVets, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gerenciarPronts)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(gerenciarVets)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gerenciarAnms)
                    .addComponent(gerenciarPronts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerenciarTutores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printObjs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerenciarVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarVetsActionPerformed
        FormVeterinario telaVeterinario = new FormVeterinario(this, true, listaFuncionarios);
        telaVeterinario.setVisible(true);
    }//GEN-LAST:event_gerenciarVetsActionPerformed

    private void gerenciarAnmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarAnmsActionPerformed
        FormAnimais telaAnimais = new FormAnimais(this, true, listaAnimais, listaTutores);
        telaAnimais.setVisible(true);
    }//GEN-LAST:event_gerenciarAnmsActionPerformed

    private void btnGerenciarTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarTutoresActionPerformed
        FormTutores telaTutores = new FormTutores(this, true, listaAnimais, listaTutores);
        telaTutores.setVisible(true);
    }//GEN-LAST:event_btnGerenciarTutoresActionPerformed

    private void printObjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printObjsActionPerformed

        taSaida.setText("Tutores: \n");
        for (Tutor t : listaTutores) {
            taSaida.append(t + "\n");
        }
        taSaida.append("\nFuncionarios: \n");
        for (Funcionario f : listaFuncionarios) {
            taSaida.append(f + "\n");
        }
        taSaida.append("\nAnimais: \n");
        for (Animal a : listaAnimais) {
            taSaida.append(a + "\n");
        }

    }//GEN-LAST:event_printObjsActionPerformed

    private void gerenciarProntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarProntsActionPerformed
        FormProntuario telaProntuario = new FormProntuario(this, true, listaProntuarios, listaCategorias);
        telaProntuario.setVisible(true);
    }//GEN-LAST:event_gerenciarProntsActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new FormPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGerenciarTutores;
    private javax.swing.JButton gerenciarAnms;
    private javax.swing.JButton gerenciarPronts;
    private javax.swing.JButton gerenciarVets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printObjs;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
