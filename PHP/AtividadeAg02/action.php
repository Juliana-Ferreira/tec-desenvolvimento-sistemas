<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Cadastro confirmado</title>
</head>
<body>
    <div class="w3-container w3-teal">
        <h2>Cadastro confirmado com sucesso!</h2>
        <br>
        <h3>
            <?php
                echo "Nome: ".$_POST['txtNome']."<br>";
                echo "Sobrenome: ".$_POST['txtSobrenome']."<br>";
                echo "Email: ".$_POST['txtEmail']."<br>";
                echo "Formação: ".$_POST['txtFormacao']."<br>";
                echo "Descrição último emprego: ".$_POST['txtEmprego']."<br>";
            ?>
        </h3>
    </div>
</body>
</html>