<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Produtos</title>
</head>
<body>
    <h1>Lista de Produtos</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Preço</th>
                <th>Descrição</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="produto" items="${listaProdutos}">
                <tr>
                    <td><c:out value="${produto.nome}" /></td>
                    <td><c:out value="${produto.preco}" /></td>
                    <td><c:out value="${produto.descricao}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>