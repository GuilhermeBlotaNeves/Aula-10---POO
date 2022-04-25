<%-- 
    Document   : index
    Created on : 25 de abr. de 2022, 13:35:00
    Author     : Fatec
--%>


<%@page import="demo.Database"%>
<%@page import="demo.Contato"%>
<%@page import="demo.Data"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
  // Exemplo de declaração , instanciação e definição de um objeto.
     Data hoje;   
       hoje = new Data();
       hoje.setAno(2022);
       hoje.setMes(4);
       hoje.setDia(25);
       System.out.println("Hoje é dia"+ hoje.dia);
       
       Data Amanha = new Data();
       Amanha.setData(26, 4, 2022);
      
       Data nascimento = new Data(8, 3 ,2002);
       
       Data padrao = new Data();
       
       Data errada = new Data(10 , 19  , 2021);
       
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index - POO</title>
    </head>
    <body>
        <h1>POO</h1>
        <h2>Index</h2>
        <hr>
        <h1>Testes com classe Data:</h1>
        <h3>Hoje é dia <%= hoje.getDia()%></h3>
        <h3>Amanha é dia <%= Amanha.getDia() %></h3>
        <h3>Nascimento:<%= nascimento.getData() %></h3>
        <h4>Aniversario:<%= nascimento.getAniversario() %></h4Z
        <h3>Dia Padrão: <%= padrao.getData() %></h3>
        <h3>Dia errada: <%= errada.getData() %></h3>
        <hr>
        <h2>Testes com classe contato</h2>
        <h3>Lista de contatods a partir do método Contato.getList</h3>
        <table border="1">
            <tr><th>Nome</th><th>Telefone</th><th>Aniversario</th></tr>
            <%for(Contato c: Contato.getlist()){%>
            <tr>
                <td><%= c.getNome() %></td>
                <td><%= c.getTelefone()%></td>
                <td><%= c.getNascimento().getAniversario()%></td>
            </tr>
            <%}%>
        </table>
        <hr>
        <h3>Lista de contatos a partir do método Database.getContato</h3>
         <table border="1">
            <tr><th>Nome</th><th>Telefone</th><th>Aniversario</th></tr>
            <%for(Contato c: Database.getContato()){%>
            <tr>
                <td><%= c.getNome() %></td>
                <td><%= c.getTelefone()%></td>
                <td><%= c.getNascimento().getAniversario()%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
