package telas;

// import das classes
import classes.*;
import java.awt.Color; //permite alterar a cor do plano de fundo do JForm e JDialog
import java.util.ArrayList;
import javax.swing.*;

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
        getContentPane().setBackground(new Color(232, 180, 184)); //define a cor de fundo do JForm
        taSaida.setBackground(new Color(168, 187, 163)); //define a cor do fundo do taSaida
        
    }

    //Funções de gerar ID's
    /*  
        iremos inserir alguns padrões de prefixo para padronização dos Id's/codigos
    LEGENDA: 
        Tutor           1000+
        Animal          2000+
        Funcionário	3000+
        Prontuário	4000+        
     */

    public int gerarIdTutor() {
        int maiorId = 1001;

        for (Tutor t : listaTutores) {
            if (t.getIdTutor() > maiorId) {
                maiorId = t.getIdTutor();
            }
        }
        return maiorId + 1;
    }

    public int gerarIdAnimal() {
        int maiorId = 2001;

        for (Animal a : listaAnimais) {
            if (a.getIdAnimal() > maiorId) {
                maiorId = a.getIdAnimal();
            }
        }
        return maiorId += 1;
    }

    public int gerarIdFuncionario() {
        int maiorId = 3001;

        for (Funcionario f : listaFuncionarios) {
            if (f.getCodFuncionario() > maiorId) {
                maiorId = f.getCodFuncionario();
            }
        }
        return maiorId += 1;
    }

    public int gerarIdProntuario() {
        int maiorId = 4001;

        for (Prontuario p : listaProntuarios) {
            if (p.getCodProntuario() > maiorId) {
                maiorId = p.getCodProntuario();
            }
        }
        return maiorId += 1;
    }

    public int gerarIdCategoria() {//essa não tem prefixo
        int maiorId = 1;

        for (Categoria c : listaCategorias) {
            if (c.getCodCategoria() > maiorId) {
                maiorId = c.getCodCategoria();
            }
        }
        return maiorId += 1;
    }

    //Funções de Validação
    //--------------------------------------------------//
    public String validarEntradaData(String mensagem) { //validação geral para a entrada de >>>DATAS<<<
        String texto = JOptionPane.showInputDialog(mensagem);

        if (texto == null || texto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
            return null;
        } else if (texto.matches("\\d{2}/\\d{2}/\\d{4}")) { //o valor TEM que ser XX/XX/XXX (X é um número inteiro)
            return texto;
        }

        JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
        return null;
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

    public Double validarEntradaDouble(String mensagem) { //validação geral para a entrada de números >>>DOUBLE<<<

        String texto = JOptionPane.showInputDialog(mensagem);

        if (texto == null || texto.isBlank()) {
            JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
            return null;
        }

        texto = texto.replace(",", "."); //troca a virgula por um ponto, caso o usuário insira 10,5 o valor é convertido para 10.5 

        try {
            return Double.parseDouble(texto);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR 395! \n  Valor inválido");
            return null;
        }

    }

    public boolean telefoneValido(String num) {
        return (num.length() == 11); //retorna True caso o telefone seja válido (11 dígitos)
    }

    //Funções de Busca
    //--------------------------------------------------//
    public Animal buscarAnimalCodigo(int idAnimal) {
        
        for (Animal a : listaAnimais) {
            if (a.getIdAnimal() == idAnimal) {
                return a;
            }
        }

        return null;
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

    //--------------------------------------------------------------------//
    public void inserirDireto() {
        // funcionarios
        ArrayList<String> tels1 = new ArrayList();
        tels1.add("99123465783");
        tels1.add("63912678490");

        Recepcionista func1 = new Recepcionista(3001, "Ana Banana", tels1);
        listaFuncionarios.add(func1);

        ArrayList<String> tels2 = new ArrayList();
        tels2.add("63923409648");

        Veterinario func2 = new Veterinario(3002, "Rone Marrone", tels2, "263463", "Dermatologista");
        listaFuncionarios.add(func2);

        ArrayList<String> tels3 = new ArrayList();
        tels3.add("62394710264");
        tels3.add("48210275942");
        tels3.add("63251983745");

        Recepcionista func3 = new Recepcionista(3003, "Elis Feliz", tels3);
        listaFuncionarios.add(func3);

        ArrayList<String> tels4 = new ArrayList();
        tels4.add("63988887777");

        Veterinario func4 = new Veterinario(3004, "Carlos Vet", tels4, "847392", "Cirurgião");
        listaFuncionarios.add(func4);

        ArrayList<String> tels5 = new ArrayList();
        tels5.add("63977776666");

        Veterinario func5 = new Veterinario(3005, "Marina Pet", tels5, "192837", "Cardiologista");
        listaFuncionarios.add(func5);

        ArrayList<String> tels6 = new ArrayList();
        tels6.add("63966665555");

        Veterinario func6 = new Veterinario(3006, "Julio Animal", tels6, "564738", "Ortopedista");
        listaFuncionarios.add(func6);

        // tutores
        Tutor tutor1 = new Tutor("Maria Catita", 1001, "99991449730");
        Tutor tutor2 = new Tutor("Louro José", 1002, "98263789176");
        Tutor tutor3 = new Tutor("Fernanda Lima", 1003, "63999887766");

        listaTutores.add(tutor1);
        listaTutores.add(tutor2);
        listaTutores.add(tutor3);

        // animais
        Animal animal1 = new Animal(2001, "Amora", "Cachorro", "Vira-Lata", "Fêmea", "04/02/2026", 12.3, tutor1);

        Animal animal2 = new Animal(2002, "Regina", "Gato", "Siamês", "Fêmea", "10/12/2025", 1.23, tutor2);

        Animal animal3 = new Animal(2003, "Gisele Pinscher", "Cachorro", "Pinscher", "Fêmea", "05/01/2024", 1.48, tutor2);

        Animal animal4 = new Animal(2004, "Thor", "Cachorro", "Pastor Alemão", "Macho", "12/09/2023", 30.5, tutor3);

        Animal animal5 = new Animal(2005, "Mingau", "Gato", "Persa", "Macho", "08/06/2025", 3.7, tutor3);

        listaAnimais.add(animal1);
        listaAnimais.add(animal2);
        listaAnimais.add(animal3);
        listaAnimais.add(animal4);
        listaAnimais.add(animal5);

        tutor1.setAnimal(animal1);

        tutor2.setAnimal(animal2);
        tutor2.setAnimal(animal3);

        tutor3.setAnimal(animal4);
        tutor3.setAnimal(animal5);

        // categorias
        Categoria cat1 = new Categoria(1, "Tosa");
        Categoria cat2 = new Categoria(2, "Banho");
        Categoria cat3 = new Categoria(3, "Consulta");
        Categoria cat4 = new Categoria(4, "Vacinação");

        listaCategorias.add(cat1);
        listaCategorias.add(cat2);
        listaCategorias.add(cat3);
        listaCategorias.add(cat4);

        // prontuarios
        Prontuario pront1 = new Prontuario(4001, animal1);
        Prontuario pront2 = new Prontuario(4002, animal2);
        Prontuario pront3 = new Prontuario(4003, animal3);
        Prontuario pront4 = new Prontuario(4004, animal4);
        Prontuario pront5 = new Prontuario(4005, animal5);

        listaProntuarios.add(pront1);
        listaProntuarios.add(pront2);
        listaProntuarios.add(pront3);
        listaProntuarios.add(pront4);
        listaProntuarios.add(pront5);

        // procedimentos
        pront1.inserirProcedimento(5001, "Tosa", "04/05/2026", 90.5, func2, cat1, "Animal muito agitado");

        pront1.inserirProcedimento(5002, "Banho", "24/04/2026", 50, func2, cat2, "");

        pront2.inserirProcedimento(5003, "Consulta", "03/03/2026", 120, func4, cat3, "Suspeita de alergia");

        pront3.inserirProcedimento(5004, "Vacinação", "15/02/2026", 80, func5, cat4, "Vacina V10");

        pront4.inserirProcedimento(5005, "Consulta", "21/01/2026", 150, func6, cat3, "Dor na pata traseira");

        pront5.inserirProcedimento(5006, "Banho", "11/05/2026", 45, func2, cat2, "");

        pront5.inserirProcedimento(5007, "Vacinação", "13/05/2026", 90, func5, cat4, "Vacina antirrábica");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        gerenciarVets = new javax.swing.JButton();
        gerenciarAnms = new javax.swing.JButton();
        btnGerenciarTutores = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        printObjs = new javax.swing.JButton();
        gerenciarPronts = new javax.swing.JButton();
        gerenciarCat = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão PetCare");
        setForeground(new java.awt.Color(255, 0, 51));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        gerenciarVets.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gerenciarVets.setForeground(new java.awt.Color(0, 0, 0));
        gerenciarVets.setText("Gerenciar Veterinário");
        gerenciarVets.addActionListener(this::gerenciarVetsActionPerformed);

        gerenciarAnms.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gerenciarAnms.setForeground(new java.awt.Color(0, 0, 0));
        gerenciarAnms.setText("Gerenciar Animal");
        gerenciarAnms.addActionListener(this::gerenciarAnmsActionPerformed);

        btnGerenciarTutores.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnGerenciarTutores.setForeground(new java.awt.Color(0, 0, 0));
        btnGerenciarTutores.setText("Gerenciar Tutores");
        btnGerenciarTutores.addActionListener(this::btnGerenciarTutoresActionPerformed);

        taSaida.setColumns(20);
        taSaida.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        printObjs.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        printObjs.setForeground(new java.awt.Color(0, 0, 0));
        printObjs.setText("Imprimir Objetos");
        printObjs.addActionListener(this::printObjsActionPerformed);

        gerenciarPronts.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gerenciarPronts.setForeground(new java.awt.Color(0, 0, 0));
        gerenciarPronts.setText("Gerenciar Prontuário");
        gerenciarPronts.addActionListener(this::gerenciarProntsActionPerformed);

        gerenciarCat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        gerenciarCat.setForeground(new java.awt.Color(0, 0, 0));
        gerenciarCat.setText("Gerenciar Categorias");
        gerenciarCat.addActionListener(this::gerenciarCatActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Limpar tela");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Sair");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel2.setText("Sistema de Gestão para Clinicas Veterinárias");

        jLabel3.setText("v 2.3.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(gerenciarAnms, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(gerenciarPronts, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(gerenciarVets, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(btnGerenciarTutores, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(gerenciarCat, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(printObjs, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(gerenciarVets, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarAnms, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarPronts, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerenciarTutores, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gerenciarCat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(printObjs, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void gerenciarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenciarCatActionPerformed
        FormCategoria telaCategoria = new FormCategoria(this, true, listaCategorias);
        telaCategoria.setVisible(true);
    }//GEN-LAST:event_gerenciarCatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        taSaida.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton gerenciarCat;
    private javax.swing.JButton gerenciarPronts;
    private javax.swing.JButton gerenciarVets;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printObjs;
    private javax.swing.JTextArea taSaida;
    // End of variables declaration//GEN-END:variables
}
