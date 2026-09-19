<html>
    <head>
        <title>atividadephp04</title>
        <meta charset="utf-8"/>
    </head>
    <body> 
        <?php
            $n1 = 3;
            $n2 = 2;
            echo "A soma vale " . ($n1 + $n2) . "<br>";
            echo "A subtração vale " . ($n1 - $n2) . "<br>";
            echo "A multiplicação vale " . ($n1 * $n2) . "<br>";
            echo "A divisão vale " . ($n1 / $n2) . "<br>";
            echo "O módulo vale " . ($n1 % $n2) . "<br>";
            echo "<br>e " . ($n1 + $n2);
            if ($n1 > $n2) {
                echo " eu não sei";
            } else {
                echo " eu sei";
            }
        ?>
		<button class="botao" onclick="inserirValor('1')">1</button>
    </body>
</html>

