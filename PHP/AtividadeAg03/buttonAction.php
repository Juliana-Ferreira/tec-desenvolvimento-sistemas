<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <title>Mensagem</title>
</head>
<body>
    <div class="w3-container w3-teal">
        <h1>
            <?php
                $valorCompra = $_POST['txtValorCompra'];
                $formaPgto = $_POST['cmbPag'];
                $desconto;

                    if($formaPgto == "deposito") { 
                        $formaPgto = "Depósito";
                        $desconto = 10;
                    } elseif($formaPgto == "boleto") { 
                        $formaPgto = "Boleto";
                        $desconto = 8; 
                    } else { 
                        $formaPgto = "Cartão de Crédito";
                        $desconto = 0;
                    }

                    echo "Promoção de mês de aniversário! <br>";
                    echo "".$_POST['txtNome']."! <br>"; 
                    echo "Valor da compra sem desconto: R$".$valorCompra ."<br>";
                    echo "Forma de pagamento escolhida: ".$formaPgto ."<br>";
                    echo "Desconto: ".$desconto."%<br>";
                    echo "Você economizou: R$".($valorCompra * $desconto / 100) ."<br>";
                    echo "Valor à pagar: R$".($valorCompra - ($valorCompra * $desconto / 100))."<br>"; 
            ?>
        </h1>
    </div>
 </body>
 </html