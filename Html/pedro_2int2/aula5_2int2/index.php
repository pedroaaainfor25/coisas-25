<html>
    <head>
        <title>atividadephp05</title>
        <meta charset="utf-8"/>    
    </head>
        <body> 
            <div>
                <?php
                      $preco = $_GET ["P"];
                      echo "o preço do produto e de R$ $preco";
                      $preco = $preco + ($preco*10/100);
                      echo "<br>e o novo preco com 10";
                ?>
            </div>
        </body>
</html>