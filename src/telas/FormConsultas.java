package telas;
import java.util.ArrayList;
import classes.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FormConsultas extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormConsultas.class.getName());
    FormPrincipal principal;
    ArrayList<Consulta> listaConsultas = new ArrayList();

    public FormConsultas(java.awt.Frame parent, boolean modal, ArrayList<Consulta> listaConsultas) {
        super(parent, modal);
        initComponents();
        this.listaConsultas = listaConsultas;
        principal = (FormPrincipal) this.getParent();
        getContentPane().setBackground(new Color(193, 222, 221)); //define a cor de fundo do JForm
        taSaida.setBackground(new Color(242, 245, 245)); //define a cor do fundo do taSaida
    }
    
    private boolean verificarDisponibilidade(int codVet,int codAnimal, String data, String hora){
       
        for(Consulta c : listaConsultas){
            if(c.getHoraConsulta().equalsIgnoreCase(hora) && c.getDtConsulta().equalsIgnoreCase(data)){
                if(c.getAnimal().getIdAnimal() == codAnimal){
                    return false;
                } else if (c.getVeterinario().getCodFuncionario() == codVet){
                    return false;
                }
            }
        }
        return true;
    }
    
    private Consulta buscarConsulta(Integer cod){
        for(Consulta c : listaConsultas){
            if(c.getCodConsulta() == cod){
                return c;
            }
        }
        return null;
    }
    
    private String retornarConsultasAnimal(int codAnimal){
        String retorno = "Todas as consultas do pet:\n";
        int contador = 1;
        
        for(Consulta c : listaConsultas){
            if(c.getAnimal().getIdAnimal() == codAnimal){
                retorno += contador
                        + " = Data da Consulta: " + c.getDtConsulta() 
                        + " | Hora: " + c.getHoraConsulta()
                        + " | Valor: " + c.getValorConsulta()
                        + " | Veterinario(a): " + c.getVeterinario().getNomeFuncionario()
                        + " | Código: " + c.getCodConsulta()
                        + "\n";
                contador +=1;
            }
        }
        if (retorno == "Todas as consultas do pet:\n"){
            retorno = "Não há consultas registradas para este animal";
        }
        return retorno;
    }
    
    private String retornarConsultas(){
        String retorno = "Todas as consultas do Veterinário:\n";
        int contador = 1;
        
        for (Consulta c : listaConsultas) {
            retorno += contador
                    + " = Data: " + c.getDtConsulta()
                    + " | Hora: " + c.getHoraConsulta()
                    + " | Animal: " + c.getAnimal().getNome()
                    + " | Tutor(a): " + c.getAnimal().getDono().getNome()
                    + " | Anamnese: " + c.getDiagnostico()
                    + " | Código: " + c.getCodConsulta()
                    + "\n";
            contador += 1;

        }
        return retorno;
    }
    
    private String retornarConsultasVet(int codVet){
        String retorno = "Todas as consultas do Veterinário:\n";
        int contador = 1;
        
        for(Consulta c : listaConsultas){
            if(c.getVeterinario().getCodFuncionario() == codVet){
                retorno += contador
                        + " = Data: " + c.getDtConsulta() 
                        + " | Hora: " + c.getHoraConsulta()
                        + " | Animal: " + c.getAnimal().getNome()
                        + " | Tutor(a): " + c.getAnimal().getDono().getNome()
                        + " | Anamnese: " + c.getDiagnostico()
                        + " | Código: " + c.getCodConsulta()
                        + "\n";
                contador +=1;

            }
        }
        if (retorno == "Todas as consultas do Veterinário:\n"){
            retorno = "Não há consultas registradas para este Veterinário";
        }
        return retorno;
    }
    
    private String retornarConsultasData(String dtConsulta){
         String retorno = "Todas as consultas na data " + dtConsulta+":\n";
         int contador = 1;
         
         for (Consulta c : listaConsultas) {
            if (c.getDtConsulta().equalsIgnoreCase(dtConsulta)) {
                retorno += contador
                        + " = Hora da Consulta: " + c.getHoraConsulta()
                        + " | Animal: " + c.getAnimal().getNome()
                        + " | Tutor(a): " + c.getAnimal().getDono().getNome()
                        + " | Veterinario(a): " + c.getVeterinario().getNomeFuncionario()
                        + " | Anamnese: " + c.getDiagnostico()
                        + " | Valor: " + c.getValorConsulta()
                        + " | Código: " + c.getCodConsulta()
                        + "\n";
                contador += 1;
            }
        }
         
         if (retorno == "Todas as consultas na data " + dtConsulta+":\n"){
            retorno = "Não há consultas registradas neste dia";
        }
         
        return retorno;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSaida = new javax.swing.JTextArea();
        insertConsults = new javax.swing.JButton();
        updateConsults = new javax.swing.JButton();
        listConsults = new javax.swing.JButton();
        removeConsults = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/Imagens/PetCare.png"))); // NOI18N

        taSaida.setColumns(20);
        taSaida.setRows(5);
        jScrollPane1.setViewportView(taSaida);

        insertConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        insertConsults.setText("Registrar Consulta");
        insertConsults.addActionListener(this::insertConsultsActionPerformed);

        updateConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateConsults.setText("Editar Consulta");
        updateConsults.addActionListener(this::updateConsultsActionPerformed);

        listConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listConsults.setText("Listar Consultas");
        listConsults.addActionListener(this::listConsultsActionPerformed);

        removeConsults.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        removeConsults.setText("Excluir Consulta");
        removeConsults.addActionListener(this::removeConsultsActionPerformed);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel2.setText("Gerenciar Consultas");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setText("Limpar tela");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(updateConsults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(listConsults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeConsults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insertConsults, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(1029, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(insertConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeConsults, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertConsultsActionPerformed
        int codigo = principal.gerarIdConsulta();
        
       
        Integer idAnimal = principal.validarEntradaInteiro("Insira o código do animal:");
        // verificando se a entrada digitada pelo usuário é válida
        if (idAnimal == null) {
            return;
        }
        
        // verificando se o animal existe
        Animal animal = principal.buscarAnimalCodigo(idAnimal);
        if (animal == null) {
            JOptionPane.showMessageDialog(null, "Animal inexistente! A operação será cancelada.");
            return;
            // Sugestão: adicionar pergunta para cadastro de animal * assinado: @rebeca
        }

        Integer idVeterinario = principal.validarEntradaInteiro("Insira o código do veterinário:");
        if (idVeterinario == null) {
            return;
        }
        
        Funcionario veterinario = principal.buscarFuncionarioCodigo(idVeterinario);
        if (veterinario == null || !(veterinario instanceof Veterinario)) {
            JOptionPane.showMessageDialog(null, "Veterinário inexistente! A operação será cancelada.");
            return;
            // Sugestão: adicionar pergunta para cadastro de veterinário * assinado @rebeca
        }
        
        String dtConsulta = principal.validarEntradaData("Data da consulta: ");
        if (dtConsulta == null) {
            return;
        }
        
        String horaConsulta = principal.validarEntradaHora("Horário da consulta:");
        if (horaConsulta == null) {
            return;
        }
        
        String diagnostico = principal.validarEntradaTexto("Diagnóstico do paciente:");
        if (diagnostico == null) {
            return;
        }
        
        Double vlConsulta = principal.validarEntradaDouble("Valor da consulta:");
        if (vlConsulta == null) {
            return;
        }
        
        int confirmacao = JOptionPane.showConfirmDialog (
                null,
                "Deseja finalizar o registro da consulta " + codigo + '?',
                "Confirmção",
                JOptionPane.YES_NO_OPTION
        );
        
        if (confirmacao == JOptionPane.YES_OPTION) {
            Veterinario v = (Veterinario) veterinario;
            if (verificarDisponibilidade(idVeterinario, idAnimal, dtConsulta, horaConsulta)) { //verifica a disponibilidade de horario
                listaConsultas.add(new Consulta(codigo, animal, v, dtConsulta, horaConsulta, diagnostico, vlConsulta));
                taSaida.setText("Consulta registrada!");
            } else{
                JOptionPane.showMessageDialog(null, "Data/hora da consulta não disponível");
                return;
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
            return;
        }
    }//GEN-LAST:event_insertConsultsActionPerformed

    private void updateConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateConsultsActionPerformed
        Integer cod = principal.validarEntradaInteiro("Insira o código da consulta a ser alterada: ");
        if (cod == null) {
            return;
        }
        Consulta consultaAux = buscarConsulta(cod);
        if (consultaAux == null){
            JOptionPane.showMessageDialog(null, "Consulta inexistente!");
            return;
        }
        
        Object[] opcoes = {
            "Alterar Animal",
            "Alterar veterinário",
            "Alterar Data",
            "Alterar Hora",
            "Alterar Valor",
            "Alterar Observações"
        }; //define as opções do pop up

        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "O que deseja alterar?",
                "Alteração",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        switch (escolha){
            case "Alterar Animal" -> {
                Integer idAnimal = principal.validarEntradaInteiro("Insira o código do animal antigo:"); //entrada do cod
                if (idAnimal == null) { 
                    return;
                }
                Animal animal = principal.buscarAnimalCodigo(idAnimal); //validação
                if (animal == null) {
                    JOptionPane.showMessageDialog(null, "Animal inexistente! A operação será cancelada.");
                    return;
                }
                Integer idNewAnimal = principal.validarEntradaInteiro("Insira o código do novo animal:");//entrada do cod
                if (idNewAnimal == null) {
                    return;
                }

                Animal newAnimal = principal.buscarAnimalCodigo(idNewAnimal);//validação
                if (newAnimal == null) {
                    JOptionPane.showMessageDialog(null, "Animal inexistente! A operação será cancelada.");
                    return;
                }
                
                consultaAux.setAnimal(newAnimal); //troca o animal
                taSaida.setText("");
                taSaida.append("Animal alterado com sucesso, Agora a consulta pertence à: " + newAnimal.getNome()); //confirmação visual
            }
            
            case "Alterar veterinário" -> {
                Integer idVet = principal.validarEntradaInteiro("Insira o código do veterinário antigo:");
                if (idVet == null) {
                    return;
                }
                Funcionario vet = principal.buscarFuncionarioCodigo(idVet);
                if(!(vet instanceof Veterinario) || vet == null){ //verifica se o código é de um veterinário
                    JOptionPane.showMessageDialog(null, "Veterinário não encontrado! A operação será cancelada.");
                    return;
                }
                
                Integer idNewVet = principal.validarEntradaInteiro("Insira o código do novo veterinário");
                if(idNewVet == null){
                    return;
                }
                Funcionario newVet = principal.buscarFuncionarioCodigo(idNewVet);
                if(!(newVet instanceof Veterinario)){ //verifica se o código é de um veterinário
                    JOptionPane.showMessageDialog(null, "Veterinário não encontrado! A operação será cancelada.");
                    return;
                }
                
                Veterinario v = (Veterinario) newVet;
                consultaAux.setVeterinario(v);
                taSaida.setText("");
                taSaida.append("Veterinário alterado com sucesso, o novo Veterinário(a) é o(a): " + v.getNomeFuncionario());
            }
            
            case "Alterar Data" -> {
                String data = principal.validarEntradaData("Insira a nova data da consulta: ");
                if (data == null) {
                    return;
                }
                boolean verificador = verificarDisponibilidade(
                        consultaAux.getVeterinario().getCodFuncionario(),
                        consultaAux.getAnimal().getIdAnimal(), 
                        consultaAux.getDtConsulta(), 
                        consultaAux.getHoraConsulta()
                );
                if (verificador == true) {
                    consultaAux.setDtConsulta(data);
                    taSaida.setText("");
                    taSaida.append("Data alterada com sucesso, a nova data é: " + consultaAux.getDtConsulta());
                }else{
                    JOptionPane.showMessageDialog(null, "Data/hora da consulta não disponível");
                    return;
                }
            }
            
            case "Alterar Hora" -> {
                String newHora = principal.validarEntradaHora("Insira o Novo horário da consulta:");
                if (newHora == null) {
                    return;
                }
                //if(verificarDisponibilidade(int codVet,int codAnimal, String data, String hora))
                boolean verificador = verificarDisponibilidade(
                        consultaAux.getVeterinario().getCodFuncionario(),
                        consultaAux.getAnimal().getIdAnimal(), 
                        consultaAux.getDtConsulta(), 
                        consultaAux.getHoraConsulta()
                );
                if(verificador == true){
                    consultaAux.setHoraConsulta(newHora);
                    taSaida.setText("");
                    taSaida.append("Horário alterado com sucesso, novo Horario: " + consultaAux.getHoraConsulta());
                }else{
                    JOptionPane.showMessageDialog(null, "Data/hora da consulta não disponível");
                    return;
                }
            }
        }
        
    }//GEN-LAST:event_updateConsultsActionPerformed

    private void listConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listConsultsActionPerformed
        Object[] opcoes = {"Listar por Animal", "Listar por Veterinário", "Listar por Data", "Listar por código", "Listar Todas"}; //define as opções do pop up

        String escolha = (String) JOptionPane.showInputDialog(
                null,
                "Como Deseja Listar as consultas",
                "Tipo de Atendimento",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        
        switch (escolha) {
            case "Listar por Animal" -> {
                Integer cod = principal.validarEntradaInteiro("Insira o código do animal");
                if (cod == null) {
                    return;
                } else if (principal.buscarAnimalCodigo(cod) == null) {
                    JOptionPane.showMessageDialog(null, "Animal Inexistente");
                    return;
                }
                taSaida.setText("");
                taSaida.append(retornarConsultasAnimal(cod));
            }
            case "Listar por Veterinário" -> {
                Integer cod = principal.validarEntradaInteiro("Insira o código do veterinário");
                if (cod == null) {
                    return;
                }
                Funcionario veterinario = principal.buscarFuncionarioCodigo(cod);
                if (veterinario == null || !(veterinario instanceof Veterinario)) {
                    JOptionPane.showMessageDialog(null, "Veterinário inexistente! A operação será cancelada.");
                    return;
                }
                taSaida.setText("");
                taSaida.append(retornarConsultasVet(cod));
            }
            case "Listar por Data" -> {
                String data = principal.validarEntradaData("Insira a data desejada"); //adicionar um filtro para filtrar por intervalo de data
                if (data == null) {
                    return;
                }
                taSaida.setText("");
                taSaida.append(retornarConsultasData(data));
            }
            case "Listar por código" -> {
                Integer cod = principal.validarEntradaInteiro("Insira o código da consulta");
                if(cod == null){
                    return;
                }
                Consulta consultaAux = buscarConsulta(cod);
                if(consultaAux != null){
                    taSaida.setText("");
                    taSaida.append(consultaAux.toString());
                }
                
            }
            case "Listar Todas" -> {
                taSaida.setText("");
                taSaida.append(retornarConsultas());
            }
            default ->
                JOptionPane.showMessageDialog(null, "ERRO, selecione uma das opções e tente novamente");
        }
    }//GEN-LAST:event_listConsultsActionPerformed

    private void removeConsultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeConsultsActionPerformed
        Integer cod = principal.validarEntradaInteiro("Insira o código da consulta a ser excluida: ");
        if(cod == null){
            return;
        }
        Consulta consultaAux = buscarConsulta(cod);
        
        if (consultaAux != null){
            listaConsultas.remove(consultaAux);
            taSaida.setText("Consulta excluida com sucesso!");
        } else{
            JOptionPane.showMessageDialog(null, "Consulta inexistente!");
        }
    }//GEN-LAST:event_removeConsultsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        taSaida.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insertConsults;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listConsults;
    private javax.swing.JButton removeConsults;
    private javax.swing.JTextArea taSaida;
    private javax.swing.JButton updateConsults;
    // End of variables declaration//GEN-END:variables
}
