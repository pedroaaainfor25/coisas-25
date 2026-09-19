<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8"/>
        <title>aula06</title>
    </head>
    <body>
          <div>
                <?php
                       $ano = $_GET["aa"];
                     echo "o ano atual e $ano";
                     echo "o ano anterior e ". --$ano;
                 ?>
        </div>
    </body>
</html>